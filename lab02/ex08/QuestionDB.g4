grammar QuestionDB;

program: (question)* EOF;

question: ID '(' STRING ') {' option* '}'  ;

option: STRING ':' INT ';';

ID: [a-zA-Z.1-9]+;
INT: [0-9]+;
STRING: '"' .*? '"';
LINE_COMMENT: '#' .*? '\n' -> skip;
WS: [ \t\r\n]+ -> skip;