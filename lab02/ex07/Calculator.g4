/*
 * grammar to identify mathematical expressions and rearange them in Reverse Polish Notation
 */
grammar Calculator;

program: stat* EOF;

/*
 * code to identify a new entry each new entry can either be an expression or an empty line if it is
 * an expression, its result is presented it also supports assignments
 */
stat: expr NEWLINE          #ExprStat
    | assignment NEWLINE    #AssignmentStat
    | NEWLINE               #NewLineStat
    ;

/*
 * code to identify the possible expression definitions it also computes its value
 */
expr:
	e1 = expr op = ('*' | '/') e2 = expr    #MultDiv
	| e1 = expr op = ('+' | '-') e2 = expr  #SumSub
	| INT                                   #Number
	| '(' expr ')'                          #Parenthesis
	| ID                                    #Variable
    ;

assignment: ID '=' expr;

ID: [a-zA-Z]+;
INT: [0-9]+;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;