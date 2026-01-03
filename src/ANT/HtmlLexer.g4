
lexer grammar HtmlLexer;



OPEN_TAG_F : '<!DOCTYPE' -> pushMode(HTML_MODE);
STYLE_TAG_OPEN: '<style' -> pushMode(STYLE_TAG_MODE);
OPEN_TAG : '<' -> pushMode(HTML_MODE);
CLOSE_TAG_START : '</' -> pushMode(HTML_MODE);
DOUBLE_BRACE : '{{' -> pushMode(JINJA_EXPR_MODE);
OPEN_BLOCK : '{%' -> pushMode(JINJA_BLOCK_MODE);
PYTHON_START : '<%' -> pushMode(PYTHON_INLINE_MODE);


DOT: '.';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';
ASSIGN: '=';
EQ: '==';
NEQ: '!=';
LT: '<';
GT: '>';
LE: '<=';
GE: '>=';
PLUS_ASSIGN: '+=';
MINUS_ASSIGN: '-=';


LPAREN: '(';
RPAREN: ')';
LBRACK: '[';
RBRACK: ']';
LBRACE: '{';
RBRACE: '}';
COMMA: ',';
COLON: ':';
AT: '@';

FLASK: 'Flask ';
ROUTE: 'route ';


DEF: 'def';
RETURN: 'return';
IF: 'if';
ELIF: 'elif';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
IMPORT: 'import';
FROM: 'from';
IN: 'in';
IS: 'is';
NOT: 'not';
AND: 'and';
OR: 'or';
NONE: 'None';
TRUE: 'True';
FALSE: 'False';
AS: 'as';


INTEGER: [0-9]+;
FLOAT: [0-9]+ '.' [0-9]* | '.' [0-9]+;
STRING: '"' (~["\r\n] | '\\' .)* '"'
      | '\'' (~['\r\n] | '\\' .)* '\'';


NAME: [a-zA-Z_][a-zA-Z0-9_]*;
DNAME: '__name__' | '__main__';


COMMENT: '#' ~[\r\n]* -> skip;
WS: [ \t]+ -> skip;
NL: '\r'? '\n' -> skip;

////////////////////////////////////////////////////////
////<
mode HTML_MODE;

HTML_TAG_CLOSE : '>' -> popMode, pushMode(TEXT_MODE);
HTML_SLASH_CLOSE : '/>' -> popMode , pushMode(TEXT_MODE);

HTML_DOUBLE_BRACE : '{{'  -> popMode ,pushMode(JINJA_EXPR_MODE) ;
HTML_OPEN_BLOCK : '{%' -> popMode , pushMode(JINJA_BLOCK_MODE) ;



HTML_NAME : [a-zA-Z_][a-zA-Z0-9_-]* ;
HTML_EQ : '=' ;
HTML_STRING : '"' (~["\r\n] | '\\"')* '"'
            | '\'' (~['\r\n] | '\\\'')* '\'' ;

HTML_COMMENT : '<!--' .*? '-->' -> skip ;
HTML_WS : [ \t\r\n]+ -> skip ;

////////////////////////////////////////////
//<style>
mode STYLE_TAG_MODE;

STYLE_TAG_CLOSE: '>' -> popMode, pushMode(CSS_CONTENT_MODE);
STYLE_ATTR_NAME: [a-zA-Z_][a-zA-Z0-9_-]* ;
STYLE_EQ: '=' ;
STYLE_ATTR_VALUE: '"' (~["\r\n] | '\\"')* '"'
                 | '\'' (~['\r\n] | '\\\'')* '\'' ;
STYLE_WS: [ \t\r\n]+ -> skip ;

//////////////////////////////////////
//
mode CSS_CONTENT_MODE;

CSS_END_TAG: '</style>' -> popMode, pushMode(TEXT_MODE);
CSS_DOUBLE_BRACE: '{{' -> pushMode(JINJA_EXPR_MODE);
CSS_OPEN_BLOCK: '{%' -> pushMode(JINJA_BLOCK_MODE);
CSS_COMMENT: '/*' .*? '*/' -> skip ;
CSS_WS: [ \t\r\n]+ -> skip ;
CSS_CONTENT: ~[<{/]+ | '/' ~[>] | [<{] ~[<{] ;

//////////////////////////////////////////////////////////////////
//{{
mode JINJA_EXPR_MODE;

JINJA_CLOSE : '}}' -> popMode , pushMode(TEXT_MODE);

JINJA_IF : 'if' ;
JINJA_ELSE : 'else' ;
JINJA_ELIF : 'elif' ;
JINJA_FOR : 'for' ;
JINJA_IN : 'in' ;
JINJA_ENDIF : 'endif' ;
JINJA_ENDFOR : 'endfor' ;
JINJA_SET : 'set' ;

JINJA_ID : [a-zA-Z_][a-zA-Z0-9_]* ;
JINJA_NUMBER : [0-9]+ ('.' [0-9]+)? ;


JINJA_STRING : '"' (~["] | '\\"')* '"'
             | '\'' (~['] | '\\\'')* '\'' ;

JINJA_BOOL : 'true' | 'false' | 'True' | 'False' ;

JINJA_DOT : '.' ;
JINJA_PIPE : '|' ;
JINJA_COLON : ':' ;
JINJA_COMMA : ',' ;
JINJA_EQ : '=' ;
JINJA_PLUS : '+' ;
JINJA_MINUS : '-' ;
JINJA_MUL : '*' ;
JINJA_DIV : '/' ;
JINJA_MOD : '%' ;
JINJA_NOT : '!' | 'not' ;
JINJA_AND : '&&' | 'and' ;
JINJA_OR : '||' | 'or' ;
JINJA_LT : '<' ;
JINJA_GT : '>' ;
JINJA_LE : '<=' ;
JINJA_GE : '>=' ;
JINJA_EQ_EQ : '==' ;
JINJA_NE : '!=' ;
JINJA_LBRACKET : '[' ;
JINJA_RBRACKET : ']' ;
JINJA_LPAREN : '(' ;
JINJA_RPAREN : ')' ;
JINJA_LBRACE : '{' ;
JINJA_RBRACE : '}' ;

JINJA_WS : [ \t\r\n]+ -> skip ;

///////////////////////////////////////////////////////////////////////////////
//{%
mode JINJA_BLOCK_MODE;

JINJA_BLOCK_CLOSE : '%}' -> popMode , pushMode(TEXT_MODE);


JINJA_BLOCK_IF : 'if' ;
JINJA_BLOCK_ELSE : 'else' ;
JINJA_BLOCK_ELIF : 'elif' ;
JINJA_BLOCK_FOR : 'for' ;
JINJA_BLOCK_IN : 'in' ;
JINJA_BLOCK_ENDFOR : 'endfor' ;
JINJA_BLOCK_ENDIF : 'endif' ;
JINJA_BLOCK_SET : 'set' ;

JINJA_BLOCK_ID : [a-zA-Z_][a-zA-Z0-9_]* ;
JINJA_BLOCK_NUMBER : [0-9]+ ('.' [0-9]+)? ;
JINJA_BLOCK_STRING : '"' (~["] | '\\"')* '"'
                    | '\'' (~['] | '\\\'')* '\'' ;

JINJA_BLOCK_EQ : '=' ;
JINJA_BLOCK_PIPE : '|' ;
JINJA_BLOCK_COLON : ':' ;
JINJA_BLOCK_COMMA : ',' ;
JINJA_BLOCK_DOT : '.' ;
JINJA_BLOCK_LT : '<' ;
JINJA_BLOCK_GT : '>' ;
JINJA_BLOCK_LE : '<=' ;
JINJA_BLOCK_GE : '>=' ;
JINJA_BLOCK_EQ_EQ : '==' ;
JINJA_BLOCK_NE : '!=' ;
JINJA_BLOCK_LBRACKET : '[' ;
JINJA_BLOCK_RBRACKET : ']' ;
JINJA_BLOCK_LPAREN : '(' ;
JINJA_BLOCK_RPAREN : ')' ;

JINJA_BLOCK_WS : [ \t\r\n]+ -> skip ;

////////////////////////////////////////////////////////////////////////////
//<%  %>//
mode PYTHON_INLINE_MODE;

PYTHON_CLOSE : '%>' -> popMode , pushMode(TEXT_MODE);
PYTHON_ID : [a-zA-Z_][a-zA-Z0-9_]* ;
PYTHON_NUMBER : [0-9]+ ('.' [0-9]+)? ;
PYTHON_STRING : '"' (~["] | '\\"')* '"' | '\'' (~['] | '\\\'')* '\'' ;
PYTHON_DEF : 'def' ;
PYTHON_IF : 'if' ;
PYTHON_ELSE : 'else' ;
PYTHON_ELIF : 'elif' ;
PYTHON_FOR : 'for' ;
PYTHON_IN : 'in' ;
PYTHON_WHILE : 'while' ;
PYTHON_RETURN : 'return' ;
PYTHON_EQ : '=' ;
PYTHON_PLUS : '+' ;
PYTHON_MINUS : '-' ;
PYTHON_MUL : '*' ;
PYTHON_DIV : '/' ;
PYTHON_MOD : '%' ;
PYTHON_COMMA : ',' ;
PYTHON_COLON : ':' ;
PYTHON_SEMI : ';' ;
PYTHON_DOT : '.' ;
PYTHON_LPAREN : '(' ;
PYTHON_RPAREN : ')' ;
PYTHON_LBRACKET : '[' ;
PYTHON_RBRACKET : ']' ;
PYTHON_LBRACE : '{' ;
PYTHON_RBRACE : '}' ;
PYTHON_LT : '<' ;
PYTHON_GT : '>' ;
PYTHON_LE : '<=' ;
PYTHON_GE : '>=' ;
PYTHON_EQ_EQ : '==' ;
PYTHON_NE : '!=' ;
PYTHON_AND : 'and' ;
PYTHON_OR : 'or' ;
PYTHON_NOT : 'not' ;
PYTHON_NONE : 'None' ;
PYTHON_TRUE : 'True' ;
PYTHON_FALSE : 'False' ;
PYTHON_COMMENT : '#' ~[\r\n]* -> skip ;
PYTHON_WS : [ \t\r\n]+ -> skip ;

///////////////////////////////////////////////////////////////

mode TEXT_MODE;

OPEN_TAG_F_T : '<!DOCTYPE' ->popMode, pushMode(HTML_MODE);
STYLE_TAG_OPEN_T: '<style' ->popMode, pushMode(STYLE_TAG_MODE);
OPEN_TAG_T : '<' ->popMode, pushMode(HTML_MODE);
CLOSE_TAG_START_T : '</' ->popMode, pushMode(HTML_MODE);
DOUBLE_BRACE_T : '{{' ->popMode, pushMode(JINJA_EXPR_MODE);
OPEN_BLOCK_T : '{%' ->popMode, pushMode(JINJA_BLOCK_MODE);
PYTHON_START_T : '<%' ->popMode, pushMode(PYTHON_INLINE_MODE);

TEXT : ~[<{>]+ ;


