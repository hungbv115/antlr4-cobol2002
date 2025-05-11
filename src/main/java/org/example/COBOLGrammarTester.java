package org.example;

import org.antlr.v4.runtime.*;
import org.example.g4.COBOL2002Lexer;
import org.example.g4.COBOL2002Parser;

import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class COBOLGrammarTester {
    private static final String LOG_DIR = "logs";
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
    private static Path logFile;

    private static class GrammarErrorListener extends BaseErrorListener {
        private final List<String> errors = new ArrayList<>();
        private final String fileName;

        public GrammarErrorListener(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer,
                              Object offendingSymbol,
                              int line,
                              int charPositionInLine,
                              String msg,
                              RecognitionException e) {
            errors.add(String.format("Line %d:%d - %s", line, charPositionInLine, msg));
        }

        public List<String> getErrors() {
            return errors;
        }

        public boolean hasErrors() {
            return !errors.isEmpty();
        }
    }

    public static void main(String[] args) {
        String testDir = "src/main/resources/local";
        try {
            // Create logs directory if it doesn't exist
            Files.createDirectories(Paths.get(LOG_DIR));
            
            // Create log file with timestamp
            String timestamp = LocalDateTime.now().format(DATE_FORMAT);
            logFile = Paths.get(LOG_DIR, "grammar_test_" + timestamp + ".log");
            
            // Write header to log file
            writeToLog("=== COBOL Grammar Test Log ===");
            writeToLog("Test started at: " + LocalDateTime.now());
            writeToLog("Test directory: " + testDir);
            writeToLog("================================\n");

            testAllFiles(testDir);
        } catch (IOException e) {
            String errorMsg = "Error testing files: " + e.getMessage();
            System.err.println(errorMsg);
            writeToLog("ERROR: " + errorMsg);
        }
    }

    private static void testAllFiles(String directory) throws IOException {
        Path dirPath = Paths.get(directory);
        List<Path> cobolFiles = Files.walk(dirPath)
                .filter(path -> path.toString().endsWith(".cbl"))
                .toList();

        Map<String, List<String>> failedFiles = new HashMap<>();
        int totalFiles = cobolFiles.size();
        int successfulFiles = 0;

        String startMsg = "Starting grammar testing...\nTotal COBOL files to test: " + totalFiles;
        System.out.println(startMsg);
        writeToLog(startMsg);

        // Create preprocessor
        COBOLPreprocessor preprocessor = new COBOLPreprocessor();

        // Load copybooks
        loadCopybooks(preprocessor, dirPath);

        for (Path file : cobolFiles) {
            String fileName = file.getFileName().toString();
            String fileMsg = "\nTesting file: " + fileName;
            System.out.println(fileMsg);
            writeToLog(fileMsg);

            try {
                List<String> errors = testFile(file, preprocessor);
                if (!errors.isEmpty()) {
                    failedFiles.put(fileName, errors);
                    writeToLog("  Status: FAILED");
                    for (String error : errors) {
                        writeToLog("  Error: " + error);
                    }
                } else {
                    successfulFiles++;
                    writeToLog("  Status: SUCCESS");
                }
            } catch (Exception e) {
                String errorMsg = "Exception: " + e.getMessage();
                failedFiles.put(fileName, Collections.singletonList(errorMsg));
                writeToLog("  Status: FAILED");
                writeToLog("  " + errorMsg);
            }
        }

        // Print and log summary
        String summary = generateSummary(totalFiles, successfulFiles, failedFiles);
        System.out.println(summary);
        writeToLog("\n" + summary);
    }

    private static String generateSummary(int totalFiles, int successfulFiles, Map<String, List<String>> failedFiles) {
        StringBuilder summary = new StringBuilder();
        summary.append("\n=== Test Summary ===\n");
        summary.append("Total files tested: ").append(totalFiles).append("\n");
        summary.append("Successful: ").append(successfulFiles).append("\n");
        summary.append("Failed: ").append(failedFiles.size()).append("\n");

        if (!failedFiles.isEmpty()) {
            summary.append("\n=== Failed Files ===\n");
            for (Map.Entry<String, List<String>> entry : failedFiles.entrySet()) {
                summary.append("\nFile: ").append(entry.getKey()).append("\n");
                for (String error : entry.getValue()) {
                    summary.append("  ").append(error).append("\n");
                }
            }
        }

        return summary.toString();
    }

    private static void loadCopybooks(COBOLPreprocessor preprocessor, Path dirPath) throws IOException {
        Files.walk(dirPath)
                .filter(path -> path.toString().endsWith(".cpy"))
                .forEach(path -> {
                    try {
                        String content = Files.readString(path);
                        String name = path.getFileName().toString().replace(".cpy", "");
                        preprocessor.addCopyBook(name, content);
                        writeToLog("Loaded copybook: " + name);
                    } catch (IOException e) {
                        String errorMsg = "Error loading copybook " + path + ": " + e.getMessage();
                        System.err.println(errorMsg);
                        writeToLog("ERROR: " + errorMsg);
                    }
                });
    }

    private static List<String> testFile(Path file, COBOLPreprocessor preprocessor) throws IOException {
        // Preprocess the file
        String preprocessedContent = preprocessor.preprocess(file.toString());
        
        GrammarErrorListener errorListener = new GrammarErrorListener(file.getFileName().toString());

        // Create lexer and parser
        CharStream charStream = CharStreams.fromString(preprocessedContent);
        COBOL2002Lexer lexer = new COBOL2002Lexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        COBOL2002Parser parser = new COBOL2002Parser(tokens);

        // Add error listener
        lexer.removeErrorListeners();
        parser.removeErrorListeners();
        lexer.addErrorListener(errorListener);
        parser.addErrorListener(errorListener);

        try {
            // Try to parse the file
            parser.startRule();
        } catch (Exception e) {
            errorListener.getErrors().add("Parser exception: " + e.getMessage());
        }

        return errorListener.getErrors();
    }

    private static void writeToLog(String message) {
        try {
            Files.write(logFile, (message + "\n").getBytes(), 
                StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.err.println("Error writing to log file: " + e.getMessage());
        }
    }
}