/*
 * grammar to identify and compute the result of mathematical expressions in Reverse Polish Notation
 */
grammar SuffixCalculator;

program: stat* EOF;

/*
 * code to identify a new entry each new entry can either be an expression or an empty line if it is
 * an expression, its result is presented
 */
stat:
	expr NEWLINE {
        System.out.println("Result: " + $expr.res);
    }
	| NEWLINE;

/*
 * code to identify the possible expression definitions it also computes its value
 */
expr
	returns[double res=0.0]:
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