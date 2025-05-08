parser grammar Cobol2002Parser;

options { tokenVocab=Cobol2002Lexer; }

// Start rule for COBOL programs
startRule
    : cobolProgram
    | cobolClass
    ;

// COBOL Program structure
cobolProgram
    : identificationDivision
      (environmentDivision)?
      (dataDivision)?
      (procedureDivision)?
      programEnd
    ;

// COBOL Class structure (COBOL 2002)
cobolClass
    : identificationDivision
      (environmentDivision)?
      (dataDivision)?
      (objectSection)?
      (factorySection)?
      END_CLASS classId DOT
    ;

// IDENTIFICATION DIVISION
identificationDivision
    : IDENTIFICATION DIVISION DOT
      programIdParagraph
      (identificationDivisionContent)*
    ;

programIdParagraph
    : PROGRAM_ID DOT programName
      (AS? qualifiedName)?
      (programAttributes)*
      DOT
    | CLASS_ID DOT classId (INHERITS qualifiedName)? DOT
    | METHOD_ID DOT methodId (OVERRIDE)? DOT
    ;

programAttributes
    : IS? (COMMON | INITIAL | RECURSIVE | EXTERNAL)
    ;

programName
    : IDENTIFIER
    | ALPHANUM_LITERAL
    ;

classId
    : IDENTIFIER
    | ALPHANUM_LITERAL
    ;

qualifiedName
    :
    cobolWord
    ;

methodId
    : IDENTIFIER
    | ALPHANUM_LITERAL
    ;

identificationDivisionContent
    : authorParagraph
    | installationParagraph
    | dateWrittenParagraph
    | dateCompiledParagraph
    | securityParagraph
    | remarksParagraph
    ;

authorParagraph
    : AUTHOR DOT (commentEntry)*
    ;

installationParagraph
    : INSTALLATION DOT (commentEntry)*
    ;

dateWrittenParagraph
    : DATE_WRITTEN DOT (commentEntry)*
    ;

dateCompiledParagraph
    : DATE_COMPILED DOT (commentEntry)*
    ;

securityParagraph
    : SECURITY DOT (commentEntry)*
    ;

remarksParagraph
    : REMARKS DOT (commentEntry)*
    ;

commentEntry
    : ~DOT (DOT ~DOT)*
    ;

// ENVIRONMENT DIVISION
environmentDivision
    : ENVIRONMENT DIVISION DOT
      (configurationSection)?
      (inputOutputSection)?
    ;

// Configuration Section
configurationSection
    : CONFIGURATION SECTION DOT
      (configurationSectionParagraph)*
    ;

configurationSectionParagraph
    : sourceComputerParagraph
    | objectComputerParagraph
    | specialNamesParagraph
    | repositoryParagraph
    ;

sourceComputerParagraph
    : SOURCE_COMPUTER DOT computerName DOT
    ;

objectComputerParagraph
    : OBJECT_COMPUTER DOT computerName
      (memorySize)?
      (diskSize)?
      (collatingSequence)?
      DOT
    ;

computerName
    : IDENTIFIER
    | ALPHANUM_LITERAL
    ;

memorySize
    : MEMORY SIZE? (INTEGER | IDENTIFIER) (WORDS | CHARACTERS | MODULES)?
    ;

diskSize
    : DISK SIZE? IS? INTEGER (WORDS | CHARACTERS | MODULES)?
    ;

collatingSequence
    : PROGRAM? COLLATING? SEQUENCE IS? IDENTIFIER (collatingSequenceDefinition)*
    ;

collatingSequenceDefinition
    : IDENTIFIER (FOR? ALPHANUMERIC IS IDENTIFIER)?
      (FOR? NATIONAL IS IDENTIFIER)?
    ;

specialNamesParagraph
    : SPECIAL_NAMES DOT (specialNameClause)* DOT
    ;

specialNameClause
    : implementationName (IS mnemonicName)?
      (ON STATUS IS? condition (OFF STATUS IS? condition)?)?
      (OFF STATUS IS? condition (ON STATUS IS? condition)?)?
    | CURRENCY SIGN? IS? literal
    | DECIMAL_POINT IS? COMMA
    | SYMBOLIC CHARACTERS? IS? symbolicCharacters (IN alphabet)?
    | CLASS className (IS? className)+
    | LOCALE localeName IS? literal
    | alphabetDefinition
    ;

alphabet
    :
    ALPHABET
    ;

implementationName
    : IDENTIFIER
    | ALPHANUM_LITERAL
    ;

mnemonicName
    : IDENTIFIER
    ;

//condition
//    : IDENTIFIER
//    ;

symbolicCharacters
    : symbolicCharacter (symbolicCharacter)*
    ;

symbolicCharacter
    : IDENTIFIER ((IS | ARE) INTEGER (INTEGER)*)?
    ;

className
    : IDENTIFIER
    ;

localeName
    : IDENTIFIER
    ;

alphabetDefinition
    : ALPHABET alphabetName IS
      (STANDARD_1 | STANDARD_2 | NATIVE | EBCDIC | literal)
      (THROUGH | THRU)? literal
      (alphabetAlso)?
    ;

alphabetAlso
    : ALSO literal (ALSO literal)*
    ;

alphabetName
    : IDENTIFIER
    ;

// Repository paragraph for object-oriented COBOL
repositoryParagraph
    : REPOSITORY DOT (repositoryEntry)*
    ;

repositoryEntry
    : CLASS className EXTERNAL? (AS? externalClassName)? DOT
    | FUNCTION (ALL INTRINSIC)?
      (functionName (AS? functionPrototype)?)*
      DOT
    ;

externalClassName
    : IDENTIFIER
    | ALPHANUM_LITERAL
    ;

functionName
    : IDENTIFIER
    | intrinsicFunctionName
    ;

functionPrototype
    : IDENTIFIER
    ;

intrinsicFunctionName
    : ABS | ACOS | ANNUITY | ASIN | ATAN | CHAR | COS | CURRENT_DATE | DATE_OF_INTEGER
    | DAY_OF_INTEGER | FACTORIAL | INTEGER | INTEGER_OF_DATE | INTEGER_OF_DAY | INTEGER_PART
    | LENGTH | LOG | LOG10 | LOWER_CASE | MAX | MEAN | MEDIAN | MIDRANGE | MIN | MOD
    | NUMVAL | NUMVAL_C | ORD | ORD_MAX | ORD_MIN | PRESENT_VALUE | RANDOM
    | RANGE | REM | REVERSE | SIN | SQRT | STANDARD_DEVIATION | SUM | TAN
    | UPPER_CASE | VARIANCE | WHEN_COMPILED
    ;

// Input-Output Section
inputOutputSection
    : INPUT_OUTPUT SECTION DOT
      (fileControlParagraph)?
      (ioControlParagraph)?
    ;

fileControlParagraph
    : FILE_CONTROL DOT (fileControlEntry)*
    ;

fileControlEntry
    : SELECT (OPTIONAL)? fileName ASSIGN TO? assignmentName
      (fileAttributes)* DOT
    ;

fileName
    : IDENTIFIER
    ;

assignmentName
    : IDENTIFIER
    | literal
    ;

fileAttributes
    : organizationClause
    | accessModeClause
    | alternateKeyClause
    | fileStatusClause
    | lockModeClause
    | codeSetClause
    | collatingSequenceClause
    | recordDelimiterClause
    | paddingCharacterClause
    | blockContainsClause
    | recordContainsClause
    ;

organizationClause
    : ORGANIZATION IS? (SEQUENTIAL | RELATIVE | INDEXED)
    | (SEQUENTIAL | RELATIVE | INDEXED)
    ;

accessModeClause
    : ACCESS MODE? IS? (SEQUENTIAL | RANDOM | DYNAMIC)
    ;

alternateKeyClause
    : ALTERNATE? RECORD? KEY IS? qualifiedDataName (WITH? DUPLICATES)?
    ;

fileStatusClause
    : FILE? STATUS IS? qualifiedDataName (qualifiedDataName)?
    ;

lockModeClause
    : LOCK MODE? IS? (MANUAL | AUTOMATIC)
    ;

codeSetClause
    : CODE_SET IS? alphabetName
    ;

collatingSequenceClause
    : COLLATING? SEQUENCE IS? alphabetName
    ;

recordDelimiterClause
    : RECORD DELIMITER IS? (STANDARD_1 | assignmentName)
    ;

paddingCharacterClause
    : PADDING CHARACTER? IS? (qualifiedDataName | literal)
    ;

blockContainsClause
    : BLOCK CONTAINS? (INTEGER TO)? INTEGER (RECORDS | CHARACTERS)?
    ;

recordContainsClause
    : RECORD (CONTAINS? INTEGER | VARYING IN? SIZE? (FROM? INTEGER)? (TO INTEGER)? CHARACTERS?
      (DEPENDING ON? qualifiedDataName)?)
    ;

ioControlParagraph
    : I_O_CONTROL DOT (ioControlClause)*
    ;

ioControlClause
    : RERUN ON? (assignmentName | fileName) EVERY? rerunCondition
    | SAME (RECORD | SORT | SORT_MERGE)? AREA? FOR? fileName (fileName)*
    | MULTIPLE FILE TAPE? CONTAINS? multipleFileClause (multipleFileClause)*
    | COMMIT ON? (fileName)
    ;

rerunCondition
    : (END | EOP) OF? (REEL | UNIT) (OF? fileName)?
    | INTEGER RECORDS (OF? fileName)?
    | rerunConditionInterval
    ;

rerunConditionInterval
    : CLOCK_UNITS
    | INTEGER (RECORDS | SECONDS | MILLISECONDS | MICROSECONDS | MINUTES)
    ;

multipleFileClause
    : fileName (POSITION INTEGER)?
    ;

// DATA DIVISION
dataDivision
    : DATA DIVISION DOT
      (fileSection)?
      (workingStorageSection)?
      (localStorageSection)?
      (linkageSection)?
      (communicationSection)?
      (reportSection)?
      (screenSection)?
    ;

// File Section
fileSection
    : FILE SECTION DOT
      (fileDescriptionEntry)*
    ;

fileDescriptionEntry
    : FD fileName
      (fdAttribute)*
      DOT
      (dataDescription)*
    ;

fdAttribute
    : IS? EXTERNAL
    | IS? GLOBAL
    | blockContains
    | recordClause
    | labelRecords
    | valueOfClause
    | dataRecords
    | linageClause
    | codeSetClause
    | reportClause
    ;

blockContains
    : BLOCK CONTAINS? INTEGER (TO INTEGER)? (RECORDS | CHARACTERS)?
    ;

recordClause
    : RECORD (CONTAINS? INTEGER CHARACTERS?)?
    | RECORD VARYING IN? SIZE? (FROM? INTEGER)? (TO INTEGER)? CHARACTERS? (DEPENDING ON? qualifiedDataName)?
    | RECORD IS? VARYING (DEPENDING ON? qualifiedDataName)?
    ;

labelRecords
    : LABEL (RECORD IS? | RECORDS ARE?) (STANDARD | OMITTED)
    ;

valueOfClause
    : VALUE OF dataName IS? (qualifiedDataName | literal) (dataName IS? (qualifiedDataName | literal))*
    ;

dataRecords
    : DATA (RECORD IS? | RECORDS ARE?) dataName (dataName)*
    ;

linageClause
    : LINAGE IS? (dataName | INTEGER) LINES?
      (WITH? FOOTING AT? (dataName | INTEGER))?
      (LINES? AT? TOP (dataName | INTEGER))?
      (LINES? AT? BOTTOM (dataName | INTEGER))?
    ;

reportClause
    : REPORT IS? reportName (reportName)*
    ;

dataName
    : IDENTIFIER
    ;

reportName
    : IDENTIFIER
    ;

// Working-Storage Section
workingStorageSection
    : WORKING_STORAGE SECTION DOT
      (dataDescription)*
    ;

// Local-Storage Section
localStorageSection
    : LOCAL_STORAGE SECTION DOT
      (dataDescription)*
    ;

// Linkage Section
linkageSection
    : LINKAGE SECTION DOT
      (dataDescription)*
    ;

// Communication Section
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
    : CD communicationName
      (FOR? INITIAL? INPUT)?
      (cdInputAttributes)*
      DOT
      (dataDescription)*
    ;

cdInputAttributes
    : symbolicQueueClause
    | symbolicSubQueueClause
    | messageDateClause
    | messageTimeClause
    | symbolicSourceClause
    | textLengthClause
    | endKeyClause
    | statusKeyClause
    | messageCountClause
    ;

symbolicQueueClause
    : SYMBOLIC QUEUE? IS? dataName
    ;

symbolicSubQueueClause
    : SYMBOLIC SUB_QUEUE? IS? dataName
    ;

messageDateClause
    : MESSAGE DATE? IS? dataName
    ;

messageTimeClause
    : MESSAGE TIME? IS? dataName
    ;

symbolicSourceClause
    : SYMBOLIC SOURCE? IS? dataName
    ;

textLengthClause
    : TEXT LENGTH? IS? dataName
    ;

endKeyClause
    : END KEY? IS? dataName
    ;

statusKeyClause
    : STATUS KEY? IS? dataName
    ;

messageCountClause
    : MESSAGE COUNT? IS? dataName
    ;

cdOutputEntry
    : CD communicationName
      (FOR? OUTPUT)?
      (cdOutputAttributes)*
      DOT
      (dataDescription)*
    ;

cdOutputAttributes
    : destinationCountClause
    | textLengthClause
    | statusKeyClause
    | destinationTableClause
    | errorKeyClause
    | symbolicDestinationClause
    ;

destinationCountClause
    : DESTINATION COUNT? IS? dataName
    ;

destinationTableClause
    : DESTINATION TABLE? OCCURS INTEGER TIMES? (INDEXED BY indexName+)?
    ;

errorKeyClause
    : ERROR KEY? IS? dataName
    ;

symbolicDestinationClause
    : SYMBOLIC DESTINATION? IS? dataName
    ;

cdInputOutputEntry
    : CD communicationName
      (FOR? INITIAL? I_O)?
      (cdInputOutputAttributes)*
      DOT
      (dataDescription)*
    ;

cdInputOutputAttributes
    : messageDateClause
    | messageTimeClause
    | symbolicTerminalClause
    | textLengthClause
    | endKeyClause
    | statusKeyClause
    ;

symbolicTerminalClause
    : SYMBOLIC TERMINAL? IS? dataName
    ;

communicationName
    : IDENTIFIER
    ;

// Report Section
reportSection
    : REPORT SECTION DOT
      (reportDescriptionEntry)*
    ;

reportDescriptionEntry
    : RD reportName
      (reportDescriptionEntryAttribute)*
      DOT
      (reportGroupDescriptionEntry)*
    ;

reportDescriptionEntryAttribute
    : IS? GLOBAL
    | WITH? CODE dataName
    | controlClause
    | pageClause
    ;

controlClause
    : (CONTROL IS? | CONTROLS ARE?) (FINAL)? (reportName | dataName)*
    ;

pageClause
    : PAGE (limitClause)*
    ;

limitClause
    : LIMIT IS? | LIMITS ARE?
    | HEADING IS? INTEGER
    | FIRST DETAIL? IS? INTEGER
    | LAST DETAIL? IS? INTEGER
    | FOOTING IS? INTEGER
    ;

reportGroupDescriptionEntry
    : level (dataName | FILLER)?
      (reportGroupDescriptionEntryAttribute)*
      DOT
    ;

reportGroupDescriptionEntryAttribute
    : typeLine
    | typeSource
    | typeUsage
    | typeNextGroup
    ;

typeLine
    : LINE? NUMBER? IS? (dataName | INTEGER | PLUS INTEGER | NEXT PAGE?)
    ;

typeSource
    : SOURCE IS? (dataName | literal) (dataName | literal)*
    ;

typeUsage
    : USAGE IS? (DISPLAY | BINARY | COMPUTATIONAL | PACKED_DECIMAL)
    ;

typeNextGroup
    : NEXT GROUP? IS? (dataName | INTEGER | PLUS INTEGER | NEXT PAGE?)
    ;

// Screen Section
screenSection
    : SCREEN SECTION DOT
      (screenDescriptionEntry)*
    ;

screenDescriptionEntry
    : level (dataName | FILLER)?
      (screenDescriptionAttribute)*
      DOT
    ;

screenDescriptionAttribute
    : BLANK (SCREEN | LINE)
    | BELL
    | BLINK
    | ERASE (EOL | EOS)
    | HIGHLIGHT
    | LOWLIGHT
    | REQUIRED
    | REVERSE_VIDEO
    | SECURE
    | UNDERLINE
    | AUTO
    | FULL
    | LINE? NUMBER? IS? (dataName | INTEGER)
    | COLUMN? NUMBER? IS? (dataName | INTEGER)
    | FOREGROUND_COLOR IS? (dataName | INTEGER)
    | BACKGROUND_COLOR IS? (dataName | INTEGER)
    | CONTROL IS? VALUE IS? (literal | dataName)
    | VALUE IS? (literal | dataName)
    | PICTURE IS? pictureString
    | PIC IS? pictureString
    | FROM (literal | dataName)
    | TO dataName
    | USING dataName
    | JUSTIFIED? RIGHT?
    | SIGN IS? (LEADING | TRAILING) (SEPARATE CHARACTER?)?
    | BLANK WHEN? ZERO
    | OCCURS INTEGER TIMES?
    | OCCURS INTEGER TO INTEGER TIMES? DEPENDING ON? dataName
    ;

// Data description
dataDescription
    : dataDescriptionEntry
    | conditionNameEntry
    | dataRenamesEntry
    ;

dataDescriptionEntry
    : level (dataName | FILLER)?
      (dataDescriptionAttribute)*
      DOT
    ;

level
    : INTEGER
    | LEVEL_NUMBER_77
    | LEVEL_NUMBER_66
    | LEVEL_NUMBER_88
    ;

dataDescriptionAttribute
    : REDEFINES dataName
    | IS? EXTERNAL (AS? literal)?
    | IS? GLOBAL
    | PICTURE IS? pictureString
    | PIC IS? pictureString
    | USAGE IS? usage
    | (SIGN IS?)? (LEADING | TRAILING) (SEPARATE CHARACTER?)?
    | OCCURS INTEGER TIMES? (occursAttribute)*
    | OCCURS INTEGER TO INTEGER TIMES? DEPENDING ON? qualifiedDataName (occursAttribute)*
    | synchronized
    | justified
    | blankWhenZero
    | VALUE IS? literal
    | dataCommonAttribute
    | typeDefClause
    ;

occursAttribute
    : ASCENDING | DESCENDING KEY? IS? qualifiedDataName (qualifiedDataName)*
    | INDEXED BY? indexName (indexName)*
    ;

synchronized
    : SYNCHRONIZED | SYNC (LEFT | RIGHT)?
    ;

justified
    : JUSTIFIED | JUST RIGHT?
    ;

blankWhenZero
    : BLANK WHEN? ZERO
    ;

pictureString
    : STRING_LITERAL
    | IDENTIFIER
    ;

usage
    : BINARY (TRUNCATED | EXTENDED)?
    | DISPLAY
    | INDEX
    | PACKED_DECIMAL
    | COMPUTATIONAL | COMP
    | COMPUTATIONAL_1 | COMP_1
    | COMPUTATIONAL_2 | COMP_2
    | COMPUTATIONAL_3 | COMP_3
    | COMPUTATIONAL_4 | COMP_4
    | COMPUTATIONAL_5 | COMP_5
    | POINTER
    | PROCEDURE_POINTER
    | FUNCTION_POINTER
    | OBJECT REFERENCE (className)?
    ;

indexName
    : IDENTIFIER
    ;

conditionNameEntry
    : LEVEL_NUMBER_88 conditionName VALUE IS? literal (THROUGH | THRU)? literal DOT
    | LEVEL_NUMBER_88 conditionName VALUES? ARE? literal (THROUGH | THRU)? literal
      (literal (THROUGH | THRU)? literal)* DOT
    ;

conditionName
    : IDENTIFIER
    ;

dataRenamesEntry
    : LEVEL_NUMBER_66 dataName RENAMES qualifiedDataName
      (THROUGH | THRU)? qualifiedDataName DOT
    ;

dataCommonAttribute
    : IS? (TYPEDEF | BASED | ANY LENGTH | CONSTANT)
    ;

typeDefClause
    : IS? TYPEDEF (STRONG | WEAK)?
    ;

// Qualified data name
qualifiedDataName
    : (dataName | conditionName) ((IN | OF) (dataName | fileName))*
    ;

// PROCEDURE DIVISION
procedureDivision
    : PROCEDURE DIVISION
      (USING? procedureDivisionUsingParameter (procedureDivisionUsingParameter)*)?
      (RETURNING? procedureDivisionReturningItem)?
      DOT
      (declaratives)?
      (procedureBodyDivision)?
    ;

procedureDivisionUsingParameter
    : (BY? (REFERENCE | VALUE | CONTENT))? procedureDivisionByItem (procedureDivisionByItem)*
    ;

procedureDivisionByItem
    : dataName (AS? IDENTIFIER)?
    ;

procedureDivisionReturningItem
    : dataName
    ;

declaratives
    : DECLARATIVES DOT
      (procedureSection)+
      END DECLARATIVES DOT
    ;

procedureBodyDivision
    : (procedureSection | procedureDeclaration)*
    ;

procedureSection
    : procedureSectionHeader
      DOT
      (USE statement DOT)?
      (procedureDivisionBody)
    ;

procedureSectionHeader
    : sectionName SECTION (INTEGER)?
    ;

sectionName
    : IDENTIFIER
    ;

procedureDivisionBody
    : (paragraphs | statement)*
    ;

paragraphs
    : paragraphName DOT
      (procedureDivisionBody)?
    ;

paragraphName
    : IDENTIFIER
    | integerConstant
    ;

integerConstant
    : INTEGER
    ;

procedureDeclaration
    : methodDeclaration
    ;

methodDeclaration
    : METHOD_ID methodName DOT procedureDivision END_METHOD DOT
    ;

methodName
    : IDENTIFIER
    ;


// Statement
statement
    : (acceptStatement
    | addStatement
    | allocateStatement
    | alterStatement
    | callStatement
    | cancelStatement
    | closeStatement
    | commitStatement
    | computeStatement
    | continueStatement
    | deleteStatement
    | disableStatement
    | displayStatement
    | divideStatement
    | enableStatement
    | entryStatement
    | evaluateStatement
    | exhibitStatement
    | exitStatement
    | freeStatement
    | generateStatement
    | goToStatement
    | gobackStatement
    | ifStatement
    | initializeStatement
    | initiateStatement
    | inspectStatement
    | invokeStatement
    | mergeStatement
    | moveStatement
    | multiplyStatement
    | nextSentenceStatement
    | openStatement
    | performStatement
    | purgeStatement
    | raiseStatement
    | readStatement
    | receiveStatement
    | releaseStatement
    | returnStatement
    | rewriteStatement
    | rollbackStatement
    | searchStatement
    | sendStatement
    | setStatement
    | sortStatement
    | startStatement
    | stopStatement
    | stringStatement
    | subtractStatement
    | terminateStatement
    | unstringStatement
    | validateStatement
    | writeStatement) DOT?
    | EXEC (SQL | CICS | DLI | ADO) procedureDivisionBody END_EXEC DOT
    ;

// Statements definition
acceptStatement
    : ACCEPT identifier (acceptFromSpecification)? (onExceptionClause)* (notOnExceptionClause)*
    ;

acceptFromSpecification
    : FROM (fromMnemonicName | fromDate | fromEscapeKey | fromLocale)
      (acceptFormat)?
    ;

fromMnemonicName
    : mnemonicName
    ;

fromDate
    : DATE (YYYYMMDD)?
    | DAY (YYYYDDD)?
    | DAY_OF_WEEK
    | TIME
    | TIMER
    | TODAYS_DATE
    | TODAYS_NAME
    | YEAR
    | YYYYMMDD
    | YYYYDDD
    ;

fromEscapeKey
    : ESCAPE KEY
    ;

fromLocale
    : LOCAL
    ;

acceptFormat
    : WITH? (NO? HIGHLIGHT
    | NO? BLINK
    | UNDERLINE
    | REVERSE_VIDEO
    | SIZE literal
    | MODE IS BLOCK
    | LINE literal
    | POSITION literal
    | COLOR literal
    | FOREGROUND_COLOR literal
    | BACKGROUND_COLOR literal
    | (CONTROL KEY | KEY | CONTROL) identifier)
    ;

onExceptionClause
    : ON? EXCEPTION procedureDivisionBody
    ;

notOnExceptionClause
    : NOT? ON? EXCEPTION procedureDivisionBody
    ;

addStatement
    : ADD (addToStatement | addGivingStatement | addCorrespondingStatement)
    ;

addToStatement
    : addSender (addSender)* TO addTo (addTo)* (onSizeErrorPhrase)? (notOnSizeErrorPhrase)?
    ;

addGivingStatement
    : addSender (addSender)* (TO addSender (addSender)*)? GIVING addGiving (addGiving)* (onSizeErrorPhrase)? (notOnSizeErrorPhrase)?
    ;

addCorrespondingStatement
    : (CORRESPONDING | CORR) addSender TO addTo (ROUNDED)? (onSizeErrorPhrase)? (notOnSizeErrorPhrase)?
    ;

addSender
    : identifier
    | literal
    ;

addTo
    : identifier (ROUNDED)?
    ;

addGiving
    : identifier (ROUNDED)?
    ;

onSizeErrorPhrase
    : ON? SIZE ERROR procedureDivisionBody
    ;

notOnSizeErrorPhrase
    : NOT? ON? SIZE ERROR procedureDivisionBody
    ;

allocateStatement
    : ALLOCATE (INITIALIZED)? (dataItemDescription | identifier)
      (RETURNING pointer)
    ;

dataItemDescription
    : dataDescription
    ;

pointer
    : identifier
    ;

alterStatement
    : ALTER alterProceedTo (alterProceedTo)*
    ;

alterProceedTo
    : procedureName TO PROCEED TO? procedureName
    ;

procedureName
    : paragraphName (IN | OF)? sectionName
    | sectionName
    ;

callStatement
    : CALL (literal | identifier)
      (callUsingPhrase)?
      (callGivingPhrase)?
      (onOverflowPhrase | onExceptionClause | notOnExceptionClause)?
    ;

callUsingPhrase
    : USING (callByContent | callByReference | callByValue) (callByContent | callByReference | callByValue)*
    ;

callByContent
    : (BY? CONTENT) callByContentItem (callByContentItem)*
    ;

callByContentItem
    : identifier
    | literal
    | expression
    ;

callByReference
    : (BY? REFERENCE) callByReferenceItem (callByReferenceItem)*
    ;

callByReferenceItem
    : ((ADDRESS OF))? identifier
    | literal
    | FILE fileName
    ;

callByValue
    : (BY? VALUE) callByValueItem (callByValueItem)*
    ;

callByValueItem
    : ((ADDRESS OF))? identifier
    | literal
    | expression
    ;

callGivingPhrase
    : (GIVING | RETURNING) identifier
    ;

onOverflowPhrase
    : ON? OVERFLOW procedureDivisionBody
    ;

cancelStatement
    : CANCEL cancelCall (cancelCall)*
    ;

cancelCall
    : identifier | literal
    ;

closeStatement
    : CLOSE closeFile (closeFile)*
    ;

closeFile
    : fileName (closeReelUnitStatement | closeRelativeStatement | closePortFileIOStatement)?
    ;

closeReelUnitStatement
    : (REEL | UNIT) (FOR? REMOVAL)? (WITH? NO? REWIND)?
    ;

closeRelativeStatement
    : WITH? (NO? REWIND | LOCK)
    ;

closePortFileIOStatement
    : (WITH? NO? WAIT)?
    ;

commitStatement
    : COMMIT
    ;

computeStatement
    : COMPUTE computeStore (computeStore)* EQUAL expression
      (onSizeErrorPhrase)? (notOnSizeErrorPhrase)?
    ;

computeStore
    : identifier (ROUNDED)?
    ;

continueStatement
    : CONTINUE
    ;

deleteStatement
    : DELETE fileName RECORD?
      (INVALID KEY? procedureDivisionBody)?
      (NOT? INVALID KEY? procedureDivisionBody)?
    ;

disableStatement
    : DISABLE (INPUT (TERMINAL)? | I_O TERMINAL | OUTPUT) communicationDescription
      (WITH? KEY literal | identifier)?
    ;

communicationDescription
    : literal | identifier | dataName
    ;

displayStatement
    : DISPLAY displayOperand (displayOperand)*
      (UPON displayUpon)?
      (WITH? NO? ADVANCING)?
      (WITH? displayAttribute (displayAttribute)*)?
      (onExceptionClause | notOnExceptionClause)*
    ;

displayOperand
    : identifier | literal
    ;

displayUpon
    : mnemonicName | environmentName
    ;

environmentName
   : systemName
   ;

systemName
   : cobolWord
   ;

displayAttribute
    : BELL
    | BLINK
    | HIGHLIGHT
    | LOWLIGHT
    | REVERSE_VIDEO
    | UNDERLINE
    | AT? (LINE | COLUMN | POSITION | COL | POS) (identifier | literal)
    ;

divideStatement
    : DIVIDE (identifier | literal) INTO divideInto (divideInto)*
      (onSizeErrorPhrase)? (notOnSizeErrorPhrase)?
    | DIVIDE (identifier | literal) INTO (identifier | literal)
      GIVING divideGiving (divideGiving)*
      (REMAINDER identifier)?
      (onSizeErrorPhrase)? (notOnSizeErrorPhrase)?
    | DIVIDE (identifier | literal) BY (identifier | literal)
      GIVING divideGiving (divideGiving)*
      (REMAINDER identifier)?
      (onSizeErrorPhrase)? (notOnSizeErrorPhrase)?
    ;

divideInto
    : identifier (ROUNDED)?
    ;

divideGiving
    : identifier (ROUNDED)?
    ;

enableStatement
    : ENABLE (INPUT (TERMINAL)? | I_O TERMINAL | OUTPUT) communicationDescription
      (WITH? KEY literal | identifier)?
    ;

entryStatement
    : ENTRY literal (USING identifier (identifier)*)?
    ;

evaluateStatement
    : EVALUATE evaluateSelect (evaluateSelect)* evaluateAlso* evaluateWhenClause* evaluateWhenOther?
    ;

evaluateSelect
    : identifier | literal | expression | TRUE | FALSE
    ;

evaluateAlso
    : ALSO evaluateSelect (evaluateSelect)*
    ;

evaluateWhenClause
    : WHEN evaluateCondition evaluateAlsoCondition* procedureDivisionBody
    ;

evaluateAlsoCondition
    : ALSO evaluateCondition
    ;

evaluateCondition
    : ANY | condition | TRUE | FALSE
    | evaluateValue (THROUGH | THRU) evaluateValue
    | evaluateValue
    ;

evaluateValue
    : identifier | literal | expression
    ;

evaluateWhenOther
    : WHEN OTHER procedureDivisionBody
    ;

exitStatement
    : EXIT (PROGRAM | METHOD | FUNCTION | PERFORM | PARAGRAPH)?
    ;

freeStatement
    : FREE identifier (identifier)*
    ;

generateStatement
    : GENERATE reportName
    ;

goToStatement
    : GO TO? procedureName (identifier)*
    ;

gobackStatement
    : GOBACK
    ;

ifStatement
    : IF condition ifThen (ifElse)?
    ;

ifThen
    : THEN? (NEXT SENTENCE | statement*)
    ;

ifElse
    : ELSE (NEXT SENTENCE | statement*)
    ;

condition
    : combinableCondition (AND | OR) condition
    | combinableCondition
    ;

combinableCondition
    : NOT? simpleCondition
    ;

simpleCondition
    : relationCondition
    | classCondition
    | conditionNameReference
    | switchStatusCondition
    | (IDENTIFIER | LITERAL) IS? NOT? (POSITIVE | NEGATIVE | ZERO)
    | (IDENTIFIER | LITERAL) IS? (NUMERIC | ALPHABETIC | ALPHABETIC_LOWER | ALPHABETIC_UPPER)
    ;

relationCondition
    : arithmeticExpression relationalOperator arithmeticExpression
    ;

relationalOperator
    : IS? (NOT? (GREATER THAN? | LESS THAN? | EQUAL TO?))
    | IS? EQUAL TO?
    | IS? NOT? GREATER THAN?
    | IS? NOT? LESS THAN?
    | IS? GREATER THAN? OR EQUAL TO?
    | IS? LESS THAN? OR EQUAL TO?
    ;

classCondition
    : identifier IS? NOT? className
    ;

conditionNameReference
    : conditionName (IN | OF identifier)*
    ;

switchStatusCondition
    : conditionName
    ;

initializeStatement
    : INITIALIZE identifier (identifier)*
      (REPLACING initializeReplacingPhrase (initializeReplacingPhrase)*)?
    ;

initializeReplacingPhrase
    : ALPHANUMERIC | ALPHANUMERIC_EDITED | NATIONAL | NATIONAL_EDITED | NUMERIC | NUMERIC_EDITED | DBCS | EGCS
      BY identifier | literal
    ;

initiateStatement
    : INITIATE reportName (reportName)*
    ;

inspectStatement
    : INSPECT identifier
      (inspectTallyingPhrase | inspectReplacingPhrase | inspectTallyingReplacingPhrase | inspectConvertingPhrase)
    ;

inspectTallyingPhrase
    : TALLYING inspectFor (inspectFor)*
    ;

inspectReplacingPhrase
    : REPLACING inspectReplacingAllLeading (inspectReplacingAllLeading)*
    ;

inspectTallyingReplacingPhrase
    : TALLYING inspectFor (inspectFor)* REPLACING inspectReplacingAllLeading (inspectReplacingAllLeading)*
    ;

inspectConvertingPhrase
    : CONVERTING (identifier | literal)
      TO (identifier | literal)
      inspectBeforeAfter*
    ;

inspectFor
    : identifier FOR? (ALL | LEADING | CHARACTERS)
      (identifier | literal)? inspectBeforeAfter*
    ;

inspectReplacingAllLeading
    : (ALL | FIRST | LEADING | CHARACTERS)
      (identifier | literal)
      BY (identifier | literal)
      inspectBeforeAfter*
    ;

inspectBeforeAfter
    : (BEFORE | AFTER) INITIAL? (identifier | literal)
    ;

invokeStatement
    : INVOKE identifier ((USING (BY? (REFERENCE | CONTENT | VALUE))? invokeItem (invokeItem)*))? (RETURNING identifier)?
    ;

invokeItem
    : identifier
    | literal
    | expression
    ;

mergeStatement
    : MERGE fileName ASCENDING? KEY? identifier (identifier)*
      (COLLATING? SEQUENCE IS? alphabetName)?
      USING fileName (fileName)*
      outputProcedurePhrase
    ;

outputProcedurePhrase
    : OUTPUT PROCEDURE IS? procedureName (THROUGH | THRU)? procedureName
    | GIVING fileName (fileName)*
    ;

moveStatement
    : MOVE (moveToStatement | moveCorrespondingToStatement)
    ;

moveToStatement
    : (identifier | literal) TO identifier (identifier)*
    ;

moveCorrespondingToStatement
    : (CORRESPONDING | CORR) identifier TO identifier (identifier)*
    ;

multiplyStatement
    : MULTIPLY (identifier | literal) BY multiplyOperand (multiplyOperand)*
      (onSizeErrorPhrase)? (notOnSizeErrorPhrase)?
    | MULTIPLY (identifier | literal) BY (identifier | literal) GIVING multiplyGiving (multiplyGiving)*
      (onSizeErrorPhrase)? (notOnSizeErrorPhrase)?
    ;

multiplyOperand
    : identifier (ROUNDED)?
    ;

multiplyGiving
    : identifier (ROUNDED)?
    ;

nextSentenceStatement
    : NEXT SENTENCE
    ;

openStatement
    : OPEN (openInputStatement | openOutputStatement | openIOStatement | openExtendStatement)*
    ;

openInputStatement
    : INPUT openFile (openFile)*
    ;

openOutputStatement
    : OUTPUT openFile (openFile)*
    ;

openIOStatement
    : I_O openFile (openFile)*
    ;

openExtendStatement
    : EXTEND openFile (openFile)*
    ;

openFile
    : fileName (REVERSED | WITH? NO? REWIND)?
    ;

performStatement
    : PERFORM ((procedureName (THROUGH | THRU)? procedureName) | identifier)
      (WITH? TEST (BEFORE | AFTER))?
      (performTimes | performUntil | performVarying)?
    ;

performTimes
    : (identifier | literal) TIMES
    ;

performUntil
    : UNTIL condition
    ;

performVarying
    : VARYING performVaryingClause (AFTER performVaryingClause)*
    ;

performVaryingClause
    : identifier FROM (identifier | literal | arithmeticExpression)
      BY (identifier | literal | arithmeticExpression)
      UNTIL condition
    ;

purgeStatement
    : PURGE communicationDescriptionEntry
    ;

raiseStatement
    : RAISE exceptionName
    ;

exceptionName
    : identifier
    ;

readStatement
    : READ fileName NEXT? RECORD?
      (INTO identifier)?
      (KEY IS? identifier)?
      (INVALID KEY? procedureDivisionBody)?
      (NOT? INVALID KEY? procedureDivisionBody)?
      (AT? END procedureDivisionBody)?
      (NOT? AT? END procedureDivisionBody)?
    ;

receiveStatement
    : RECEIVE (communicationDescription | identifier) FROM communicationDescription
      (MESSAGE | SEGMENT)? (INTO identifier)?
      (onExceptionClause)?
      (noDataClause)?
    ;

noDataClause
    : NO DATA procedureDivisionBody
    ;

releaseStatement
    : RELEASE recordName (FROM identifier)?
    ;

recordName
    : identifier
    ;

returnStatement
    : RETURN fileName RECORD?
      (INTO identifier)?
      (AT? END procedureDivisionBody)?
      (NOT? AT? END procedureDivisionBody)?
    ;

rewriteStatement
    : REWRITE recordName (FROM identifier)?
      (INVALID KEY? procedureDivisionBody)?
      (NOT? INVALID KEY? procedureDivisionBody)?
    ;

rollbackStatement
    : ROLLBACK
    ;

searchStatement
    : SEARCH identifier (VARYING identifier)?
      (AT? END procedureDivisionBody)?
      WHEN searchCondition (searchWhen)*
    | SEARCH ALL identifier
      (AT? END procedureDivisionBody)?
      WHEN searchAllCondition procedureDivisionBody
    ;

searchWhen
    : (IS? EQUAL TO? | IS?)?
      procedureDivisionBody
    ;

searchCondition
    : condition
    | (identifier | literal) (IS? EQUAL TO? | IS?)? (identifier | literal) (AND conditionName)*
    ;

searchAllCondition
    : condition
    ;

sendStatement
    : SEND communicationDescription
      (FROM identifier)?
      (WITH identifier)?
      (REPLACING LINE)?
      (WITH EGI | EMI | ESI)?
      onExceptionClause?
      notOnExceptionClause?
    ;

setStatement
    : SET (setToStatement | setUpDownByStatement | setToTrueStatement)
    ;

setToStatement
    : identifier (identifier)* (TO | EQUAL) (identifier | literal | arithmeticExpression)
    ;

setUpDownByStatement
    : identifier (identifier)* (UP BY | DOWN BY) (identifier | literal)
    ;

setToTrueStatement
    : identifier (identifier)* TO TRUE
    ;

sortStatement
    : SORT fileName sortOnKeyClause (sortOnKeyClause)*
      (WITH? DUPLICATES? IN? ORDER?)?
      (COLLATING? SEQUENCE IS? alphabetName)?
      (sortInputProcedurePhrase | sortUsing)
      (sortOutputProcedurePhrase | sortGiving)?
    ;

sortOnKeyClause
    : ON? (ASCENDING | DESCENDING) KEY? identifier (identifier)*
    ;

sortInputProcedurePhrase
    : INPUT PROCEDURE IS? procedureName (THROUGH | THRU)? procedureName
    ;

sortUsing
    : USING fileName (fileName)*
    ;

sortOutputProcedurePhrase
    : OUTPUT PROCEDURE IS? procedureName (THROUGH | THRU)? procedureName
    ;

sortGiving
    : GIVING fileName (fileName)*
    ;

startStatement
    : START fileName
      (KEY IS? (EQUAL TO? | IS? EQUAL TO? | IS? EQUAL | GREATER THAN? | IS? GREATER THAN? | IS? GREATER |
               GREATER THAN? OR EQUAL TO? | IS? GREATER THAN? OR EQUAL TO? | IS? GREATERTHANOREQUALTO |
               NOT LESS THAN? | IS? NOT LESS THAN? | IS? NOT LESS |
               LESS THAN? | IS? LESS THAN? | IS? LESS |
               LESS THAN? OR EQUAL TO? | IS? LESS THAN? OR EQUAL TO? | IS? LESSTHANOREQUALTO |
               NOT GREATER THAN? | IS? NOT GREATER THAN? | IS? NOT GREATER)
         identifier)?
      (INVALID KEY? procedureDivisionBody)?
      (NOT? INVALID KEY? procedureDivisionBody)?
    ;

stopStatement
    : STOP (RUN | literal)
    ;

stringStatement
    : STRING stringSendingPhrase (stringSendingPhrase)*
      DELIMITED BY? (SIZE | identifier | literal)
      INTO identifier
      (WITH? POINTER identifier)?
      (onOverflowPhrase)?
      (notOnOverflowPhrase)?
    ;

stringSendingPhrase
    : identifier | literal
    ;

notOnOverflowPhrase
    : NOT? ON? OVERFLOW procedureDivisionBody
    ;

subtractStatement
    : SUBTRACT (subtractFromStatement | subtractGivingStatement | subtractCorrespondingStatement)
    ;

subtractFromStatement
    : (identifier | literal) (identifier | literal)* FROM subtractMinuend (subtractMinuend)*
      (onSizeErrorPhrase)? (notOnSizeErrorPhrase)?
    ;

subtractGivingStatement
    : (identifier | literal) (identifier | literal)* FROM (identifier | literal)
      GIVING subtractGiving (subtractGiving)*
      (onSizeErrorPhrase)? (notOnSizeErrorPhrase)?
    ;

subtractCorrespondingStatement
    : (CORRESPONDING | CORR) identifier FROM identifier (ROUNDED)?
      (onSizeErrorPhrase)? (notOnSizeErrorPhrase)?
    ;

subtractMinuend
    : identifier (ROUNDED)?
    ;

subtractGiving
    : identifier (ROUNDED)?
    ;

terminateStatement
    : TERMINATE reportName (reportName)*
    ;

unstringStatement
    : UNSTRING identifier
      DELIMITED BY? (ALL)? (identifier | literal) (OR (ALL)? (identifier | literal))*
      (INTO unstringInto (unstringInto)*)?
      (WITH? POINTER identifier)?
      (TALLYING IN? identifier)?
      (onOverflowPhrase)?
      (notOnOverflowPhrase)?
    ;

unstringInto
    : identifier (DELIMITER IN? identifier)? (COUNT IN? identifier)?
    ;

validateStatement
    : VALIDATE identifier (identifier)*
    ;

writeStatement
    : WRITE recordName (FROM identifier)?
      (BEFORE | AFTER)? ADVANCING? (identifier | literal | mnemonic) (LINE | LINES)?
      (AT? END_OF_PAGE | AT? EOP)? procedureDivisionBody
      (NOT? AT? END_OF_PAGE | NOT? AT? EOP)? procedureDivisionBody
      (INVALID KEY? procedureDivisionBody)?
      (NOT? INVALID KEY? procedureDivisionBody)?
    ;

// For WRITE ADVANCING
mnemonic
    : mnemonicName
    ;

// Expression
expression
    : arithmeticExpression
    ;

arithmeticExpression
    : multDivExpression ((PLUS | MINUS) multDivExpression)*
    ;

multDivExpression
    : powerExpression ((MULTIPLY | DIVIDE) powerExpression)*
    ;

powerExpression
    : (PLUS | MINUS)? atom (POWER atom)*
    ;

atom
    : identifier
    | literal
    | LPARENCHAR arithmeticExpression RPARENCHAR
    ;

// Object-Oriented COBOL 2002 structures
objectSection
    : OBJECT SECTION DOT
      (objectParagraph)*
      (methodDefinition)*
      END OBJECT DOT
    ;

factorySection
    : FACTORY SECTION DOT
      (factoryParagraph)*
      (methodDefinition)*
      END FACTORY DOT
    ;

objectParagraph
    : objectPropertyParagraph
    | objectMethodParagraph
    ;

factoryParagraph
    : factoryPropertyParagraph
    | factoryMethodParagraph
    ;

objectPropertyParagraph
    : dataDescription
    ;

factoryPropertyParagraph
    : dataDescription
    ;

objectMethodParagraph
    : METHOD_ID DOT methodName (OVERRIDE)? DOT
      (dataDivision)?
      (procedureDivision)?
      END METHOD methodName DOT
    ;

factoryMethodParagraph
    : METHOD_ID DOT methodName (OVERRIDE)? DOT
      (dataDivision)?
      (procedureDivision)?
      END METHOD methodName DOT
    ;

methodDefinition
    : METHOD_ID DOT methodName (OVERRIDE)? DOT
      (dataDivision)?
      (procedureDivision)?
      END METHOD methodName DOT
    ;

methodName
    : IDENTIFIER
    | ALPHANUM_LITERAL
    ;

// exhibit statement

exhibitStatement
   : EXHIBIT NAMED? CHANGED? exhibitOperand+
   ;

exhibitOperand
   : identifier | literal
   ;

// Try-catch exception handling for COBOL 2002
tryStatement
    : TRY procedureDivisionBody
      (catchStatement)*
      (finallyStatement)?
      END_TRY
    ;

catchStatement
    : CATCH exceptionName
      (AS identifier)?
      procedureDivisionBody
    ;

finallyStatement
    : FINALLY procedureDivisionBody
    ;

// Program termination
programEnd
    : END_PROGRAM programName DOT
    | END PROGRAM programName DOT
    ;

// Literals
literal
    : numericLiteral
    | stringLiteral
    | figurativeConstant
    | booleanLiteral
    | nullLiteral
    ;

numericLiteral
    : NUMBER_LITERAL
    ;

stringLiteral
    : STRING_LITERAL
    ;

booleanLiteral
    : TRUE
    | FALSE
    ;

nullLiteral
    : NULL
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

integerLiteral
    : INTEGER
    ;