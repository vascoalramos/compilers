grammar Hello; // define a grammar called Hello

main: (greetings | farewell)* EOF ;

/*
 * match keyword 'hello' followed by an identifier followed by an action: print the following
 * portuguese statement "Olá ID"
 */
greetings:
	'hello' names {
        System.out.println("Olá " + $names.totalName);
    };

/*
 * match keyword 'bye' followed by an identifier followed by an action: print the following
 * portuguese statement "Adeus ID"
 */
farewell:
	'bye' names {
        System.out.println("Adeus " + $names.totalName);
    };

/*
 * construct person's name
 */
names returns[String totalName = ""] :
    (ID {
        $totalName = $totalName + ($totalName.isEmpty() ? "" : " ") + $ID.text;
    })+;

ID: [a-zA-Z]+; // match lower and upper case identifiers
WS: [ \t\r\n]+ -> skip; // skip spaces, newlines anf \r (windows)