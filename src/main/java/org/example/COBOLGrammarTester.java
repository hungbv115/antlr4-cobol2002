package org.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.example.g4.COBOL2002Lexer;
import org.example.g4.COBOL2002Parser;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

public class    COBOLGrammarTester {
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
            testAllFiles(testDir);
        } catch (IOException e) {
            System.err.println("Error testing files: " + e.getMessage());
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

        System.out.println("Starting grammar testing...");
        System.out.println("Total COBOL files to test: " + totalFiles);

        // Create preprocessor
        COBOLPreprocessor preprocessor = new COBOLPreprocessor();

        // Load copybooks
        loadCopybooks(preprocessor, dirPath);

        for (Path file : cobolFiles) {
            String fileName = file.getFileName().toString();
            System.out.println("\nTesting file: " + fileName);

            try {
                List<String> errors = testFile(file, preprocessor);
                if (!errors.isEmpty()) {
                    failedFiles.put(fileName, errors);
                } else {
                    successfulFiles++;
                }
            } catch (Exception e) {
                failedFiles.put(fileName, Collections.singletonList("Exception: " + e.getMessage()));
            }
        }

        // Print summary
        System.out.println("\n=== Test Summary ===");
        System.out.println("Total files tested: " + totalFiles);
        System.out.println("Successful: " + successfulFiles);
        System.out.println("Failed: " + failedFiles.size());

        if (!failedFiles.isEmpty()) {
            System.out.println("\n=== Failed Files ===");
            for (Map.Entry<String, List<String>> entry : failedFiles.entrySet()) {
                System.out.println("\nFile: " + entry.getKey());
                for (String error : entry.getValue()) {
                    System.out.println("  " + error);
                }
            }
        }
    }

    private static void loadCopybooks(COBOLPreprocessor preprocessor, Path dirPath) throws IOException {
        Files.walk(dirPath)
                .filter(path -> path.toString().endsWith(".cpy"))
                .forEach(path -> {
                    try {
                        String content = Files.readString(path);
                        String name = path.getFileName().toString().replace(".cpy", "");
                        preprocessor.addCopyBook(name, content);
                    } catch (IOException e) {
                        System.err.println("Error loading copybook " + path + ": " + e.getMessage());
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
} 