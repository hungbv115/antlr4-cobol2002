package org.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.example.g4.COBOL2002Lexer;
import org.example.g4.COBOL2002Parser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class COBOLPreprocessor {
    private static final Pattern COPY_PATTERN = Pattern.compile("(?i)\\s*COPY\\s+([\\w-]+)(?:\\s+OF\\s+([\\w-]+))?\\.");
    private static final Pattern REPLACE_PATTERN = Pattern.compile("(?i)\\s*REPLACE\\s+([\\w-]+)\\s+BY\\s+([\\w-]+)\\.");
    private static final Pattern PROCESS_PATTERN = Pattern.compile("(?i)\\s*PROCESS\\s+DEFINE\\(([^)]+)\\)");
    private static final Pattern IF_PATTERN = Pattern.compile("(?i)\\s*>>IF\\s+(.+)\\s*");
    private static final Pattern ELSE_PATTERN = Pattern.compile("(?i)\\s*>>ELSE\\s*");
    private static final Pattern ENDIF_PATTERN = Pattern.compile("(?i)\\s*>>END-IF\\s*");

    private Map<String, String> copyBooks = new HashMap<>();
    private Map<String, String> replacements = new HashMap<>();
    private Map<String, String> defines = new HashMap<>();
    private Stack<Boolean> ifStack = new Stack<>();

    public String preprocess(String filePath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        StringBuilder processed = new StringBuilder();
        StringBuilder currentLine = new StringBuilder();
        boolean inContinuation = false;
        boolean skipLine = false;

        for (String line : lines) {
            // Skip empty lines
            if (line.trim().isEmpty()) {
                continue;
            }

            // Handle fixed format COBOL
//            String content = line.length() > 7 ? line.substring(7) : line;
            String content = line;

                    // Process PROCESS DEFINE statements
            Matcher processMatcher = PROCESS_PATTERN.matcher(content);
            if (processMatcher.find()) {
                String[] defines = processMatcher.group(1).split(",");
                for (String define : defines) {
                    String[] parts = define.split("=");
                    if (parts.length == 2) {
                        this.defines.put(parts[0].trim(), parts[1].trim());
                    }
                }
                continue;
            }

            // Handle preprocessing directives
            Matcher ifMatcher = IF_PATTERN.matcher(content);
            Matcher elseMatcher = ELSE_PATTERN.matcher(content);
            Matcher endifMatcher = ENDIF_PATTERN.matcher(content);

            if (ifMatcher.find()) {
                String condition = ifMatcher.group(1);
                boolean result = evaluateCondition(condition);
                ifStack.push(result);
                skipLine = !result;
                continue;
            } else if (elseMatcher.find()) {
                if (!ifStack.isEmpty()) {
                    boolean lastIf = ifStack.pop();
                    ifStack.push(!lastIf);
                    skipLine = !ifStack.peek();
                }
                continue;
            } else if (endifMatcher.find()) {
                if (!ifStack.isEmpty()) {
                    ifStack.pop();
                    skipLine = false;
                }
                continue;
            }

            if (skipLine) {
                continue;
            }

            // Check for continuation line
            if (line.length() > 7 && line.charAt(6) == '-') {
                if (!inContinuation) {
                    inContinuation = true;
                    currentLine = new StringBuilder(content);
                } else {
                    currentLine.append(content);
                }
                continue;
            }

            // Process COPY statements
            Matcher copyMatcher = COPY_PATTERN.matcher(content);
            if (copyMatcher.find()) {
                String copyBook = copyMatcher.group(1);
                String library = copyMatcher.group(2);
                if (copyBooks.containsKey(copyBook)) {
                    processed.append(copyBooks.get(copyBook));
                }
                continue;
            }

            // Process REPLACE statements
            Matcher replaceMatcher = REPLACE_PATTERN.matcher(content);
            if (replaceMatcher.find()) {
                String from = replaceMatcher.group(1);
                String to = replaceMatcher.group(2);
                replacements.put(from, to);
                continue;
            }

            // Handle normal line
            if (inContinuation) {
                currentLine.append(content);
                processed.append(currentLine.toString()).append("\n");
                inContinuation = false;
            } else {
                processed.append(content).append("\n");
            }
        }

        // Apply replacements
        String result = processed.toString();
        for (Map.Entry<String, String> replacement : replacements.entrySet()) {
            result = result.replace(replacement.getKey(), replacement.getValue());
        }

        return result;
    }

    private boolean evaluateCondition(String condition) {
        // Simple condition evaluation for now
        // Can be enhanced to handle more complex conditions
        String[] parts = condition.split("=");
        if (parts.length == 2) {
            String variable = parts[0].trim();
            String value = parts[1].trim();
            return defines.containsKey(variable) && defines.get(variable).equals(value);
        }
        return false;
    }

    public void addCopyBook(String name, String content) {
        copyBooks.put(name, content);
    }

    public Map<String, String> getDefines() {
        return Collections.unmodifiableMap(defines);
    }

    public void clearDefines() {
        defines.clear();
    }
}

public class COBOLParserTest {
    public static void main(String[] args) throws IOException {
        String inputFile = "D:\\Spring-boot\\antlr4-cobol2002\\src\\main\\resources\\local\\testantlr140.cbl";

        try {
            // Create preprocessor and process the input file
            COBOLPreprocessor preprocessor = new COBOLPreprocessor();
            String input = preprocessor.preprocess(inputFile);

            // Create a lexer and parser
            CharStream charStream = CharStreams.fromString(input);
            COBOL2002Lexer lexer = new COBOL2002Lexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            COBOL2002Parser parser = new COBOL2002Parser(tokens);

            // Add error listeners
            lexer.removeErrorListeners();
            parser.removeErrorListeners();
            lexer.addErrorListener(new ThrowingErrorListener());
            parser.addErrorListener(new ThrowingErrorListener());

            try {
                // Parse the input
                ParseTree tree = parser.startRule();

                // Print the parse tree
                System.out.println("\nParse Tree:");
                System.out.println(tree.toStringTree(parser));

                // Print token stream
                System.out.println("\nToken Stream:");
                tokens.fill();
                for (Token token : tokens.getTokens()) {
                    String tokenName = COBOL2002Lexer.VOCABULARY.getSymbolicName(token.getType());
                    System.out.printf("Token: %s, Type: %s, Line: %d, Column: %d%n",
                            token.getText(),
                            tokenName,
                            token.getLine(),
                            token.getCharPositionInLine());
                }

                // Print grammar tree
                System.out.println("\nGrammar Tree:");
                printGrammarTree(tree, parser, 0);

            } catch (ParseCancellationException e) {
                System.err.println("Parse Error: " + e.getMessage());
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    private static void printGrammarTree(ParseTree tree, Parser parser, int level) {
        // Print indentation
        for (int i = 0; i < level; i++) {
            System.out.print("  ");
        }

        // Print node name
        String nodeName = tree.getClass().getSimpleName().replace("Context", "");
        System.out.print(nodeName);

        // If it's a terminal node, print the text
        if (tree.getChildCount() == 0) {
            String text = tree.getText();
            if (!text.isEmpty()) {
                System.out.print(": " + text);
            }
        }
        System.out.println();

        // Recursively print children
        for (int i = 0; i < tree.getChildCount(); i++) {
            printGrammarTree(tree.getChild(i), parser, level + 1);
        }
    }
}

// Error listener để ném lỗi rõ ràng
class ThrowingErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
    }
}