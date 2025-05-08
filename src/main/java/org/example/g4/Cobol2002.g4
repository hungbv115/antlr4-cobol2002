// COBOL 2002 Grammar for ANTLR4
// Based on the ISO/IEC 1989:2002 standard
grammar Cobol2002;

// =======================
// Main program structure
// =======================

startRule
    : compilationUnit EOF
    ;

compilationUnit
    : IDENTIFICATION DIVISION DOT
      identificationDivision
      (ENVIRONMENT DIVISION DOT environmentDivision)?
      (DATA DIVISION DOT dataDivision)?
      (PROCEDURE DIVISION procedureDivisionHeader? DOT procedureDivision)?
    ;

// =======================
// IDENTIFICATION DIVISION
// =======================

identificationDivision
    : programId
      (AUTHOR DOT commentEntry)?
      (INSTALLATION DOT commentEntry)?
      (DATE_WRITTEN DOT commentEntry)?
      (DATE_COMPILED DOT commentEntry)?
      (SECURITY DOT commentEntry)?
      (REMARKS DOT commentEntry)?
    ;

programId
    : PROGRAM_ID DOT programName (IS? (COMMON PROGRAM | INITIAL PROGRAM | RECURSIVE PROGRAM | COMMON INITIAL PROGRAM | COMMON RECURSIVE PROGRAM))? DOT
    ;

programName
    : cobolWord
    ;

commentEntry
    : (~DOT)* DOT
    ;

// =======================
// ENVIRONMENT DIVISION
// =======================

environmentDivision
    : configurationSection?
      inputOutputSection?
    ;

configurationSection
    : CONFIGURATION SECTION DOT
      (sourceComputerParagraph)?
      (objectComputerParagraph)?
      (specialNamesParagraph)?
      (repositoryParagraph)?
    ;

sourceComputerParagraph
    : SOURCE_COMPUTER DOT (computerName) (WITH? DEBUGGING MODE)? DOT
    ;

objectComputerParagraph
    : OBJECT_COMPUTER DOT
      (computerName)
      (MEMORY SIZE? (WORDS | CHARACTERS | MODULES) integerLiteral)?
      (PROGRAM COLLATING? SEQUENCE IS? alphabetName)?
      (SEGMENT_LIMIT IS? integerLiteral)?
      DOT
    ;

computerName
    : cobolWord
    ;

specialNamesParagraph
    : SPECIAL_NAMES DOT
      (specialNameClause)*
      DOT
    ;

specialNameClause
    : alphabetClause
    | classClause
    | currencySignClause
    | decimalPointClause
    | symbolicCharactersClause
    | environmentNameClause
    | implementationDefinedItem
    ;

alphabetClause
    : ALPHABET alphabetName IS?
      (STANDARD_1 | STANDARD_2 | NATIVE | ASCII | EBCDIC |
       literal (THROUGH | THRU) literal)*
    ;

alphabetName
    : cobolWord
    ;

classClause
    : CLASS className IS?
      (literal (THROUGH | THRU) literal)+
    ;

className
    : cobolWord
    ;

currencySignClause
    : CURRENCY SIGN? IS? literal
      (WITH? PICTURE SYMBOL literal)?
    ;

decimalPointClause
    : DECIMAL_POINT IS? COMMA
    ;

symbolicCharactersClause
    : SYMBOLIC CHARACTERS?
      (symbolicCharacter+ (IS | ARE)? integerLiteral+)?
      (IN? alphabetName)?
    ;

symbolicCharacter
    : cobolWord
    ;

environmentNameClause
    : environmentName IS? mnemonicName
    ;

environmentName
    : cobolWord
    ;

mnemonicName
    : cobolWord
    ;

implementationDefinedItem
    : cobolWord IS? literal
    ;

repositoryParagraph
    : REPOSITORY DOT
      (repositoryEntry)*
    ;

repositoryEntry
    : FUNCTION (ALL | functionName) INTRINSIC
    | CLASS className INTRINSIC
    | INTERFACE interfaceName INTRINSIC
    ;

functionName
    : cobolWord
    ;

interfaceName
    : cobolWord
    ;

inputOutputSection
    : INPUT_OUTPUT SECTION DOT
      (fileControlParagraph)?
      (ioControlParagraph)?
    ;

fileControlParagraph
    : FILE_CONTROL DOT
      (fileControlEntry)*
    ;

fileControlEntry
    : SELECT OPTIONAL? fileName
      ASSIGN TO? assignCondition
    : arithmeticExpression IS? (NOT? POSITIVE | NOT? NEGATIVE | NOT? ZERO)
    ;

// Arithmetic expressions
arithmeticExpression
    : multDivExpression ((PLUS | MINUS) multDivExpression)*
    ;

multDivExpression
    : powerExpression ((TIMES | DIVIDE | DIVISION) powerExpression)*
    ;

powerExpression
    : unaryExpression (POWER unaryExpression)*
    ;

unaryExpression
    : (PLUS | MINUS)? primaryExpression
    ;

primaryExpression
    : literal
    | identifier
    | LPARENTHESIS arithmeticExpression RPARENTHESIS
    ;

// Identifiers and References
identifier
    : qualifiedDataName
    | tableCall
    | functionCall
    ;

tableCall
    : qualifiedDataName (LPARENTHESIS subscript (COMMA? subscript)* RPARENTHESIS)
    ;

functionCall
    : FUNCTION functionName (LPARENTHESIS (argument (COMMA? argument)*)? RPARENTHESIS)?
    ;

argument
    : literal
    | identifier
    | arithmeticExpression
    ;

subscript
    : ALL
    | integerLiteral
    | qualifiedDataName (PLUS | MINUS | TIMES | DIVIDE | DIVISION)? integerLiteral
    | indexName (PLUS | MINUS | TIMES | DIVIDE | DIVISION)? integerLiteral
    ;

qualifiedDataName
    : (dataName | conditionName) (IN | OF)? (dataName | fileName)+
    | dataName
    ;

screen_name
    : qualifiedDataName
    ;

procedureName
    : paragraphName (IN | OF)? sectionName
    | paragraphName
    | sectionName
    ;

// Literals
literal
    : numericLiteral
    | stringLiteral
    | booleanLiteral
    | figurativeConstant
    | NULL
    ;

numericLiteral
    : integerLiteral
    | decimalLiteral
    ;

integerLiteral
    : INTEGER
    ;

decimalLiteral
    : DECIMAL
    ;

booleanLiteral
    : TRUE
    | FALSE
    ;

stringLiteral
    : STRING_LITERAL
    ;

figurativeConstant
    : ZERO | ZEROS | ZEROES
    | SPACE | SPACES
    | HIGH_VALUE | HIGH_VALUES
    | LOW_VALUE | LOW_VALUES
    | QUOTE | QUOTES
    | ALL stringLiteral
    ;

// Basic building blocks
cobolWord
    : IDENTIFIER
    ;

// Lexical Rules
// -----------------------------
// Keywords

ACCEPT : A C C E P T ;
ADD : A D D ;
ADVANCING : A D V A N C I N G ;
AFTER : A F T E R ;
ALL : A L L ;
ALPHABETIC : A L P H A B E T I C ;
ALPHABETIC_LOWER : A L P H A B E T I C DASH L O W E R ;
ALPHABETIC_UPPER : A L P H A B E T I C DASH U P P E R ;
ALPHABET : A L P H A B E T ;
ALPHANUMERIC : A L P H A N U M E R I C ;
ALPHANUMERIC_EDITED : A L P H A N U M E R I C DASH E D I T E D ;
ALSO : A L S O ;
ALTER : A L T E R ;
ALTERNATE : A L T E R N A T E ;
AND : A N D ;
ANY : A N Y ;
ARE : A R E ;
AREA : A R E A ;
ARGUMENT_NUMBER : A R G U M E N T DASH N U M B E R ;
ARGUMENT_VALUE : A R G U M E N T DASH V A L U E ;
ASCENDING : A S C E N D I N G ;
ASCII : A S C I I ;
ASSIGN : A S S I G N ;
AT : A T ;
AUTHOR : A U T H O R ;
AUTO : A U T O ;
AUTO_SKIP : A U T O DASH S K I P ;
BACKGROUND_COLOR : B A C K G R O U N D DASH C O L O R ;
BEFORE : B E F O R E ;
BELL : B E L L ;
BEEP : B E E P ;
BINARY : B I N A R Y ;
BLANK : B L A N K ;
BLINK : B L I N K ;
BLOCK : B L O C K ;
BOTTOM : B O T T O M ;
BY : B Y ;
CALL : C A L L ;
CANCEL : C A N C E L ;
CF : C F ;
CH : C H ;
CHARACTER : C H A R A C T E R ;
CHARACTERS : C H A R A C T E R S ;
CLASS : C L A S S ;
CLOCK_UNITS : C L O C K DASH U N I T S ;
CLOSE : C L O S E ;
COBOL : C O B O L ;
CODE : C O D E ;
CODE_SET : C O D E DASH S E T ;
COLLATING : C O L L A T I N G ;
COLUMN : C O L U M N ;
COMMA : ',' ;
COMMON : C O M M O N ;
COMMUNICATION : C O M M U N I C A T I O N ;
COMP : C O M P ;
COMP_1 : C O M P DASH '1' ;
COMP_2 : C O M P DASH '2' ;
COMP_3 : C O M P DASH '3' ;
COMP_4 : C O M P DASH '4' ;
COMP_5 : C O M P DASH '5' ;
COMPUTATIONAL : C O M P U T A T I O N A L ;
COMPUTATIONAL_1 : C O M P U T A T I O N A L DASH '1' ;
COMPUTATIONAL_2 : C O M P U T A T I O N A L DASH '2' ;
COMPUTATIONAL_3 : C O M P U T A T I O N A L DASH '3' ;
COMPUTATIONAL_4 : C O M P U T A T I O N A L DASH '4' ;
COMPUTATIONAL_5 : C O M P U T A T I O N A L DASH '5' ;
COMPUTE : C O M P U T E ;
CONFIGURATION : C O N F I G U R A T I O N ;
CONSOLE : C O N S O L E ;
CONTAINS : C O N T A I N S ;
CONTENT : C O N T E N T ;
CONTINUE : C O N T I N U E ;
CONTROL : C O N T R O L ;
CONTROLS : C O N T R O L S ;
CONVERTING : C O N V E R T I N G ;
COPY : C O P Y ;
CORR : C O R R ;
CORRESPONDING : C O R R E S P O N D I N G ;
COUNT : C O U N T ;
CURRENCY : C U R R E N C Y ;
CURSOR : C U R S O R ;
DATA : D A T A ;
DATE : D A T E ;
DATE_COMPILED : D A T E DASH C O M P I L E D ;
DATE_WRITTEN : D A T E DASH W R I T T E N ;
DAY : D A Y ;
DAY_OF_WEEK : D A Y DASH O F DASH W E E K ;
DBCS : D B C S ;
DE : D E ;
DEBUG_CONTENTS : D E B U G DASH C O N T E N T S ;
DEBUG_ITEM : D E B U G DASH I T E M ;
DEBUG_LINE : D E B U G DASH L I N E ;
DEBUG_NAME : D E B U G DASH N A M E ;
DEBUG_SUB_1 : D E B U G DASH S U B DASH '1' ;
DEBUG_SUB_2 : D E B U G DASH S U B DASH '2' ;
DEBUG_SUB_3 : D E B U G DASH S U B DASH '3' ;
DEBUGGING : D E B U G G I N G ;
DECIMAL_POINT : D E C I M A L DASH P O I N T ;
DECLARATIVES : D E C L A R A T I V E S ;
DEFAULT : D E F A U L T ;
DELETE : D E L E T E ;
DELIMITED : D E L I M I T E D ;
DELIMITER : D E L I M I T E R ;
DEPENDING : D E P E N D I N G ;
DESCENDING : D E S C E N D I N G ;
DESTINATION : D E S T I N A T I O N ;
DETAIL : D E T A I L ;
DISABLE : D I S A B L E ;
DISPLAY : D I S P L A Y ;
DISPLAY_1 : D I S P L A Y DASH '1' ;
DIVIDE : D I V I D E ;
DIVISION : D I V I S I O N ;
DOWN : D O W N ;
DUPLICATES : D U P L I C A T E S ;
DYNAMIC : D Y N A M I C ;
EBCDIC : E B C D I C ;
ECHO : E C H O ;
EGI : E G I ;
ELSE : E L S E ;
EMI : E M I ;
ENABLE : E N A B L E ;
END : E N D ;
END_ACCEPT : E N D DASH A C C E P T ;
END_ADD : E N D DASH A D D ;
END_CALL : E N D DASH C A L L ;
END_COMPUTE : E N D DASH C O M P U T E ;
END_DELETE : E N D DASH D E L E T E ;
END_DISPLAY : E N D DASH D I S P L A Y ;
END_DIVIDE : E N D DASH D I V I D E ;
END_EVALUATE : E N D DASH E V A L U A T E ;
END_IF : E N D DASH I F ;
END_MULTIPLY : E N D DASH M U L T I P L Y ;
END_OF_PAGE : E N D DASH O F DASH P A G E ;
END_PERFORM : E N D DASH P E R F O R M ;
END_READ : E N D DASH R E A D ;
END_RECEIVE : E N D DASH R E C E I V E ;
END_RETURN : E N D DASH R E T U R N ;
END_REWRITE : E N D DASH R E W R I T E ;
END_SEARCH : E N D DASH S E A R C H ;
END_START : E N D DASH S T A R T ;
END_STRING : E N D DASH S T R I N G ;
END_SUBTRACT : E N D DASH S U B T R A C T ;
END_UNSTRING : E N D DASH U N S T R I N G ;
END_WRITE : E N D DASH W R I T E ;
ENTER : E N T E R ;
ENTRY : E N T R Y ;
ENVIRONMENT : E N V I R O N M E N T ;
ENVIRONMENT_VALUE : E N V I R O N M E N T DASH V A L U E ;
EOP : E O P ;
EQUAL : E Q U A L ;
ERROR : E R R O R ;
ESI : E S I ;
EVALUATE : E V A L U A T E ;
EVERY : E V E R Y ;
EXCEPTION : E X C E P T I O N ;
EXCEPTION_OBJECT : E X C E P T I O N DASH O B J E C T ;
EXIT : E X I T ;
EXTEND : E X T E N D ;
EXTERNAL : E X T E R N A L ;
FALSE : F A L S E ;
FD : F D ;
FILE : F I L E ;
FILE_CONTROL : F I L E DASH C O N T R O L ;
FILLER : F I L L E R ;
FINAL : F I N A L ;
FIRST : F I R S T ;
FIXED : F I X E D ;
FOOTING : F O O T I N G ;
FOR : F O R ;
FOREGROUND_COLOR : F O R E G R O U N D DASH C O L O R ;
FROM : F R O M ;
FUNCTION : F U N C T I O N ;
FUNCTION_POINTER : F U N C T I O N DASH P O I N T E R ;
GENERATE : G E N E R A T E ;
GIVING : G I V I N G ;
GLOBAL : G L O B A L ;
GO : G O ;
GOBACK : G O B A C K ;
GREATER : G R E A T E R ;
HIGHLIGHT : H I G H L I G H T ;
HIGH_VALUE : H I G H DASH V A L U E ;
HIGH_VALUES : H I G H DASH V A L U E S ;
I_O : I DASH O ;
I_O_CONTROL : I DASH O DASH C O N T R O L ;
IDENTIFICATION : I D E N T I F I C A T I O N ;
IF : I F ;
IN : I N ;
INDEX : I N D E X ;
INDEXED : I N D E X E D ;
INDICATE : I N D I C A T E ;
INITIAL : I N I T I A L ;
INITIALIZE : I N I T I A L I Z E ;
INITIATE : I N I T I A T E ;
INPUT : I N P U T ;
INPUT_OUTPUT : I N P U T DASH O U T P U T ;
INSPECT : I N S P E C T ;
INSTALLATION : I N S T A L L A T I O N ;
INTERFACE : I N T E R F A C E ;
INTRINSIC : I N T R I N S I C ;
INVALID : I N V A L I D ;
INVOKE : I N V O K E ;
IS : I S ;
JUST : J U S T ;
JUSTIFIED : J U S T I F I E D ;
KANJI : K A N J I ;
KEY : K E Y ;
LABEL : L A B E L ;
LAST : L A S T ;
LEADING : L E A D I N G ;
LEFT : L E F T ;
LENGTH : L E N G T H ;
LESS : L E S S ;
LINAGE : L I N A G E ;
LINAGE_COUNTER : L I N A G E DASH C O U N T E R ;
LINE : L I N E ;
LINE_COUNTER : L I N E DASH C O U N T E R ;
LINES : L I N E S ;
LINKAGE : L I N K A G E ;
LOCAL_STORAGE : L O C A L DASH S T O R A G E ;
LOCALE : L O C A L E ;
LOCK : L O C K ;
LOW_VALUE : L O W DASH V A L U E ;
LOW_VALUES : L O W DASH V A L U E S ;
LOWER : L O W E R ;
LOWLIGHT : L O W L I G H T ;
MEMORY : M E M O R Y ;
MERGE : M E R G E ;
MESSAGE : M E S S A G E ;
METHOD : M E T H O D ;
MODE : M O D E ;
MODULES : M O D U L E S ;
MOVE : M O V E ;
MULTIPLE : M U L T I P L E ;
MULTIPLY : M U L T I P L Y ;
NATIONAL : N A T I O N A L ;
NATIONAL_EDITED : N A T I O N A L DASH E D I T E D ;
NATIVE : N A T I V E ;
NEGATIVE : N E G A T I V E ;
NEXT : N E X T ;
NO : N O ;
NULL : N U L L ;
NULLS : N U L L S ;
NUMBER : N U M B E R ;
NUMERIC : N U M E R I C ;
NUMERIC_EDITED : N U M E R I C DASH E D I T E D ;
OBJECT : O B J E C T ;
OBJECT_COMPUTER : O B J E C T DASH C O M P U T E R ;
OCCURS : O C C U R S ;
OF : O F ;
OFF : O F F ;
OMITTED : O M I T T E D ;
ON : O N ;
OPEN : O P E N ;
OPTIONAL : O P T I O N A L ;
OR : O R ;
ORDER : O R D E R ;
ORGANIZATION : O R G A N I Z A T I O N ;
OTHER : O T H E R ;
OUTPUT : O U T P U T ;
OVERFLOW : O V E R F L O W ;
OVERLINE : O V E R L I N E ;
PACKED_DECIMAL : P A C K E D DASH D E C I M A L ;
PADDING : P A D D I N G ;
PAGE : P A G E ;
PAGE_COUNTER : P A G E DASH C O U N T E R ;
PF : P F ;
PH : P H ;
PIC : P I C ;
PICTURE : P I C T U R E ;
PLUS : '+' ;
MINUS : '-' ;
TIMES : '*' ;
DIVIDE : '/' ;
POWER : '**' ;
POINTER : P O I N T E R ;
POSITION : P O S I T I O N ;
POSITIVE : P O S I T I V E ;
PRESENT : P R E S E N T ;
PRINTING : P R I N T I N G ;
PROCEDURE : P R O C E D U R E ;
PROCEDURE_POINTER : P R O C E D U R E DASH P O I N T E R ;
PROCEDURES : P R O C E D U R E S ;
PROCEED : P R O C E E D ;
PROGRAM : P R O G R A M ;
PROGRAM_ID : P R O G R A M DASH I D ;
PROMPT : P R O M P T ;
PURGE : P U R G E ;
QUEUE : Q U E U E ;
QUOTE : Q U O T E ;
QUOTES : Q U O T E S ;
RANDOM : R A N D O M ;
RD : R D ;
READ : R E A D ;
RECEIVE : R E C E I V E ;
RECORD : R E C O R D ;
RECORDING : R E C O R D I N G ;
RECORDS : R E C O R D S ;
RECURSIVE : R E C U R S I V E ;
REDEFINES : R E D E F I N E S ;
REEL : R E E L ;
REFERENCE : R E F E R E N C E ;
RELATIVE : R E L A T I V E ;
RELEASE : R E L E A S E ;
RELOAD : R E L O A D ;
REMAINDER : R E M A I N D E R ;
REMOVAL : R E M O V A L ;
RENAMES : R E N A M E S ;
REPLACE : R E P L A C E ;
REPLACING : R E P L A C I N G ;
REPOSITORY : R E P O S I T O R Y ;
RERUN : R E R U N ;
RESERVE : R E S E R V E ;
RESET : R E S E T ;
RESUME : R E S U M E ;
RETRY : R E T R Y ;
RETURN : R E T U R N ;
RETURNING : R E T U R N I N G ;
REVERSE : R E V E R S E ;
REVERSED : R E V E R S E D ;
REVERSE_VIDEO : R E V E R S E DASH V I D E O ;
REWIND : R E W I N D ;
REWRITE : R E W R I T E ;
RF : R F ;
RH : R H ;
RIGHT : R I G H T ;
ROUNDED : R O U N D E D ;
RUN : R U N ;
SAME : S A M E ;
SD : S D ;
SEARCH : S E A R C H ;
SECTION : S E C T I O N ;
SECURE : S E C U R E ;
SECURITY : S E C U R I T Y ;
SEGMENT : S E G M E N T ;
SEGMENT_LIMIT : S E G M E N T DASH L I M I T ;
SELECT : S E L E C T ;
SELF : S E L F ;
SEND : S E N D ;
SENTENCE : S E N T E N C E ;
SEPARATE : S E P A R A T E ;
SEQUENCE : S E Q U E N C E ;
SEQUENTIAL : S E Q U E N T I A L ;
SET : S E T ;
SIGN : S I G N ;
SIZE : S I Z E ;
SORT : S O R T ;
SORT_MERGE : S O R T DASH M E R G E ;
SOURCE : S O U R C E ;
SOURCE_COMPUTER : S O U R C E DASH C O M P U T E R ;
SPACE : S P A C E ;
SPACES : S P A C E S ;
SPECIAL_NAMES : S P E C I A L DASH N A M E S ;
STANDARD : S T A N D A R D ;
STANDARD_1 : S T A N D A R D DASH '1' ;
STANDARD_2 : S T A N D A R D DASH '2' ;
START : S T A R T ;
STATUS : S T A T U S ;
STOP : S T O P ;
STRING : S T R I N G ;
SUB_QUEUE_1 : S U B DASH Q U E U E DASH '1' ;
SUB_QUEUE_2 : S U B DASH Q U E U E DASH '2' ;
SUB_QUEUE_3 : S U B DASH Q U E U E DASH '3' ;
SUBTRACT : S U B T R A C T ;
SUB_TOTAL : S U B DASH T O T A L ;
SUCCESS : S U C C E S S ;
SUM : S U M ;
SUPPRESS : S U P P R E S S ;
SYMBOLIC : S Y M B O L I C ;
SYNC : S Y N C ;
SYNCHRONIZED : S Y N C H R O N I Z E D ;
TABLE : T A B L E ;
TALLYING : T A L L Y I N G ;
TAPE : T A P E ;
TERMINAL : T E R M I N A L ;
TERMINATE : T E R M I N A T E ;
TEST : T E S T ;
TEXT : T E X T ;
THAN : T H A N ;
THEN : T H E N ;
THROUGH : T H R O U G H ;
THRU : T H R U ;
TIME : T I M E ;
TIMES : T I M E S ;
TO : T O ;
TOP : T O P ;
TRAILING : T R A I L I N G ;
TRUE : T R U E ;
TYPE : T Y P E ;
UNDERLINE : U N D E R L I N E ;
UNIT : U N I T ;
UNLOCK : U N L O C K ;
UNSTRING : U N S T R I N G ;
UNTIL : U N T I L ;
UP : U P ;
UPDATE : U P D A T E ;
UPPER : U P P E R ;
USAGE : U S A G E ;
USE : U S E ;
USING : U S I N G ;
VALUE : V A L U E ;
VALUES : V A L U E S ;
VARYING : V A R Y I N G ;
WAIT : W A I T ;
WHEN : W H E N ;
WITH : W I T H ;
WORDS : W O R D S ;
WORKING_STORAGE : W O R K I N G DASH S T O R A G E ;
WRITE : W R I T E ;
ZERO : Z E R O ;
ZEROS : Z E R O S ;
ZEROES : Z E R O E S ;

// Special characters
DOT : '.' ;
DASH : '-' ;
LPARENTHESIS : '(' ;
RPARENTHESIS : ')' ;

// Logical operators
EQUAL_OP : '=' ;
GREATER_OP : '>' ;
LESS_OP : '<' ;
GREATER_EQUAL_OP : '>=' ;
LESS_EQUAL_OP : '<=' ;
NOT_EQUAL_OP : '<>' ;

// Complex tokens
IDENTIFIER : [A-Za-z][A-Za-z0-9_-]* ;
INTEGER : [0-9]+ ;
DECIMAL : [0-9]+ '.' [0-9]+ ;
STRING_LITERAL : '"' (~["])* '"' | '\'' (~['])* '\'' ;

// Skip whitespace and comments
WS : [ \t\r\n]+ -> skip ;
COMMENT : '*>'.* -> skip ;
LINE_COMMENT : '//' ~[\r\n]* -> skip ;

// Character-level fragments to support case insensitivity
fragment A : [aA] ;
fragment B : [bB] ;
fragment C : [cC] ;
fragment D : [dD] ;
fragment E : [eE] ;
fragment F : [fF] ;
fragment G : [gG] ;
fragment H : [hH] ;
fragment I : [iI] ;
fragment J : [jJ] ;
fragment K : [kK] ;
fragment L : [lL] ;
fragment M : [mM] ;
fragment N : [nN] ;
fragment O : [oO] ;
fragment P : [pP] ;
fragment Q : [qQ] ;
fragment R : [rR] ;
fragment S : [sS] ;
fragment T : [tT] ;
fragment U : [uU] ;
fragment V : [vV] ;
fragment W : [wW] ;
fragment X : [xX] ;
fragment Y : [yY] ;
fragment Z : [zZ] ;

// Special token for the PICTURE clause string
PICTURE_STRING : [A-Za-z0-9(),.$+\-/*]+ ;

// Any remaining unhandled tokens
ANY_CHAR : . -> skip ;mentName
      (ORGANIZATION IS? (LINE | RECORD BINARY | RECORD SEQUENTIAL | RECORD RELATIVE | RECORD INDEXED))?
      (ACCESS MODE? IS? (SEQUENTIAL | RANDOM | DYNAMIC))?
      (RECORD KEY? IS? qualifiedDataName (WITH? DUPLICATES)?)?
      (ALTERNATE RECORD KEY? IS? qualifiedDataName (WITH? DUPLICATES)?)*
      (FILE STATUS IS? qualifiedDataName qualifiedDataName?)?
      DOT
    ;

fileName
    : cobolWord
    ;

assignmentName
    : literal
    | cobolWord
    ;

ioControlParagraph
    : I_O_CONTROL DOT
      (ioControlClause)*
      DOT
    ;

ioControlClause
    : rerunClause
    | sameAreaClause
    | multipleFileClause
    ;

rerunClause
    : RERUN ON? (assignmentName | fileName)
      EVERY? (END OF? (REEL | UNIT) | integerLiteral RECORDS | integerLiteral CLOCK_UNITS | condition_name)
      OF? fileName
    ;

sameAreaClause
    : SAME (AREA | RECORD | SORT | SORT_MERGE) AREA? fileName+
    ;

multipleFileClause
    : MULTIPLE FILE TAPE? CONTAINS? multipleFileItem+
    ;

multipleFileItem
    : fileName (POSITION integerLiteral)?
    ;

// =======================
// DATA DIVISION
// =======================

dataDivision
    : fileSection?
      workingStorageSection?
      localStorageSection?
      linkageSection?
      communicationSection?
      reportSection?
    ;

fileSection
    : FILE SECTION DOT
      (fileDescriptionEntry)*
    ;

fileDescriptionEntry
    : (FD | SD) fileName
      (blockContainsClause)?
      (recordContainsClause)?
      (labelRecordsClause)?
      (valueOfClause)?
      (dataRecordsClause)?
      (linageClause)?
      (recordingModeClause)?
      (codeSetClause)?
      DOT
      (dataDescriptionEntry)*
    ;

blockContainsClause
    : BLOCK CONTAINS? integerLiteral (TO integerLiteral)? (RECORDS | CHARACTERS)?
    ;

recordContainsClause
    : RECORD
      (CONTAINS? integerLiteral (CHARACTERS)?
      | CONTAINS? integerLiteral TO integerLiteral CHARACTERS?
      | IS? VARYING IN? SIZE? (FROM? integerLiteral)? (TO integerLiteral)? CHARACTERS? (DEPENDING ON? qualifiedDataName)?)
    ;

labelRecordsClause
    : LABEL (RECORD IS? | RECORDS ARE?)
      (STANDARD | OMITTED | qualifiedDataName+)
    ;

valueOfClause
    : VALUE OF dataName IS? literal+
    ;

dataName
    : cobolWord
    ;

dataRecordsClause
    : DATA (RECORD IS? | RECORDS ARE?) qualifiedDataName+
    ;

linageClause
    : LINAGE IS? (qualifiedDataName | integerLiteral) LINES?
      (WITH? FOOTING AT? (qualifiedDataName | integerLiteral))?
      (LINES? AT? TOP (qualifiedDataName | integerLiteral))?
      (LINES? AT? BOTTOM (qualifiedDataName | integerLiteral))?
    ;

recordingModeClause
    : RECORDING MODE? IS? (F | V | U | S | FIXED | VARIABLE)
    ;

codeSetClause
    : CODE_SET IS? alphabetName
    ;

workingStorageSection
    : WORKING_STORAGE SECTION DOT
      (dataDescriptionEntry)*
    ;

localStorageSection
    : LOCAL_STORAGE SECTION DOT
      (dataDescriptionEntry)*
    ;

linkageSection
    : LINKAGE SECTION DOT
      (dataDescriptionEntry)*
    ;

communicationSection
    : COMMUNICATION SECTION DOT
      (communicationDescriptionEntry)*
    ;

communicationDescriptionEntry
    : cdInputEntry
    | cdOutputEntry
    | cdInputOutputEntry
    ;

cdInputEntry
    : CD fileName
      (FOR? INITIAL INPUT)?
      (symbolicQueueClause)?
      (symbolicSubQueueClause)?
      (messageDataClause)?
      (messageCountClause)?
      (textLengthClause)?
      (endKeyClause)?
      (statusKeyClause)?
      (messageDateClause)?
      (messageTimeClause)?
      (symbolicSourceClause)?
      DOT
      (dataDescriptionEntry)*
    ;

cdOutputEntry
    : CD fileName
      (FOR? OUTPUT)?
      (destinationTableClause)?
      (textLengthClause)?
      (statusKeyClause)?
      (destinationCountClause)?
      (errorKeyClause)?
      (symbolicDestinationClause)?
      DOT
      (dataDescriptionEntry)*
    ;

cdInputOutputEntry
    : CD fileName
      (FOR? INPUT_OUTPUT)?
      (messageDateClause)?
      (messageTimeClause)?
      (symbolicTerminalClause)?
      (textLengthClause)?
      (endKeyClause)?
      (statusKeyClause)?
      DOT
      (dataDescriptionEntry)*
    ;

symbolicQueueClause
    : SYMBOLIC QUEUE? IS? qualifiedDataName
    ;

symbolicSubQueueClause
    : SYMBOLIC SUB_QUEUE? IS? qualifiedDataName
    ;

messageDataClause
    : MESSAGE DATE? IS? qualifiedDataName
    ;

messageCountClause
    : MESSAGE COUNT? IS? qualifiedDataName
    ;

textLengthClause
    : TEXT LENGTH? IS? qualifiedDataName
    ;

endKeyClause
    : END KEY? IS? qualifiedDataName
    ;

statusKeyClause
    : STATUS KEY? IS? qualifiedDataName
    ;

messageDateClause
    : MESSAGE DATE? IS? qualifiedDataName
    ;

messageTimeClause
    : MESSAGE TIME? IS? qualifiedDataName
    ;

symbolicSourceClause
    : SYMBOLIC SOURCE? IS? qualifiedDataName
    ;

destinationTableClause
    : DESTINATION TABLE?
      (OCCURS integerLiteral TIMES?)?
      (INDEXED BY? indexName+)?
      IS? qualifiedDataName
    ;

destinationCountClause
    : DESTINATION COUNT? IS? qualifiedDataName
    ;

errorKeyClause
    : ERROR KEY? IS? qualifiedDataName
    ;

symbolicDestinationClause
    : SYMBOLIC DESTINATION? IS? qualifiedDataName
    ;

symbolicTerminalClause
    : SYMBOLIC TERMINAL? IS? qualifiedDataName
    ;

reportSection
    : REPORT SECTION DOT
      (reportDescriptionEntry)*
    ;

reportDescriptionEntry
    : RD reportName
      (GLOBAL)?
      (CODE literal)?
      (CONTROL IS? (FINAL | qualifiedDataName+))?
      (PAGE LIMIT? IS? integerLiteral LINE? (LINES)?
        (HEADING IS? integerLiteral)?
        (FIRST DETAIL? IS? integerLiteral)?
        (LAST DETAIL? IS? integerLiteral)?
        (FOOTING IS? integerLiteral)?)?
      DOT
      (reportGroupDescriptionEntry)*
    ;

reportName
    : cobolWord
    ;

reportGroupDescriptionEntry
    : (01 | 1) dataName? (LINE? NUMBER? IS? integerLiteral reportGroupLineNumberClause?)?
      (reportGroupTypeClause)?
      (USAGE IS? DISPLAY)?
      DOT
    | (level INTEGER DOT reportGroupDescriptionEntry)
    ;

reportGroupLineNumberClause
    : (PLUS integerLiteral)?
      (ON? NEXT PAGE)?
    ;

reportGroupTypeClause
    : TYPE IS?
      (REPORT HEADING | RH | PAGE HEADING | PH | CONTROL HEADING | CH | DETAIL | DE |
       CONTROL FOOTING | CF | PAGE FOOTING | PF | REPORT FOOTING | RF)
      (FINAL | qualifiedDataName)?
    ;

// Data Description Entry
dataDescriptionEntry
    : (level dataName?)?
      (REDEFINES dataName)?
      (IS? EXTERNAL)?
      (IS? GLOBAL)?
      (pictureClause)?
      (usageClause)?
      (signClause)?
      (occursClause)?
      (valueClause)?
      (synchronizedClause)?
      (justifiedClause)?
      (blankWhenZeroClause)?
      DOT
    ;

level
    : (01 | 1)
    | (02 | 2)
    | (03 | 3)
    | (04 | 4)
    | (05 | 5)
    | (06 | 6)
    | (07 | 7)
    | (08 | 8)
    | (09 | 9)
    | (10 | 77)
    | (66 | 78 | 88)
    ;

pictureClause
    : (PICTURE | PIC) IS? pictureString
    ;

pictureString
    : (PICTURE_STRING | literal)
    ;

usageClause
    : (USAGE IS?)?
      (BINARY | COMPUTATIONAL | COMP | COMPUTATIONAL_1 | COMP_1 | COMPUTATIONAL_2 | COMP_2 |
       COMPUTATIONAL_3 | COMP_3 | COMPUTATIONAL_4 | COMP_4 | COMPUTATIONAL_5 | COMP_5 |
       DISPLAY | DISPLAY_1 | INDEX | NATIONAL | PACKED_DECIMAL | POINTER | PROCEDURE_POINTER |
       FUNCTION_POINTER | OBJECT REFERENCE className?)
    ;

signClause
    : (SIGN IS?)? (LEADING | TRAILING) (SEPARATE CHARACTER)?
    ;

occursClause
    : OCCURS integerLiteral TIMES?
      (DEPENDING ON? qualifiedDataName)?
      (ASCENDING | DESCENDING) KEY? IS? qualifiedDataName+
      (INDEXED BY? indexName+)?
    ;

indexName
    : cobolWord
    ;

valueClause
    : VALUE IS? literal
    | VALUES ARE? literal+
    | VALUE IS? literal THROUGH literal
    | VALUES ARE? literal THROUGH literal+
    ;

synchronizedClause
    : (SYNCHRONIZED | SYNC) (LEFT | RIGHT)?
    ;

justifiedClause
    : (JUSTIFIED | JUST) RIGHT?
    ;

blankWhenZeroClause
    : BLANK WHEN? ZERO
    ;

// =======================
// PROCEDURE DIVISION
// =======================

procedureDivisionHeader
    : (USING procedureDivisionUsingParameter+)?
      (RETURNING dataName)?
    ;

procedureDivisionUsingParameter
    : (REFERENCE | VALUE)? dataName
    ;

procedureDivision
    : (declarativesSection)?
      paragraphsAndSentences
    ;

declarativesSection
    : DECLARATIVES DOT
      (sectionDeclarative)+
      END DECLARATIVES DOT
    ;

sectionDeclarative
    : sectionName SECTION DOT
      USE FOR? (DEBUGGING ON? (procedureName | ALL PROCEDURES)?)?
      DOT
      paragraphsAndSentences
    ;

sectionName
    : cobolWord
    ;

paragraphsAndSentences
    : (paragraphName DOT (sentence)*)+
    ;

paragraphName
    : cobolWord
    ;

sentence
    : statement+ DOT
    ;

statement
    : acceptStatement
    | addStatement
    | alterStatement
    | callStatement
    | cancelStatement
    | closeStatement
    | computeStatement
    | continueStatement
    | deleteStatement
    | disableStatement
    | displayStatement
    | divideStatement
    | enableStatement
    | entryStatement
    | evaluateStatement
    | exitStatement
    | generateStatement
    | goToStatement
    | ifStatement
    | initializeStatement
    | initiateStatement
    | inspectStatement
    | mergeStatement
    | moveStatement
    | multiplyStatement
    | openStatement
    | performStatement
    | purgeStatement
    | readStatement
    | receiveStatement
    | releaseStatement
    | returnStatement
    | rewriteStatement
    | searchStatement
    | sendStatement
    | setStatement
    | sortStatement
    | startStatement
    | stopStatement
    | stringStatement
    | subtractStatement
    | suppressStatement
    | terminateStatement
    | unlockStatement
    | unstringStatement
    | writeStatement
    ;

// Individual Statements

acceptStatement
    : ACCEPT identifier (FROM? (mnemonic_name | environmentName))?
    | ACCEPT identifier FROM? (DATE | DAY | DAY_OF_WEEK | TIME)
    | ACCEPT identifier FROM? CONSOLE
    | ACCEPT identifier FROM? ARGUMENT_NUMBER
    | ACCEPT identifier FROM? ARGUMENT_VALUE
    | ACCEPT identifier FROM? ENVIRONMENT_VALUE
    | ACCEPT identifier FROM? EXCEPTION STATUS
    | ACCEPT identifier (FROM? screen_name)?
      (WITH?
        (NO ECHO)?
        (NO BEEP)?
        (REVERSE_VIDEO | REVERSED | REVERSE)?
        (PROMPT CHARACTER IS? literal)?
        (UPDATE | AUTO | AUTO_SKIP)?
        (UPPER | LOWER)?
        (JUSTIFIED | JUST) RIGHT?
        (SECURE)?
        (SIZE IS? (identifier | integerLiteral))?
        (CONTROL IS? (identifier | literal))?
        (CURSOR IS? identifier)?
      )?
      (ON? EXCEPTION statement)?
      (NOT? ON? EXCEPTION statement)?
      (END_ACCEPT)?
    ;

addStatement
    : ADD (identifier | literal)+ TO (identifier ROUNDED?)+
      (ON? SIZE ERROR statement)?
      (NOT? ON? SIZE ERROR statement)?
      (END_ADD)?
    | ADD (identifier | literal)+
      (TO (identifier | literal)+)?
      GIVING (identifier ROUNDED?)+
      (ON? SIZE ERROR statement)?
      (NOT? ON? SIZE ERROR statement)?
      (END_ADD)?
    ;

alterStatement
    : ALTER (procedureName TO PROCEED TO? procedureName)+
    ;

callStatement
    : CALL (identifier | literal)
      (USING (REFERENCE | CONTENT | VALUE)? identifier+)?
      (RETURNING identifier)?
      (ON? OVERFLOW statement)?
      (ON? EXCEPTION statement)?
      (NOT? ON? EXCEPTION statement)?
      (END_CALL)?
    ;

cancelStatement
    : CANCEL (identifier | literal)+
    ;

closeStatement
    : CLOSE (fileName (WITH? LOCK | WITH? NO REWIND | FOR? REMOVAL)? )+
    ;

computeStatement
    : COMPUTE identifier ROUNDED? = arithmeticExpression
      (ON? SIZE ERROR statement)?
      (NOT? ON? SIZE ERROR statement)?
      (END_COMPUTE)?
    ;

continueStatement
    : CONTINUE
    ;

deleteStatement
    : DELETE fileName RECORD?
      (INVALID KEY statement)?
      (NOT? INVALID KEY statement)?
      (END_DELETE)?
    ;

disableStatement
    : DISABLE (INPUT TERMINAL? | I_O TERMINAL | OUTPUT) fileName
      (WITH? KEY (identifier | literal))?
    ;

displayStatement
    : DISPLAY (identifier | literal)+ (UPON (mnemonic_name | environmentName))?
    | DISPLAY (identifier | literal)+ (UPON CONSOLE)?
    | DISPLAY (identifier | literal)+ (UPON ARGUMENT_NUMBER)?
    | DISPLAY (identifier | literal)+ (UPON ENVIRONMENT_VALUE)?
    | DISPLAY (identifier | literal)+ (UPON EXCEPTION STATUS)?
    | DISPLAY (screen_name)+
      (WITH?
        (BELL | BEEP)?
        (BLANK LINE)?
        (BLANK SCREEN)?
        (REVERSE_VIDEO | REVERSED | REVERSE)?
        (HIGHLIGHT | LOWLIGHT)?
        (BLINK)?
        (UNDERLINE)?
        (OVERLINE)?
      )?
      (ON? EXCEPTION statement)?
      (NOT? ON? EXCEPTION statement)?
      (END_DISPLAY)?
    ;

divideStatement
    : DIVIDE (identifier | literal) INTO (identifier ROUNDED?)+
      (ON? SIZE ERROR statement)?
      (NOT? ON? SIZE ERROR statement)?
      (END_DIVIDE)?
    | DIVIDE (identifier | literal) INTO (identifier | literal)
      GIVING (identifier ROUNDED?)+
      (REMAINDER identifier)?
      (ON? SIZE ERROR statement)?
      (NOT? ON? SIZE ERROR statement)?
      (END_DIVIDE)?
    | DIVIDE (identifier | literal) BY (identifier | literal)
      GIVING (identifier ROUNDED?)+
      (REMAINDER identifier)?
      (ON? SIZE ERROR statement)?
      (NOT? ON? SIZE ERROR statement)?
      (END_DIVIDE)?
    ;

enableStatement
    : ENABLE (INPUT TERMINAL? | I_O TERMINAL | OUTPUT) fileName
      (WITH? KEY (identifier | literal))?
    ;

entryStatement
    : ENTRY literal (USING identifier+)?
    ;

evaluateStatement
    : EVALUATE evaluateSelect
      (ALSO evaluateSelect)*
      evaluateWhen+
      (WHEN OTHER statement+)?
      (END_EVALUATE)?
    ;

evaluateSelect
    : (identifier | literal | arithmeticExpression | condition)
    | TRUE
    | FALSE
    ;

evaluateWhen
    : WHEN evaluateCondition
      (ALSO evaluateCondition)*
      statement+
    ;

evaluateCondition
    : (identifier | literal | arithmeticExpression)
    | (identifier | literal | arithmeticExpression) (THROUGH | THRU) (identifier | literal | arithmeticExpression)
    | ANY
    | condition
    | TRUE
    | FALSE
    ;

exitStatement
    : EXIT (PROGRAM | FUNCTION | METHOD)?
    ;

generateStatement
    : GENERATE (reportName | dataName)
    ;

goToStatement
    : GO TO? procedureName
    | GO TO? procedureName+ DEPENDING ON? identifier
    ;

ifStatement
    : IF condition THEN?
      statement+
      (ELSE statement+)?
      (END_IF)?
    ;

initializeStatement
    : INITIALIZE identifier+
      (WITH? (FILLER | ALL)?)?
      (REPLACING
        ((ALPHABETIC | ALPHANUMERIC | NATIONAL | NUMERIC | ALPHANUMERIC_EDITED | NATIONAL_EDITED | NUMERIC_EDITED) DATA?
         BY (identifier | literal))+)?
    ;

initiateStatement
    : INITIATE (reportName)+
    ;

inspectStatement
    : INSPECT identifier
      (TALLYING (identifier FOR? ((ALL | LEADING | CHARACTERS) (identifier | literal))+ (BEFORE | AFTER) INITIAL? (identifier | literal))*)?
      (REPLACING ((ALL | LEADING | FIRST | CHARACTERS) (identifier | literal) BY (identifier | literal) (BEFORE | AFTER) INITIAL? (identifier | literal))*)?
      (CONVERTING (identifier | literal) TO (identifier | literal) (BEFORE | AFTER) INITIAL? (identifier | literal))?
    ;

mergeStatement
    : MERGE fileName
      (ON? (ASCENDING | DESCENDING) KEY? qualifiedDataName+)+
      (COLLATING? SEQUENCE IS? alphabetName)?
      USING fileName+
      (OUTPUT PROCEDURE IS? procedureName)?
      (GIVING fileName+)?
    ;

moveStatement
    : MOVE (identifier | literal) TO identifier+
    | MOVE CORRESPONDING? identifier TO identifier+
    ;

multiplyStatement
    : MULTIPLY (identifier | literal) BY (identifier ROUNDED?)+
      (ON? SIZE ERROR statement)?
      (NOT? ON? SIZE ERROR statement)?
      (END_MULTIPLY)?
    | MULTIPLY (identifier | literal) BY (identifier | literal)
      GIVING (identifier ROUNDED?)+
      (ON? SIZE ERROR statement)?
      (NOT? ON? SIZE ERROR statement)?
      (END_MULTIPLY)?
    ;

openStatement
    : OPEN
      ((INPUT fileName ((REVERSED | REVERSED) | NO REWIND)? )+ |
       (OUTPUT fileName (NO REWIND)? )+ |
       (I_O fileName)+ |
       (EXTEND fileName)+)
    ;

performStatement
    : PERFORM procedureName
      ((THROUGH | THRU) procedureName)?
      (testUntilPhrase)?
      (performVarying)?
      (END_PERFORM)?
    | PERFORM
      statement+
      (END_PERFORM)?
    ;

testUntilPhrase
    : (WITH? TEST BEFORE | WITH? TEST AFTER)? UNTIL condition
    ;

performVarying
    : VARYING (identifier FROM (identifier | literal | indexName))
      (BY (identifier | literal))?
      UNTIL condition
      (AFTER (identifier FROM (identifier | literal | indexName))
       (BY (identifier | literal))?
       UNTIL condition)*
    ;

purgeStatement
    : PURGE cdName
    ;

cdName
    : cobolWord
    ;

readStatement
    : READ fileName RECORD? (INTO identifier)?
      (WITH? LOCK | WITH? NO LOCK | WITH? WAIT)?
      (KEY IS? qualifiedDataName)?
      (INVALID KEY statement)?
      (NOT? INVALID KEY statement)?
      (AT? END statement)?
      (NOT? AT? END statement)?
      (END_READ)?
    ;

receiveStatement
    : RECEIVE (cdName MESSAGE | cdName SEGMENT?)
      INTO identifier
      (NO DATA statement)?
      (WITH? DATA statement)?
      (END_RECEIVE)?
    ;

releaseStatement
    : RELEASE recordName (FROM identifier)?
    ;

recordName
    : qualifiedDataName
    ;

returnStatement
    : RETURN fileName RECORD? (INTO identifier)?
      (AT? END statement)?
      (NOT? AT? END statement)?
      (END_RETURN)?
    ;

rewriteStatement
    : REWRITE recordName (FROM identifier)?
      (WITH? LOCK | WITH? NO LOCK)?
      (INVALID KEY statement)?
      (NOT? INVALID KEY statement)?
      (END_REWRITE)?
    ;

searchStatement
    : SEARCH identifier (VARYING (identifier | indexName))?
      (AT? END statement)?
      (WHEN condition (NEXT SENTENCE | statement+))+
      (END_SEARCH)?
    | SEARCH ALL identifier
      (AT? END statement)?
      (WHEN condition (NEXT SENTENCE | statement+))
      (END_SEARCH)?
    ;

sendStatement
    : SEND cdName FROM identifier
    | SEND cdName (FROM identifier)?
      (WITH identifier | WITH ESI | WITH EMI | WITH EGI)
      (BEFORE | AFTER) ADVANCING?
      (identifier | integerLiteral LINE? LINES? | PAGE)
    ;

setStatement
    : SET (identifier | indexName)+
      TO (identifier | indexName | integerLiteral)+
    | SET (identifier | indexName)+
      (UP BY | DOWN BY) (identifier | integerLiteral)
    | SET (identifier TO TRUE | identifier TO FALSE)+
    ;

sortStatement
    : SORT fileName
      (ON? (ASCENDING | DESCENDING) KEY? qualifiedDataName+)+
      (WITH? DUPLICATES IN? ORDER)?
      (COLLATING? SEQUENCE IS? alphabetName)?
      (USING fileName+)?
      (INPUT PROCEDURE IS? procedureName ((THROUGH | THRU) procedureName)?)?
      (GIVING fileName+)?
      (OUTPUT PROCEDURE IS? procedureName ((THROUGH | THRU) procedureName)?)?
    ;

startStatement
    : START fileName
      (KEY IS? (EQUAL TO? | = | GREATER THAN? | > | NOT LESS THAN? | NOT < |
              GREATER THAN? OR EQUAL TO? | >= | NOT LESS THAN? OR EQUAL TO? | NOT <= |
              LESS THAN? | < | NOT GREATER THAN? | NOT > |
              LESS THAN? OR EQUAL TO? | <= | NOT GREATER THAN? OR EQUAL TO? | NOT >=)
       qualifiedDataName)?
      (INVALID KEY statement)?
      (NOT? INVALID KEY statement)?
      (END_START)?
    ;

stopStatement
    : STOP (RUN | literal)
    ;

stringStatement
    : STRING
      (identifier | literal)+ (DELIMITED BY? (SIZE | identifier | literal))+
      INTO identifier
      (WITH? POINTER identifier)?
      (ON? OVERFLOW statement)?
      (NOT? ON? OVERFLOW statement)?
      (END_STRING)?
    ;

subtractStatement
    : SUBTRACT (identifier | literal)+ FROM (identifier ROUNDED?)+
      (ON? SIZE ERROR statement)?
      (NOT? ON? SIZE ERROR statement)?
      (END_SUBTRACT)?
    | SUBTRACT (identifier | literal)+
      FROM (identifier | literal)
      GIVING (identifier ROUNDED?)+
      (ON? SIZE ERROR statement)?
      (NOT? ON? SIZE ERROR statement)?
      (END_SUBTRACT)?
    ;

suppressStatement
    : SUPPRESS PRINTING
    ;

terminateStatement
    : TERMINATE (reportName)+
    ;

unlockStatement
    : UNLOCK fileName RECORD?
    ;

unstringStatement
    : UNSTRING identifier
      (DELIMITED BY? ALL? (identifier | literal))+
      INTO (identifier (DELIMITER IN? identifier)? (COUNT IN? identifier)?)+
      (WITH? POINTER identifier)?
      (TALLYING IN? identifier)?
      (ON? OVERFLOW statement)?
      (NOT? ON? OVERFLOW statement)?
      (END_UNSTRING)?
    ;

writeStatement
    : WRITE recordName (FROM identifier)?
      ((BEFORE | AFTER) ADVANCING?
       (identifier | integerLiteral LINE? LINES? | PAGE))?
      (AT? (END_OF_PAGE | EOP) statement)?
      (NOT? AT? (END_OF_PAGE | EOP) statement)?
      (INVALID KEY statement)?
      (NOT? INVALID KEY statement)?
      (END_WRITE)?
    ;

// Conditions and Expressions

condition
    : combinableCondition ((OR | AND) combinableCondition)*
    ;

combinableCondition
    : NOT? simpleCondition
    ;

simpleCondition
    : relationCondition
    | classCondition
    | conditionNameCondition
    | switchStatusCondition
    | signCondition
    ;

relationCondition
    : arithmeticExpression
      (IS? (NOT? GREATER THAN? | NOT? >)
      | IS? (NOT? LESS THAN? | NOT? <)
      | IS? (NOT? EQUAL TO? | NOT? =)
      | IS? (NOT? GREATER THAN? OR EQUAL TO? | NOT? >=)
      | IS? (NOT? LESS THAN? OR EQUAL TO? | NOT? <=))
      arithmeticExpression
    ;

classCondition
    : identifier IS? (NOT? (NUMERIC | ALPHABETIC | ALPHABETIC_LOWER | ALPHABETIC_UPPER | DBCS | KANJI | CLASS className))
    ;

conditionNameCondition
    : condition_name
    ;

condition_name
    : cobolWord
    ;

switchStatusCondition
    : condition_name (IS? (OFF | ON))?
    ;