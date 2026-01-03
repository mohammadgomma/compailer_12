

parser grammar HtmlParser;

options { tokenVocab=HtmlLexer; }

start: (pythonFullContent program| program|pythonFullContent) EOF;


pythonFullContent:  statement* ;

statement:
    import_stmt NL?
    | assign_stmt NL?
    | func_def NL?
    | decorator NL?
    | if_statement NL?
    | return_stmt NL?
    | expr_stmt NL?
    ;


import_stmt:
    FROM NAME IMPORT imported_names
    | IMPORT import_list
    ;

imported_names:
    imported_name (COMMA imported_name)*
    ;

imported_name:
    NAME (AS NAME)?
    ;

import_list:
    module_name (COMMA module_name)*
    ;

module_name:
    NAME (AS NAME)?
    ;

assign_stmt:
    NAME ASSIGN expression
    ;

expr_stmt:
    expression
    ;

return_stmt:
    RETURN expression?
    ;

func_def:
    decorators? DEF NAME params COLON suite
    ;

decorators:
    decorator+
    ;

decorator:
    AT decorator_name (LPAREN decorator_args? RPAREN)? NL?
    ;

decorator_name:
    NAME (DOT NAME)*
    ;

decorator_args:
    arg (COMMA arg)*
    ;

params:
    LPAREN (param (COMMA param)*)? RPAREN
    ;

param:
    NAME (ASSIGN expression)?
    ;

suite:
    simple_stmt
    | NL INDENT? statement* DEDENT?
    ;

simple_stmt:
    small_stmt
    ;

small_stmt:
    return_stmt
    | expr_stmt
    ;

if_statement:
    IF condition COLON suite (ELIF condition COLON suite)* (ELSE COLON suite)?
    ;

condition:
    expression
    ;

expression:
    logical_expr
    ;

logical_expr:
    comparison_expr ((AND | OR) comparison_expr)*
    ;

comparison_expr:
    additive_expr ((EQ | NEQ | LT | GT | LE | GE | IS NOT?) additive_expr)*
    ;

additive_expr:
    multiplicative_expr ((PLUS | MINUS) multiplicative_expr)*
    ;

multiplicative_expr:
    primary_expr ((MULT | DIV | MOD) primary_expr)*
    ;

primary_expr:
    literal
    | NAME
    | DNAME
    | list_expr
    | dict_expr
    | func_call
    | LPAREN expression RPAREN
    ;

literal:
    INTEGER
    | FLOAT
    | STRING
    | TRUE
    | FALSE
    | NONE
    ;

list_expr:
    LBRACK (expression (COMMA expression)*)? RBRACK
    ;

dict_expr:
    LBRACE (dict_item (COMMA dict_item)*)? RBRACE
    ;

dict_item:
    (STRING | NAME) COLON* expression
    ;

func_call:
    DOT* NAME LPAREN (arg (COMMA arg)*)? RPAREN
    ;

arg:
    expression
    | NAME ASSIGN expression
    ;




program: element* EOF;

element:
    htmlElement
    | jinjaExpression
    | jinjaBlock
    | pythonCode
    | styleElement
    | TEXT
    ;


htmlElement:
    (OPEN_TAG_F|OPEN_TAG_F_T) htmlParts HTML_TAG_CLOSE                    # doctypeElement
    | (OPEN_TAG|OPEN_TAG_T) htmlParts HTML_TAG_CLOSE element* closeTag  # pairedElement
    | (OPEN_TAG|OPEN_TAG_T) htmlParts (HTML_SLASH_CLOSE | HTML_TAG_CLOSE)   # selfClosingElement
    ;

htmlParts: htmlTagName htmlAttribute* ;
htmlTagName: HTML_NAME ;
htmlAttribute: HTML_NAME HTML_EQ HTML_STRING ;
htmlContent: element* ;
closeTag: (CLOSE_TAG_START|CLOSE_TAG_START_T) htmlTagName HTML_TAG_CLOSE ;


styleElement:
    (STYLE_TAG_OPEN|STYLE_TAG_OPEN_T) styleAttribute* STYLE_TAG_CLOSE cssContent CSS_END_TAG
    ;

styleAttribute: STYLE_ATTR_NAME (STYLE_EQ STYLE_ATTR_VALUE)? ;
cssContent: (CSS_CONTENT | CSS_WS | CSS_COMMENT | CSS_DOUBLE_BRACE jinjaExprContent JINJA_CLOSE)* ;

//{{
jinjaExpression:
    (DOUBLE_BRACE|DOUBLE_BRACE_T) jinjaExprContent JINJA_CLOSE
    | HTML_DOUBLE_BRACE jinjaExprContent JINJA_CLOSE
    | CSS_DOUBLE_BRACE jinjaExprContent JINJA_CLOSE;

jinjaExprContent: (JINJA_ID | JINJA_DOT | JINJA_NUMBER | JINJA_STRING | jinjaFilter |
                    JINJA_PIPE | JINJA_LT | JINJA_GT | JINJA_EQ_EQ | JINJA_LPAREN |
                    JINJA_RPAREN | JINJA_LBRACKET | JINJA_RBRACKET | JINJA_COLON |
                    JINJA_COMMA | JINJA_PLUS | JINJA_MINUS | JINJA_MUL | JINJA_DIV |
                    JINJA_MOD | JINJA_AND | JINJA_OR | JINJA_NOT | JINJA_LE | JINJA_GE |
                    JINJA_NE | JINJA_BOOL)+;

jinjaFilter: JINJA_PIPE JINja_ID (JINJA_COLON filterArg (JINJA_COMMA filterArg)*)?;
filterArg: JINJA_ID | JINJA_STRING | JINJA_NUMBER;

//{%
jinjaBlock:
    ifBlock
    | forBlock
    | setBlock
    ;

ifBlock:
   ( OPEN_BLOCK|OPEN_BLOCK_T) JINJA_BLOCK_IF jinjaBlockExpr JINJA_BLOCK_CLOSE element*
        (( OPEN_BLOCK|OPEN_BLOCK_T) JINJA_BLOCK_ELIF jinjaBlockExpr JINJA_BLOCK_CLOSE element*)*
        (( OPEN_BLOCK|OPEN_BLOCK_T) JINJA_BLOCK_ELSE JINJA_BLOCK_CLOSE element*)?
        ( OPEN_BLOCK|OPEN_BLOCK_T) JINJA_BLOCK_ENDIF JINJA_BLOCK_CLOSE
    | HTML_OPEN_BLOCK JINJA_BLOCK_IF jinjaBlockExpr JINJA_BLOCK_CLOSE element*
        (HTML_OPEN_BLOCK JINJA_BLOCK_ELIF jinjaBlockExpr JINJA_BLOCK_CLOSE element*)*
        (HTML_OPEN_BLOCK JINJA_BLOCK_ELSE JINJA_BLOCK_CLOSE element*)?
        HTML_OPEN_BLOCK JINJA_BLOCK_ENDIF JINJA_BLOCK_CLOSE
    ;

forBlock:
    (OPEN_BLOCK|OPEN_BLOCK_T) JINJA_BLOCK_FOR JINJA_BLOCK_ID JINJA_BLOCK_IN jinjaBlockExpr
        JINJA_BLOCK_CLOSE element* (OPEN_BLOCK|OPEN_BLOCK_T) JINJA_BLOCK_ENDFOR JINJA_BLOCK_CLOSE
    | HTML_OPEN_BLOCK JINJA_BLOCK_FOR JINJA_BLOCK_ID JINJA_BLOCK_IN jinjaBlockExpr
        JINJA_BLOCK_CLOSE element* HTML_OPEN_BLOCK JINJA_BLOCK_ENDFOR JINJA_BLOCK_CLOSE
    ;

setBlock:
    (OPEN_BLOCK|OPEN_BLOCK_T) JINJA_BLOCK_SET JINJA_BLOCK_ID JINJA_BLOCK_EQ jinjaBlockExpr
        JINJA_BLOCK_CLOSE
    | HTML_OPEN_BLOCK JINJA_BLOCK_SET JINJA_BLOCK_ID JINJA_BLOCK_EQ jinjaBlockExpr
        JINJA_BLOCK_CLOSE
    ;

jinjaBlockExpr: (JINJA_BLOCK_ID | JINJA_BLOCK_DOT | JINJA_BLOCK_NUMBER | JINJA_BLOCK_STRING |
                 JINJA_BLOCK_PIPE | JINJA_BLOCK_LT | JINJA_BLOCK_GT | JINJA_BLOCK_EQ_EQ |
                 JINJA_BLOCK_LPAREN | JINJA_BLOCK_RPAREN | JINJA_BLOCK_LBRACKET | JINJA_BLOCK_RBRACKET |
                 JINJA_BLOCK_COLON | JINJA_BLOCK_COMMA | JINJA_BLOCK_SET)+;

// <% %>
pythonCode: (PYTHON_START|PYTHON_START_T) pythonStatement* PYTHON_CLOSE;

pythonStatement:
    PYTHON_DEF PYTHON_ID PYTHON_LPAREN pythonParams? PYTHON_RPAREN PYTHON_COLON
    | PYTHON_IF pythonExpr PYTHON_COLON
    | PYTHON_FOR PYTHON_ID PYTHON_IN pythonExpr PYTHON_COLON
    | PYTHON_WHILE pythonExpr PYTHON_COLON
    | PYTHON_ID PYTHON_EQ pythonExpr (PYTHON_SEMI)?
    | PYTHON_RETURN pythonExpr (PYTHON_SEMI)?
    | pythonExpr (PYTHON_SEMI)?
    ;

pythonParams: PYTHON_ID (PYTHON_COMMA PYTHON_ID)*;

pythonExpr:
    pythonAtom                                                  # atomExpr
    | pythonExpr PYTHON_LBRACKET pythonExpr PYTHON_RBRACKET    # indexExpr
    | pythonExpr PYTHON_DOT PYTHON_ID                          # attributeExpr
    | pythonExpr PYTHON_LPAREN pythonArgs? PYTHON_RPAREN       # callExpr
    | pythonUnaryOp pythonExpr                                 # unaryExpr
    | pythonExpr pythonMulDivModOp pythonExpr                  # mulDivModExpr
    | pythonExpr pythonAddSubOp pythonExpr                     # addSubExpr
    | pythonExpr pythonCompareOp pythonExpr                    # compareExpr
    | pythonExpr PYTHON_AND pythonExpr                         # andExpr
    | pythonExpr PYTHON_OR pythonExpr                          # orExpr
    | pythonExpr PYTHON_EQ pythonExpr                          # assignExpr
    ;

pythonAtom:
    PYTHON_ID                                  # idAtom
    | PYTHON_NUMBER                            # numberAtom
    | PYTHON_STRING                            # stringAtom
    | PYTHON_TRUE                              # trueAtom
    | PYTHON_FALSE                             # falseAtom
    | PYTHON_NONE                              # noneAtom
    | pythonList                               # listAtom
    | pythonDict                               # dictAtom
    | PYTHON_LPAREN pythonExpr PYTHON_RPAREN   # parenExpr
    ;

pythonList: PYTHON_LBRACKET (pythonExpr (PYTHON_COMMA pythonExpr)*)? PYTHON_RBRACKET;
pythonDict: PYTHON_LBRACE (pythonDictItem (PYTHON_COMMA pythonDictItem)*)? PYTHON_RBRACE;
pythonDictItem: pythonExpr PYTHON_COLON pythonExpr;

pythonUnaryOp: PYTHON_MINUS | PYTHON_NOT;
pythonMulDivModOp: PYTHON_MUL | PYTHON_DIV | PYTHON_MOD;
pythonAddSubOp: PYTHON_PLUS | PYTHON_MINUS;

pythonCompareOp:
    PYTHON_LT
    | PYTHON_GT
    | PYTHON_LE
    | PYTHON_GE
    | PYTHON_EQ_EQ
    | PYTHON_NE
    ;

pythonArgs: pythonExpr (PYTHON_COMMA pythonExpr)*;

//  Flask
flask_app_decl:
    NAME_F ASSIGN_F FLASK_F LPAREN_F DNAME_F RPAREN_F
    ;

flask_route:
    AT_F NAME_F DOT_F ROUTE_F LPAREN_F STRING_F RPAREN_F
    ;
