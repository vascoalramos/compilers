/*
 * grammar to identify and compute the result of mathematical expressions
 */
grammar Calculator;

@header {
    import java.util.Map;
    import java.util.HashMap;
}

@members {
    private Map<String, Integer> vars = new HashMap<>();
}

program: stat* EOF;

/*
 * code to identify a new entry each new entry can either be an expression or an empty line if it is
 * an expression, its result is presented
 * it also supports assignments
 */
stat:
	expr NEWLINE {
        System.out.println("Result: " + $expr.res);
    }
    | assignment NEWLINE
	| NEWLINE;

/*
 * code to identify the possible expression definitions it also computes its value
 */
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
    }
    | ID {
        if (!vars.containsKey($ID.text)) {
            System.err.println("ERROR: \"" + $ID.text + "\" variable not found!");
            System.exit(1);
        }

        else
            $res = vars.get($ID.text);
    };

assignment: ID '=' expr {
    if (vars.containsKey($ID.text)) {
        System.err.println("ERROR: \"" + $ID.text + "\" variable is already defined!");
        System.exit(1);
    }

    else {
        vars.put($ID.text, $expr.res);
    }
};

ID: [a-zA-Z]+;
INT: [0-9]+;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;