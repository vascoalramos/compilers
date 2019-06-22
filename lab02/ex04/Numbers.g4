grammar Numbers;

file: line* EOF;

line:
	NUM '-' WORD NEWLINE; // each line is number - word (ex: 0 - zero)

NUM: [0-9]+;
WORD: [a-zA-Z]+;
NEWLINE:
	'\r'? '\n'; // definition of newline (\r\n if it is windows)
WS: [ \t]+ -> skip; // skip spaces