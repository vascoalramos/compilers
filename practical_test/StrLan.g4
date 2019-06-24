grammar StrLan;

main: stat* EOF;

stat:
    print
    | assignment
    ;

print:  'print' expr;

assignment: ID ':' expr;

expr:
    STRING                              #ExprStr
    | ID                                #ExprVar
    | 'input' '(' expr ')'              #ExprInput
    | e1 = expr '+' e2 = expr                     #ExprConcat
    | '(' e1 = expr '/' e2 = expr '/' e3 = expr ')'    #ExprRepl
    ;

STRING: '"' .*? '"';
ID: [a-zA-Z_][a-zA-Z0-9_]*;
COMMENT: '//' .*? '\n' -> skip;
WS: [ \t\r\n]+ -> skip;