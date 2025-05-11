       IDENTIFICATION DIVISION.
       PROGRAM-ID. EXAMPLE2002.
       AUTHOR. ANTLR4-COBOL.
       DATE-WRITTEN. 2024-03-20.
       
       ENVIRONMENT DIVISION.
       CONFIGURATION SECTION.
       SOURCE-COMPUTER. IBM-3090.
       OBJECT-COMPUTER. IBM-3090.
       
       REPOSITORY.
           CLASS CustomerClass
           CLASS AccountClass
           INTERFACE ITransaction
           FUNCTION XML-PARSE.
       
       DATA DIVISION.
       WORKING-STORAGE SECTION.
       01  WS-CUSTOMER.
           05  WS-CUST-ID        PIC X(10).
           05  WS-CUST-NAME      PIC X(50).
           05  WS-CUST-ADDRESS   PIC X(100).
           05  WS-CUST-PHONE     PIC X(15).
       
       01  WS-ACCOUNT.
           05  WS-ACC-NUMBER     PIC 9(10).
           05  WS-ACC-BALANCE    PIC 9(10)V99.
           05  WS-ACC-TYPE       PIC X(1).
       
       01  WS-XML-DATA.
           05  WS-XML-BUFFER     PIC X(1000).
           05  WS-XML-STATUS     PIC 9(2).
       
       01  WS-FILE-STATUS       PIC X(2).
           88  WS-FILE-SUCCESS   VALUE '00'.
           88  WS-FILE-EOF       VALUE '10'.
       
       FILE SECTION.
       FD  CUSTOMER-FILE
           LABEL RECORDS ARE STANDARD
           RECORDING MODE IS F.
       01  CUSTOMER-RECORD.
           05  CUST-ID          PIC X(10).
           05  CUST-NAME        PIC X(50).
           05  CUST-ADDRESS     PIC X(100).
           05  CUST-PHONE       PIC X(15).
       
       PROCEDURE DIVISION.
       MAIN-LOGIC.
           DISPLAY "COBOL 2002 Example Program"
           PERFORM INITIALIZE-PROGRAM
           PERFORM PROCESS-CUSTOMER
           PERFORM PROCESS-ACCOUNT
           PERFORM PROCESS-XML
           STOP RUN.
       
       INITIALIZE-PROGRAM.
           MOVE SPACES TO WS-CUSTOMER
           MOVE ZEROS TO WS-ACCOUNT
           MOVE SPACES TO WS-XML-DATA.
       
       PROCESS-CUSTOMER.
           MOVE "CUST001" TO WS-CUST-ID
           MOVE "John Doe" TO WS-CUST-NAME
           MOVE "123 Main St" TO WS-CUST-ADDRESS
           MOVE "555-1234" TO WS-CUST-PHONE.
       
       PROCESS-ACCOUNT.
           MOVE 1001 TO WS-ACC-NUMBER
           MOVE 1000.50 TO WS-ACC-BALANCE
           MOVE "S" TO WS-ACC-TYPE.
       
       PROCESS-XML.
           MOVE "<customer><id>CUST001</id><name>John Doe</name></customer>"
               TO WS-XML-BUFFER
           XML PARSE WS-XML-BUFFER
               ON EXCEPTION
                   DISPLAY "XML Parse Error"
               NOT ON EXCEPTION
                   DISPLAY "XML Parse Successful".
       
       *> Object-Oriented Example
       CLASS-ID. CustomerClass.
       ENVIRONMENT DIVISION.
       CONFIGURATION SECTION.
       OBJECT.
       
       DATA DIVISION.
       WORKING-STORAGE SECTION.
       01  WS-CUSTOMER-OBJECT.
           05  WS-CUST-ID        PIC X(10).
           05  WS-CUST-NAME      PIC X(50).
       
       PROCEDURE DIVISION.
       METHOD-ID. CONSTRUCTOR.
       DATA DIVISION.
       LINKAGE SECTION.
       01  LS-CUST-ID           PIC X(10).
       01  LS-CUST-NAME         PIC X(50).
       
       PROCEDURE DIVISION USING LS-CUST-ID LS-CUST-NAME.
           MOVE LS-CUST-ID TO WS-CUST-ID
           MOVE LS-CUST-NAME TO WS-CUST-NAME
           EXIT METHOD.
       
       METHOD-ID. GET-CUSTOMER-INFO.
       DATA DIVISION.
       LINKAGE SECTION.
       01  LS-RETURN-NAME       PIC X(50).
       
       PROCEDURE DIVISION RETURNING LS-RETURN-NAME.
           MOVE WS-CUST-NAME TO LS-RETURN-NAME
           EXIT METHOD.
       
       END CLASS CustomerClass.
       
       *> Interface Example
       INTERFACE-ID. ITransaction.
       ENVIRONMENT DIVISION.
       CONFIGURATION SECTION.
       
       PROCEDURE DIVISION.
       METHOD-ID. PROCESS-TRANSACTION.
       DATA DIVISION.
       LINKAGE SECTION.
       01  LS-AMOUNT            PIC 9(10)V99.
       01  LS-RESULT            PIC 9(2).
       
       PROCEDURE DIVISION USING LS-AMOUNT RETURNING LS-RESULT.
       END METHOD.
       
       END INTERFACE ITransaction.
       
       END PROGRAM EXAMPLE2002. 