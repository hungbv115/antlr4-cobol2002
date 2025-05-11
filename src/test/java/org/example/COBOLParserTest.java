package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

public class COBOLParserTest {
    private COBOLPreprocessorA preprocessor;
    
    @TempDir
    Path tempDir;

    @BeforeEach
    void setUp() {
        preprocessor = new COBOLPreprocessorA();
    }

    @Test
    void testProcessDefine() throws IOException {
        // Create a test file with PROCESS DEFINE
        String input = "PROCESS DEFINE(DEBUG=1,FEATURE=ON)\n" +
                      "       IDENTIFICATION DIVISION.\n" +
                      "       PROGRAM-ID. TESTPGM.";
        
        Path inputFile = tempDir.resolve("test.cbl");
        Files.writeString(inputFile, input);

        String result = preprocessor.preprocess(inputFile.toString());
        
        // Verify the output contains the program text
        assertTrue(result.contains("IDENTIFICATION DIVISION"));
        assertTrue(result.contains("PROGRAM-ID. TESTPGM"));
    }

    @Test
    void testProcessDefineWithConditionalCompilation() throws IOException {
        // Create a test file with PROCESS DEFINE and conditional compilation
        String input = "PROCESS DEFINE(DEBUG=1,FEATURE=ON)\n" +
                      "       IDENTIFICATION DIVISION.\n" +
                      "       PROGRAM-ID. TESTPGM.\n" +
                      "       >>IF DEBUG=1\n" +
                      "       DISPLAY 'Debug mode is on'.\n" +
                      "       >>ELSE\n" +
                      "       DISPLAY 'Debug mode is off'.\n" +
                      "       >>END-IF";
        
        Path inputFile = tempDir.resolve("test.cbl");
        Files.writeString(inputFile, input);

        String result = preprocessor.preprocess(inputFile.toString());
        
        // Verify the output contains the debug message since DEBUG=1
        assertTrue(result.contains("Debug mode is on"));
        assertFalse(result.contains("Debug mode is off"));
    }

    @Test
    void testProcessDefineWithMultipleConditions() throws IOException {
        // Create a test file with multiple conditions
        String input = "PROCESS DEFINE(DEBUG=1,FEATURE=ON)\n" +
                      "       IDENTIFICATION DIVISION.\n" +
                      "       PROGRAM-ID. TESTPGM.\n" +
                      "       >>IF FEATURE=ON\n" +
                      "       DISPLAY 'Feature is enabled'.\n" +
                      "       >>IF DEBUG=1\n" +
                      "       DISPLAY 'Debug is also enabled'.\n" +
                      "       >>END-IF\n" +
                      "       >>END-IF";
        
        Path inputFile = tempDir.resolve("test.cbl");
        Files.writeString(inputFile, input);

        String result = preprocessor.preprocess(inputFile.toString());
        
        // Verify both conditions are met
        assertTrue(result.contains("Feature is enabled"));
        assertTrue(result.contains("Debug is also enabled"));
    }

    @Test
    void testProcessDefineWithInvalidCondition() throws IOException {
        // Create a test file with an invalid condition
        String input = "PROCESS DEFINE(DEBUG=1)\n" +
                      "       IDENTIFICATION DIVISION.\n" +
                      "       PROGRAM-ID. TESTPGM.\n" +
                      "       >>IF INVALID=1\n" +
                      "       DISPLAY 'This should not appear'.\n" +
                      "       >>END-IF";
        
        Path inputFile = tempDir.resolve("test.cbl");
        Files.writeString(inputFile, input);

        String result = preprocessor.preprocess(inputFile.toString());
        
        // Verify the conditional content is not included
        assertFalse(result.contains("This should not appear"));
    }
} 