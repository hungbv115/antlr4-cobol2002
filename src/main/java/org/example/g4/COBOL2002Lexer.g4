lexer grammar Cobol2002Lexer;

// Import statement for any shared grammar files (if needed)
// import SharedLexerRules;

// Channels and modes
channels { COMMENTS_CHANNEL, DIRECTIVE_CHANNEL }

// LEXER RULES
// ============

// Format indicators and area definitions
ASTERISK               : '*' -> channel(COMMENTS_CHANNEL);
FORWARD_SLASH                  : '/';
DOLLAR                 : '$';
COMMA                  : ',';
SEMICOLON             : ';';
COLON                 : ':';
DOT                   : '.';
DOUBLE_QUOTE          : '"';
SINGLE_QUOTE          : '\'';
LEFT_PAREN            : '(';
RIGHT_PAREN           : ')';
EQUAL                 : '=';
GREATER               : '>';
LESS                  : '<';
PLUS                  : '+';
MINUS                 : '-';
START              : '*';
BACK_SLASH                : '/';
POWER                 : '**';
LESSTHANOREQUALTO     : '<=';
GREATERTHANOREQUALTO  : '>=';
NOTEQUALTO            : '<>';

// Comments and compiler directives
COMMENT               : '*>' ~[\r\n]* -> channel(COMMENTS_CHANNEL);
COMPILER_DIRECTIVE    : '>>' ~[\r\n]* -> channel(DIRECTIVE_CHANNEL);
FLOATING_COMMENT      : '*' [ \t]+ ~[\r\n]* -> channel(COMMENTS_CHANNEL);

// Separators and whitespace
WS                    : [ \t\r\n]+ -> skip;
NEWLINE               : [\r\n]+ -> skip;

// Reserved words
// Division headers
IDENTIFICATION        : I D E N T I F I C A T I O N;
ENVIRONMENT           : E N V I R O N M E N T;
DATA                  : D A T A;
PROCEDURE             : P R O C E D U R E;
DIVISION              : D I V I S I O N;
SECTION              : S E C T I O N;

// Commonly used words
PROGRAM_ID           : P R O G R A M MINUSCHAR I D;
AUTHOR              : A U T H O R;
INSTALLATION        : I N S T A L L A T I O N;
DATE_WRITTEN        : D A T E MINUSCHAR W R I T T E N;
DATE_COMPILED       : D A T E MINUSCHAR C O M P I L E D;
SECURITY            : S E C U R I T Y;
COMMON              : C O M M O N;
INITIAL             : I N I T I A L;
RECURSIVE           : R E C U R S I V E;
EXTERNAL            : E X T E R N A L;
SOURCE_COMPUTER     : S O U R C E MINUSCHAR C O M P U T E R;
OBJECT_COMPUTER     : O B J E C T MINUSCHAR C O M P U T E R;
CONFIGURATION       : C O N F I G U R A T I O N;
REPOSITORY          : R E P O S I T O R Y;
FUNCTION            : F U N C T I O N;
INTRINSIC           : I N T R I N S I C;
SPECIAL_NAMES       : S P E C I A L MINUSCHAR N A M E S;
CLASS               : C L A S S;
MNEMONIC_NAME       : M N E M O N I C MINUSCHAR N A M E;
SYMBOLIC            : S Y M B O L I C;
INPUT_OUTPUT        : I N P U T MINUSCHAR O U T P U T;
FILE_CONTROL        : F I L E MINUSCHAR C O N T R O L;
SELECT              : S E L E C T;
OPTIONAL            : O P T I O N A L;
FILE                : F I L E;
ASSIGN              : A S S I G N;
ORGANIZATION        : O R G A N I Z A T I O N;
SEQUENTIAL          : S E Q U E N T I A L;
RELATIVE            : R E L A T I V E;
INDEXED             : I N D E X E D;
ACCESS              : A C C E S S;
MODE                : M O D E;
RANDOM              : R A N D O M;
DYNAMIC             : D Y N A M I C;
RECORD              : R E C O R D;
KEY                 : K E Y;
ALTERNATE           : A L T E R N A T E;
STATUS              : S T A T U S;
WORKING_STORAGE     : W O R K I N G MINUSCHAR S T O R A G E;
LOCAL_STORAGE       : L O C A L MINUSCHAR S T O R A G E;
LINKAGE             : L I N K A G E;
BLOCK               : B L O C K;
CONTAINS            : C O N T A I N S;
CHARACTERS          : C H A R A C T E R S;
COLLATING           : C O L L A T I N G;
SEQUENCE            : S E Q U E N C E;
STANDARD_1          : S T A N D A R D MINUSCHAR '1';
ALPHABET            : A L P H A B E T ;

// Data types
PIC                 : P I C;
PICTURE             : P I C T U R E;
COMP                : C O M P;
COMPUTATIONAL       : C O M P U T A T I O N A L;
BINARY              : B I N A R Y;
PACKED_DECIMAL      : P A C K E D MINUSCHAR D E C I M A L;
VALUE               : V A L U E;
VALUES              : V A L U E S;
USAGE               : U S A G E;
DISPLAY             : D I S P L A Y;
INDEX               : I N D E X;
JUSTIFIED           : J U S T I F I E D;
RIGHT               : R I G H T;
BLANK               : B L A N K;
WHEN                : W H E N;
ZERO                : Z E R O;
ZEROS               : Z E R O S;
ZEROES              : Z E R O E S;
SPACE               : S P A C E;
SPACES              : S P A C E S;
HIGH_VALUE          : H I G H MINUSCHAR V A L U E;
HIGH_VALUES         : H I G H MINUSCHAR V A L U E S;
LOW_VALUE           : L O W MINUSCHAR V A L U E;
LOW_VALUES          : L O W MINUSCHAR V A L U E S;
QUOTE               : Q U O T E;
QUOTES              : Q U O T E S;
ALL                 : A L L;
LEADING             : L E A D I N G;
TRAILING            : T R A I L I N G;
DEPENDING           : D E P E N D I N G;
ASCENDING           : A S C E N D I N G;
DESCENDING          : D E S C E N D I N G;
OCCURS              : O C C U R S;
TIMES               : T I M E S;
VARYING             : V A R Y I N G;
FROM                : F R O M;
BY                  : B Y;
REDEFINES           : R E D E F I N E S;

// Verbs and statements
ACCEPT              : A C C E P T;
ADD                 : A D D;
ALLOCATE            : A L L O C A T E;
ALTER               : A L T E R;
CALL                : C A L L;
CANCEL              : C A N C E L;
CLOSE               : C L O S E;
COMPUTE             : C O M P U T E;
CONTINUE            : C O N T I N U E;
DELETE              : D E L E T E;
DIVIDE              : D I V I D E;
ENTRY               : E N T R Y;
EVALUATE            : E V A L U A T E;
EXIT                : E X I T;
FREE                : F R E E;
GENERATE            : G E N E R A T E;
GO                  : G O;
GOBACK              : G O B A C K;
IF                  : I F;
INITIALIZE          : I N I T I A L I Z E;
INITIATE            : I N I T I A T E;
INSPECT             : I N S P E C T;
INVOKE              : I N V O K E;
MERGE               : M E R G E;
MOVE                : M O V E;
MULTIPLY            : M U L T I P L Y;
OPEN                : O P E N;
PERFORM             : P E R F O R M;
READ                : R E A D;
RELEASE             : R E L E A S E;
RETURN              : R E T U R N;
REWRITE             : R E W R I T E;
SEARCH              : S E A R C H;
SET                 : S E T;
SORT                : S O R T;
START               : S T A R T;
STOP                : S T O P;
STRING              : S T R I N G;
SUBTRACT            : S U B T R A C T;
TERMINATE           : T E R M I N A T E;
TRANSFORM           : T R A N S F O R M;
UNLOCK              : U N L O C K;
UNSTRING            : U N S T R I N G;
WRITE               : W R I T E;
COPY                : C O P Y;
REPLACE             : R E P L A C E;
EJECT               : E J E C T;
SKIP1               : S K I P '1';
SKIP2               : S K I P '2';
SKIP3               : S K I P '3';
TITLE               : T I T L E;

// COBOL 2002 specific reserved words
END_PROGRAM         : E N D MINUSCHAR P R O G R A M;
END_CLASS           : E N D MINUSCHAR C L A S S;
END_METHOD          : E N D MINUSCHAR M E T H O D;
END_OBJECT          : E N D MINUSCHAR O B J E C T;
END_FACTORY         : E N D MINUSCHAR F A C T O R Y;
METHOD_ID           : M E T H O D MINUSCHAR I D;
OBJECT              : O B J E C T;
FACTORY             : F A C T O R Y;
SELF                : S E L F;
SUPER               : S U P E R;
OVERRIDE            : O V E R R I D E;
RAISING             : R A I S I N G;
EXCEPTION           : E X C E P T I O N;
TRY                 : T R Y;
CATCH               : C A T C H;
FINALLY             : F I N A L L Y;
END_TRY             : E N D MINUSCHAR T R Y;
VALIDATE            : V A L I D A T E;
FOR                 : F O R;
THEN                : T H E N;
UNTIL               : U N T I L;
TO                  : T O;
GIVING              : G I V I N G;
REMAINDER           : R E M A I N D E R;
WITH                : W I T H;
TALLYING            : T A L L Y I N G;
ON                  : O N;
OFF                 : O F F;
TRUE                : T R U E;
FALSE               : F A L S E;
NULL                : N U L L;
GLOBAL              : G L O B A L;
LENGTH              : L E N G T H;
ROUNDED             : R O U N D E D;
SIZE                : S I Z E;
ERROR               : E R R O R;
EXTEND              : E X T E N D;
INPUT               : I N P U T;
OUTPUT              : O U T P U T;
I_O                 : I MINUSCHAR O;
USING               : U S I N G;
OF                  : O F;
END                 : E N D;
THROUGH             : T H R O U G H;
THRU                : T H R U;
INTO                : I N T O;
IS                  : I S;
ARE                 : A R E;
NOT                 : N O T;
OR                  : O R;
AND                 : A N D;
ALSO                : A L S O;

// Literals and identifiers
NUMBER_LITERAL      : [0-9]+ ('.' [0-9]+)?;
ALPHANUM_LITERAL    : ('A'..'Z' | 'a'..'z' | '0'..'9')+;
STRING_LITERAL      : '"' (~["\r\n] | '""')* '"' | '\'' (~['\r\n] | '\'\'')* '\'';
IDENTIFIER          : [A-Za-z] [A-Za-z0-9_-]*;

// Word fragment definitions for case-insensitive matching
fragment A          : [aA];
fragment B          : [bB];
fragment C          : [cC];
fragment D          : [dD];
fragment E          : [eE];
fragment F          : [fF];
fragment G          : [gG];
fragment H          : [hH];
fragment I          : [iI];
fragment J          : [jJ];
fragment K          : [kK];
fragment L          : [lL];
fragment M          : [mM];
fragment N          : [nN];
fragment O          : [oO];
fragment P          : [pP];
fragment Q          : [qQ];
fragment R          : [rR];
fragment S          : [sS];
fragment T          : [tT];
fragment U          : [uU];
fragment V          : [vV];
fragment W          : [wW];
fragment X          : [xX];
fragment Y          : [yY];
fragment Z          : [zZ];
fragment MINUSCHAR  : [-_];  // Allows both hyphen and underscore for COBOL's word-with-hyphens