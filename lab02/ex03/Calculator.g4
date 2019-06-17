grammar Calculator;

program: stat* EOF;

stat:
	expr NEWLINE {
        System.out.println("Result: " + $expr.res);
    }
	| NEWLINE;

expr
	returns[int res = 0]:
	e1 = expr op = ('*' | '/') e2 = expr {
        switch ($op.text) {
            case "*":
                $res += $e1.res * $e2.res;
                break;

            case "/":
                if ($e2.res == 0) {
                    System.err.println("Division by 0 not possible");
                    System.exit(1);
                }
                $res += $e1.res / $e2.res;
                break;
        }
    }
	| e1 = expr op = ('+' | '-') e2 = expr {
        switch ($op.text) {
            case "+":
                $res = $e1.res + $e2.res;
                break;

            case "-":
                $res = $e1.res - $e2.res;
                break;
        }
    }
	| INT {
        $res = Integer.parseInt($INT.text);
    }
	| '(' expr ')' {
        $res = $expr.res; 
    };

INT: [0-9]+;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;