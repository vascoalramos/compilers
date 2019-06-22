grammar Sets;

main: expr* EOF;

expr:
	e1 = expr '\\' e2 = expr	# ExprSubtract
	| e1 = expr '&' e2 = expr	# ExprIntercept
	| e1 = expr '+' e2 = expr	# ExprUnion
	| '(' e = expr ')'	        # Parenthesis
	| set			            # ExprSet
	| VAR '=' e = expr          # ExprAssignment
	| VAR			            # ExprVar
    ;

set: '{' elem (',' elem)* '}';

elem: WORD | NUM;

WORD: [a-z]+;
NUM: [-+]? [0-9]+;
VAR: [A-Z]+;
COMMENT: '--' .*? '\n' -> skip;
WS: [ \t\r\n]+ -> skip;
