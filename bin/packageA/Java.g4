grammar Java;

code
	: baseDeclaration* ;
	
// starting point for parsing a java file
/*
compilationUnit
    :   packageDeclaration? importDeclaration* typeDeclaration* EOF
    ;


packageDeclaration
    :   annotation* 'package' qualifiedName ';'
    ;
    * 
    */

/*
importDeclaration
    :   'import' 'static'? qualifiedName ('.' '*')? ';'
    ;
    * 
    */

typeDeclaration
    :   classDeclaration
//       classModifier* classDeclaration
//    |   classModifier* enumDeclaration
//    |   classOrInterfaceModifier* interfaceDeclaration
//    |   classModifier* annotationTypeDeclaration
    |   ';'
    ;

/*
modifier
    :   classModifier
    |   (   'native'
        |   'synchronized'
        |   'transient'
        |   'volatile'
        )
    ;
    * 
    */

/*
classModifier
    :   //annotation       // class or interface
    	(   'public'     // class or interface
        |   'protected'  // class or interface
        |   'private'    // class or interface
        |   'static'     // class or interface
        |   'abstract'   // class or interface
        |   'final'      // class only -- does not apply to interfaces
//        |   'strictfp'   // class or interface
        )
    ;
    */

constantModifier
    :   'CONST'
//    |   annotation
    ;

classDeclaration
    :   'class' Identifier typeParameters?
//        ('extends' typeType)?
//        ('implements' typeList)?
        classBody
    ;

typeParameters
    :   '<' typeParameter (',' typeParameter)* '>'
    ;

typeParameter
    :   Identifier ('extends' typeBound)?
    ;

typeBound
    :   typeType ('&' typeType)*
    ;

/*
enumDeclaration
    :   ENUM Identifier ('implements' typeList)?
        '{' enumConstants? ','? enumBodyDeclarations? '}'
    ;

enumConstants
    :   enumConstant (',' enumConstant)*
    ;

enumConstant
    :   annotation* Identifier arguments? classBody?
    ;

enumBodyDeclarations
    :   ';' classBodyDeclaration*
    ;

/*
interfaceDeclaration
    :   'interface' Identifier typeParameters? ('extends' typeList)? interfaceBody
    ;
    * 
    */

typeList
    :   typeType (',' typeType)*
    ;

classBody
    :   '{' classBodyDeclaration* '}'
    ;

/*
interfaceBody
    :   '{' interfaceBodyDeclaration* '}'
    ;
    * 
    */

classBodyDeclaration
    :   ';'
    |   'static'? block
    //|   classModifier*
    | baseDeclaration
    ;

baseDeclaration
    :   methodDeclaration /*
    |   genericMethodDeclaration
    |   fieldDeclaration
    |   constructorDeclaration
    |   genericConstructorDeclaration
//    |   interfaceDeclaration
//    |   annotationTypeDeclaration
    |   classDeclaration */
//    |   enumDeclaration
    ;

/* We use rule this even for void methods which cannot have [] after parameters.
   This simplifies grammar and we can consider void to be a type, which
   renders the [] matching as a context-sensitive issue or a semantic check
   for invalid return type after parsing.
 */
methodDeclaration
    :   'function' (typeType|'void') Identifier formalParameters ('[' ']')*
        ('throws' qualifiedNameList)?
        (   methodBody
        |   ';'
        )
    ;

genericMethodDeclaration
    :   typeParameters methodDeclaration
    ;

constructorDeclaration
    :   Identifier formalParameters ('throws' qualifiedNameList)?
        constructorBody
    ;

genericConstructorDeclaration
    :   typeParameters constructorDeclaration
    ;

fieldDeclaration
    :   typeType pointerModifier? variableDeclarators ';'
    ;

/*
interfaceBodyDeclaration
    :   modifier* interfaceMemberDeclaration
    |   ';'
    ;
    * 
    */

/*
interfaceMemberDeclaration
    :   constDeclaration
    |   interfaceMethodDeclaration
    |   genericInterfaceMethodDeclaration
//    |   interfaceDeclaration
    |   annotationTypeDeclaration
    |   classDeclaration
    |   enumDeclaration
    ;
    * 
    */

constDeclaration
    :   constantModifier* typeType pointerModifier? constantDeclarator (',' constantDeclarator)* ';'
    ;
    
pointerModifier
	:	'*';

constantDeclarator
    :   Identifier ('[' ']')* '=' variableInitializer
    ;

// see matching of [] comment in methodDeclaratorRest
/*
interfaceMethodDeclaration
    :   (typeType|'void') Identifier formalParameters ('[' ']')*
        ('throws' qualifiedNameList)?
        ';'
    ;

genericInterfaceMethodDeclaration
    :   typeParameters interfaceMethodDeclaration
    ;
    */

variableDeclarators
    :   variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
    :   variableDeclaratorId ('=' variableInitializer)?
    ;

variableDeclaratorId
    :   Identifier ('[' ']')*
    ;

variableInitializer
    :   arrayInitializer
    |   expression
    ;

arrayInitializer
    :   '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
    ;

enumConstantName
    :   Identifier
    ;

typeType
    :   classType ('[' ']')*
    |   dataType ('[' ']')*
    ;

classType
    :   Identifier typeArguments? ('.' Identifier typeArguments? )*
    ;

dataType
    :   'boolean'
    |   'char'
    |   'int'
    |   'float'
    ;

typeArguments
    :   '<' typeArgument (',' typeArgument)* '>'
    ;

typeArgument
    :   typeType
    |   '?' (('extends' | 'super') typeType)?
    ;

qualifiedNameList
    :   qualifiedName (',' qualifiedName)*
    ;

formalParameters
    :   '(' formalParameterList? ')'
    ;

formalParameterList
    :   formalParameter (',' formalParameter)* (',' lastFormalParameter)?
    |   lastFormalParameter
    ;

formalParameter
    :   typeType variableDeclaratorId
    ;

lastFormalParameter
    :   typeType '...' variableDeclaratorId
    ;

methodBody
    :   block
    ;

constructorBody
    :   block
    ;

qualifiedName
    :   Identifier ('.' Identifier)*
    ;

literal
    :   IntegerLiteral
    |   FloatingPointLiteral
    |   CharacterLiteral
    |   StringLiteral
    |   BooleanLiteral
    |   'null'
    ;

// ANNOTATIONS
/*
annotation
    :   '@' annotationName ( '(' ( elementValuePairs | elementValue )? ')' )?
    ;

annotationName : qualifiedName ;
* */

elementValuePairs
    :   elementValuePair (',' elementValuePair)*
    ;

elementValuePair
    :   Identifier '=' elementValue
    ;

elementValue
    :   expression
//    |   annotation
    |   elementValueArrayInitializer
    ;

elementValueArrayInitializer
    :   '{' (elementValue (',' elementValue)*)? (',')? '}'
    ;

/*
annotationTypeDeclaration
    :   '@' 'interface' Identifier annotationTypeBody
    ;

annotationTypeBody
    :   '{' (annotationTypeElementDeclaration)* '}'
    ;

annotationTypeElementDeclaration
    :   modifier* annotationTypeElementRest
    |   ';' // this is not allowed by the grammar, but apparently allowed by the actual compiler
    ;

annotationTypeElementRest
    :   typeType annotationMethodOrConstantRest ';'
    |   classDeclaration ';'?
//    |   interfaceDeclaration ';'?
//    |   enumDeclaration ';'?
    |   annotationTypeDeclaration ';'?
    ;

annotationMethodOrConstantRest
    :   annotationMethodRest
    |   annotationConstantRest
    ;

annotationMethodRest
    :   Identifier '(' ')' defaultValue?
    ;

annotationConstantRest
    :   variableDeclarators
    ;
    * 
    */

defaultValue
    :   'default' elementValue
    ;

// STATEMENTS / BLOCKS

block
    :   '{' blockStatement* '}'
    ;

blockStatement
    :   localVariableDeclarationStatement
    |   statement
    |   typeDeclaration
    ;

localVariableDeclarationStatement
    :    localVariableDeclaration ';'
    ;

localVariableDeclaration
    :   constantModifier? typeType variableDeclarators
    ;

statement
    :   block
//    |   ASSERT expression (':' expression)? ';'
    |   'if' parExpression statement ('else' statement)?
    |   'for' '(' forControl ')' statement
    |   'while' parExpression statement
    |   'dowhile' parExpression statement
//    |   'try' block (catchClause+ finallyBlock? | finallyBlock)
//    |   'try' resourceSpecification block catchClause* finallyBlock?
    |   'switch' parExpression '{' switchBlockStatementGroup* switchLabel* '}'
//    |   'synchronized' parExpression block
    |   'return' expression? ';'
    |   'throw' expression ';'
    |   'break' Identifier? ';'
//    |   'continue' Identifier? ';'
    |   ';'
    |   statementExpression ';'
    |   Identifier ':' statement
    | constDeclaration
    | 'output' parExpression ';'
    | 'input();'
    | methodDeclaration
    ;

catchClause
    :   'catch' '(' catchType Identifier ')' block
    ;

catchType
    :   qualifiedName ('|' qualifiedName)*
    ;

finallyBlock
    :   'finally' block
    ;

resourceSpecification
    :   '(' resources ';'? ')'
    ;

resources
    :   resource (';' resource)*
    ;

resource
    :   constantModifier* classType variableDeclaratorId '=' expression
    ;

/** Matches cases then statements, both of which are mandatory.
 *  To handle empty cases at the end, we add switchLabel* to statement.
 */
switchBlockStatementGroup
    :   switchLabel+ blockStatement+
    ;

switchLabel
    :   'case' constantExpression ':'
    |   'case' enumConstantName ':'
    |   'default' ':'
    ;

forControl
    :   enhancedForControl
    |   forInit? ';' expression? ';' forUpdate?
    ;

forInit
    :   localVariableDeclaration
    |   expressionList
    ;

enhancedForControl
    :   constantModifier* typeType variableDeclaratorId ':' expression
    ;

forUpdate
    :   expressionList
    ;

// EXPRESSIONS

parExpression
    :   '(' expression ')'
    ;

expressionList
    :   expression (',' expression)*
    ;

statementExpression
    :   expression
    ;

constantExpression
    :   expression
    ;


expression
    :   primary
    |   expression '.' Identifier
    |   expression '.' 'this'
//    |   expression '.' 'new' nonWildcardTypeArguments? innerCreator
//    |   expression '.' 'super' superSuffix
    |   expression '.' explicitGenericInvocation
    |   expression '[' expression ']'
    |   expression '(' expressionList? ')' 
    |   'new' creator
//    |   '(' typeType ')' expression
    |   expression ('++' | '--')
//    |   ('+'|'-'|'++'|'--'|'!') expression
    |   ('+'|'-'|'!') expression
    |   expression ('*'|'/'|'%') expression
    |   expression ('+'|'-') expression
    |   expression ('<=' | '>=' | '>' | '<') expression
    |   expression 'instanceof' typeType
    |   expression ('==' | '!=') expression
    |   expression '^' expression
    |   expression '&&' expression
    |   expression '||' expression
    |   expression '?' expression ':' expression
    |   <assoc=right> expression
        (   '='
        |   '+='
        |   '-='
        |   '*='
        |   '/='
        )
        expression
    ;


primary
    :   '(' expression ')'
//    |   'this'
//    |   'super'
    |   literal
    |   Identifier
//    |   typeType '.' 'class'
//    |   'void' '.' 'class'
    |   nonWildcardTypeArguments (explicitGenericInvocationSuffix | 'this' arguments)
    ;

creator
    :   nonWildcardTypeArguments createdName classCreatorRest
    |   createdName (arrayCreatorRest | classCreatorRest)
    ;

createdName
    :   Identifier typeArgumentsOrDiamond? ('.' Identifier typeArgumentsOrDiamond?)*
    |   dataType
    ;

innerCreator
    :   Identifier nonWildcardTypeArgumentsOrDiamond? classCreatorRest
    ;

arrayCreatorRest
    :   '['
        (   ']' ('[' ']')* arrayInitializer
        |   expression ']' ('[' expression ']')* ('[' ']')*
        )
    ;

classCreatorRest
    :   arguments classBody?
    ;

explicitGenericInvocation
    :   nonWildcardTypeArguments explicitGenericInvocationSuffix
    ;

nonWildcardTypeArguments
    :   '<' typeList '>'
    ;

typeArgumentsOrDiamond
    :   '<' '>'
    |   typeArguments
    ;

nonWildcardTypeArgumentsOrDiamond
    :   '<' '>'
    |   nonWildcardTypeArguments
    ;

superSuffix
    :   arguments
    |   '.' Identifier arguments?
    ;

explicitGenericInvocationSuffix
    :   'super' superSuffix
    |   Identifier arguments
    ;

arguments
    :   '(' expressionList? ')'
    ;

// LEXER

// �3.10.1 Integer Literals

IntegerLiteral
    :   DecimalIntegerLiteral
//    |   HexIntegerLiteral
//    |   OctalIntegerLiteral
//    |   BinaryIntegerLiteral
    ;

fragment
DecimalIntegerLiteral
    :   DecimalNumeral IntegerTypeSuffix?
    ;

/*
fragment
HexIntegerLiteral
    :   HexNumeral IntegerTypeSuffix?
    ;

fragment
OctalIntegerLiteral
    :   OctalNumeral IntegerTypeSuffix?
    ;

fragment
BinaryIntegerLiteral
    :   BinaryNumeral IntegerTypeSuffix?
    ;
    * 
    */

fragment
IntegerTypeSuffix
    :   [lL]
    ;

fragment
DecimalNumeral
    :   '0'
    |   NonZeroDigit (Digits? | Underscores Digits)
    ;

fragment
Digits
    :   Digit (DigitOrUnderscore* Digit)?
    ;

fragment
Digit
    :   '0'
    |   NonZeroDigit
    ;

fragment
NonZeroDigit
    :   [1-9]
    ;

fragment
DigitOrUnderscore
    :   Digit
    |   '_'
    ;

fragment
Underscores
    :   '_'+
    ;

/*
fragment
HexNumeral
    :   '0' [xX] HexDigits
    ;
    * 
    */

fragment
HexDigits
    :   HexDigit (HexDigitOrUnderscore* HexDigit)?
    ;

fragment
HexDigit
    :   [0-9a-fA-F]
    ;

fragment
HexDigitOrUnderscore
    :   HexDigit
    |   '_'
    ;

/*
fragment
OctalNumeral
    :   '0' Underscores? OctalDigits
    ;
    * 
    */

fragment
OctalDigits
    :   OctalDigit (OctalDigit* OctalDigit)?
    ;

fragment
OctalDigit
    :   [0-7]
    ;

/*
fragment
OctalDigitOrUnderscore
    :   OctalDigit
    |   '_'
    ;
    * 
    */

/*
fragment
BinaryNumeral
    :   '0' [bB] BinaryDigits
    ;

fragment
BinaryDigits
    :   BinaryDigit (BinaryDigitOrUnderscore* BinaryDigit)?
    ;

fragment
BinaryDigit
    :   [01]
    ;

fragment
BinaryDigitOrUnderscore
    :   BinaryDigit
    |   '_'
    ;
    * 
    */

// �3.10.2 Floating-Point Literals

FloatingPointLiteral
    :   DecimalFloatingPointLiteral
//    |   HexadecimalFloatingPointLiteral
    ;

fragment
DecimalFloatingPointLiteral
    :   Digits '.' Digits? ExponentPart? FloatTypeSuffix?
    |   '.' Digits ExponentPart? FloatTypeSuffix?
    |   Digits ExponentPart FloatTypeSuffix?
    |   Digits FloatTypeSuffix
    ;

fragment
ExponentPart
    :   ExponentIndicator SignedInteger
    ;

fragment
ExponentIndicator
    :   [eE]
    ;

fragment
SignedInteger
    :   Sign? Digits
    ;

fragment
Sign
    :   [+-]
    ;

fragment
FloatTypeSuffix
    :   [fFdD]
    ;

/*
fragment
HexadecimalFloatingPointLiteral
    :   HexSignificand BinaryExponent FloatTypeSuffix?
    ;

fragment
HexSignificand
    :   HexNumeral '.'?
    |   '0' [xX] HexDigits? '.' HexDigits
    ;

fragment
BinaryExponent
    :   BinaryExponentIndicator SignedInteger
    ;

fragment
BinaryExponentIndicator
    :   [pP]
    ;
    * 
    */

// �3.10.3 Boolean Literals

BooleanLiteral
    :   'true'
    |   'false'
    ;

// �3.10.4 Character Literals

CharacterLiteral
    :   '\'' SingleCharacter '\''
    |   '\'' EscapeSequence '\''
    ;

fragment
SingleCharacter
    :   ~['\\\r\n]
    ;
// �3.10.5 String Literals
StringLiteral
    :   '"' StringCharacters? '"'
    ;
fragment
StringCharacters
    :   StringCharacter+
    ;
fragment
StringCharacter
    :   ~["\\]
    |   EscapeSequence
    ;
// �3.10.6 Escape Sequences for Character and String Literals
fragment
EscapeSequence
    :   '\\' [btnfr"'\\]
    |   OctalEscape
    |   UnicodeEscape
    ;

fragment
OctalEscape
    :   '\\' OctalDigit
    |   '\\' OctalDigit OctalDigit
    |   '\\' ZeroToThree OctalDigit OctalDigit
    ;

fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

fragment
ZeroToThree
    :   [0-3]
    ;

// �3.10.7 The Null Literal

NullLiteral
    :   'null'
    ;

// �3.11 Separators

LEFTPARENTH     : '(';
RIGHTPARENTH    : ')';
LEFTBRACE       : '{';
RIGHTBRACE      : '}';
LEFTBRACKET     : '[';
RIGHTBRACKET    : ']';
SEMICOLON       : ';';
COMMA           : ',';
DOT             : '.';

// �3.12 Operators

ASSIGNMENT      : '=';
GREATER         : '>';
LESS            : '<';
// BANG            : '!';
// TILDE           : '~';
// QUESTION        : '?';
// COLON           : ':';
EQUAL           : '==';
LESSEQUAL       : '<=';
GREATEREQUAL    : '>=';
NOTEQUAL        : '!=';
AND             : '&&';
OR              : '||';
INCREMENT       : '++';
DECREMENT       : '--';
ADDITION        : '+';
SUBTRACT        : '-';
MULTIPLY        : '*';
DIVISION        : '/';
// BITAND          : '&';
// BITOR           : '|';
EXPONENT        : '^';
MODULO          : '%';

ADD_ASSIGN      : '+=';
SUB_ASSIGN      : '-=';
MUL_ASSIGN      : '*=';
DIV_ASSIGN      : '/=';
// AND_ASSIGN      : '&=';
// OR_ASSIGN       : '|=';
// XOR_ASSIGN      : '^=';
// MOD_ASSIGN      : '%=';
// LSHIFT_ASSIGN   : '<<=';
// RSHIFT_ASSIGN   : '>>=';
// URSHIFT_ASSIGN  : '>>>=';

// �3.9 Keywords

BOOLEAN       : 'boolean';
BREAK         : 'break';
CASE          : 'case';
CHAR          : 'char';
CLASS         : 'class';
CONST         : 'CONST';
DEFAULT       : 'default';
DOWHILE       : 'dowhile';
ELSE          : 'else';
FLOAT         : 'float';
FOR           : 'for';
IF            : 'if';
INSTANCEOF    : 'instanceof';
INT           : 'int';
LONG          : 'long';
NEW           : 'new';
RETURN        : 'return';
SWITCH        : 'switch';
THIS          : 'this';
VOID          : 'void';
WHILE         : 'while';

// �3.8 Identifiers (must appear after all keywords in the grammar)

Identifier
    :   Character (Character|Digit)*
    ;

fragment
Character
    :   [a-zA-Z$_] // these are the "java letters" below 0x7F
    |   // covers all characters above 0x7F which are not a surrogate
        ~[\u0000-\u007F\uD800-\uDBFF]
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
    ;
//
// Additional symbols not defined in the lexical specification
//

//AT : '@';
//ELLIPSIS : '...';

//
// Whitespace and comments
//

WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> channel(HIDDEN)
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> channel(HIDDEN)
    ;
