grammar Calculatorv2;

@header {import java.util.*;}

program: stat* EOF;

stat:
	expr NEWLINE {
    System.out.println($expr.res);
}
	| NEWLINE;

expr
	returns[double res=0]:
	e1 = expr op = ('*' | '/') e2 = expr {
        switch($op.text) {
            case "*":
                $res = $e1.res * $e2.res;
                break;
            case "/":
                $res = $e1.res / $e2.res;
                    break;
        }
    }
	| e1 = expr op = ('+' | '-') e2 = expr {
        switch($op.text) {
            case "+":
                $res = $e1.res + $e2.res;
                break;
            case "-":
                $res = $e1.res - $e2.res;
                break;
        }
    }
	| INT {
        $res = Double.parseDouble($INT.text);
    }
	| '(' expr ')' {
        $res = $expr.res;
    };

INT: [0-9]+;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;