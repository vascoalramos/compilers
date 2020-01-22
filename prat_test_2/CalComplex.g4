grammar CalComplex;

main: (stat ';')* EOF;

stat: print
    | assignment;

print: 'output' expr;

assignment: expr '=>' ID;

expr: e1=expr op=(':'|'*') e2=expr
    | e1=expr op=('+'|'-') e2=expr
    | ID
    | complex
    ;

complex: REAL ('-'|'+') IM
       | ('-')? REAL
       | ('-')? IM
       ;

REAL: INT;
IM: INT? 'i';
INT: [0-9]+;
ID: [a-zA-Z][a-zA-Z0-9]*;
COMMENT: '//' .*? '\n' -> skip;
WS: [ \t\r\n]+ -> skip;
