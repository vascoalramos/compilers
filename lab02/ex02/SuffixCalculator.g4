grammar SuffixCalculator;

program: stat* EOF;

stat:
	expr NEWLINE {
        System.out.println("Result: " + $expr.res);
    }
	| NEWLINE;

expr
	returns[double res = 0.0]:
	e1 = expr e2 = expr op = ('*' | '/' | '+' | '-') {
        switch ($op.text) {
            case "+":
                $res = $e1.res + $e2.res;
                break;

            case "-":
                $res = $e1.res - $e2.res;
                break;

            case "*":
                $res = $e1.res * $e2.res;
                break;

            case "/":
                if ($e2.res == 0) {
                    System.err.println("Division by 0 not possible");
                    System.exit(1);
                }
                $res = $e1.res / $e2.res;
                break;
        }
    }
	| Number {
        $res = Double.parseDouble($Number.text);
    };

Number: [0-9]+ ('.' [0-9]+)?;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;