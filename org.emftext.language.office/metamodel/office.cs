SYNTAXDEF office
FOR <http://emftext.org/office>
START OfficeModel

OPTIONS {
  generateCodeFromGeneratorModel = "true";
}
TOKENS {
	DEFINE COMMENT $'//'(~('\n'|'\r'|'\uffff'))*$;
	DEFINE INTEGER $('-')?('1'..'9')('0'..'9')*|'0'$;
	DEFINE FLOAT $('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
}


TOKENSTYLES {
	"OfficeModel" COLOR #7F0055, BOLD;
	"name" COLOR #7F0055, BOLD;
	"elements" COLOR #7F0055, BOLD;
	"Office" COLOR #7F0055, BOLD;
	"Employee" COLOR #7F0055, BOLD;
	"worksIn" COLOR #7F0055, BOLD;
	"worksWith" COLOR #7F0055, BOLD;
}


RULES {
	OfficeModel ::= "officemodel" name[] 
	                "{" elements* "}";
	
	Office ::=      "office" name[];
	
	Employee ::=    "employee" name[]  
	                "works" "in" worksIn[]
	                "works" "with"  
	                 worksWith[] ("," worksWith[])*;
}