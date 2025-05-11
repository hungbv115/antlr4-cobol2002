       IDENTIFICATION DIVISION.
       PROGRAM-ID. TESTPROG.
       AUTHOR. TEST AUTHOR.
       INSTALLATION. TEST INSTALLATION.
       DATE-WRITTEN. 2024-03-20.
       DATE-COMPILED. 2024-03-20.
       SECURITY. TEST SECURITY.
       REMARKS. This is a test program for COBOL 2002 parser.

       ENVIRONMENT DIVISION.
       CONFIGURATION SECTION.
       SOURCE-COMPUTER. IBM-3090.
       OBJECT-COMPUTER. IBM-3090.
       SPECIAL-NAMES.
           DECIMAL-POINT IS COMMA.
           CURRENCY SIGN IS "$".
           XML-SCHEMA TEST-SCHEMA IS "test.xsd".
           LOCALE TEST-LOCALE IS "en_US".

       INPUT-OUTPUT SECTION.
       FILE-CONTROL.
           SELECT TEST-FILE ASSIGN TO "TEST.DAT"
               ORGANIZATION IS SEQUENTIAL
               ACCESS MODE IS SEQUENTIAL
               FILE STATUS IS WS-FILE-STATUS.

       DATA DIVISION.
       FILE SECTION.
       FD  TEST-FILE
           EXTERNAL
           BLOCK CONTAINS 1000 CHARACTERS
           RECORD CONTAINS 80 CHARACTERS
           LABEL RECORDS ARE STANDARD.
       01  TEST-RECORD.
           05  TEST-FIELD-1    PIC X(20).
           05  TEST-FIELD-2    PIC 9(5).
           05  TEST-FIELD-3    PIC S9(7)V99 COMP-3.
           05  TEST-FIELD-4    PIC N(10).
           05  TEST-FIELD-5    PIC DBCS(10).

       WORKING-STORAGE SECTION.
       01  WS-FILE-STATUS     PIC XX.
       01  WS-COUNTER         PIC 9(5) VALUE ZERO.
       01  WS-TOTAL          PIC S9(7)V99 COMP-3.
       01  WS-DATE.
           05  WS-YEAR       PIC 9(4).
           05  WS-MONTH      PIC 9(2).
           05  WS-DAY        PIC 9(2).
       01  WS-FLAGS.
           05  WS-EOF-FLAG   PIC X VALUE 'N'.
               88  WS-EOF    VALUE 'Y'.
               88  WS-NOT-EOF VALUE 'N'.

       PROCEDURE DIVISION.
       MAIN-PARA.
           PERFORM INITIALIZE-PARA
           PERFORM PROCESS-PARA UNTIL WS-EOF
           PERFORM FINALIZE-PARA
           STOP RUN.

       INITIALIZE-PARA.
           OPEN INPUT TEST-FILE
           IF WS-FILE-STATUS NOT = "00"
               DISPLAY "Error opening file: " WS-FILE-STATUS
               STOP RUN.

       PROCESS-PARA.
           READ TEST-FILE
               AT END
                   SET WS-EOF TO TRUE
               NOT AT END
                   ADD 1 TO WS-COUNTER
                   ADD TEST-FIELD-3 TO WS-TOTAL
           END-READ.

       FINALIZE-PARA.
           CLOSE TEST-FILE
           DISPLAY "Total records processed: " WS-COUNTER
           DISPLAY "Total amount: " WS-TOTAL.

       XML-PARSE-PARA.
           XML PARSE WS-XML-DATA
               ON EXCEPTION
                   DISPLAY "XML Parse Error"
               NOT ON EXCEPTION
                   PERFORM PROCESS-XML
           END-XML.

       OBJECT-ORIENTED-PARA.
           INVOKE TEST-OBJECT "METHOD-NAME"
               USING WS-PARAM-1
               RETURNING WS-RESULT.

       END PROGRAM TESTPROG. 