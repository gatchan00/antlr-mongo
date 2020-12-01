grammar Mongo;		
prog:	main WHITES? NEWLINE ;
main: doc
	| array
	;
arrayElement: doc
	| WORD
	| FLOAT
	| INT
	| COMMAND
	| AGGCMD
	| array
	;
	
array: '[' (arrayElement ',' WHITES?)* arrayElement ']'
	| '[' ']'
	;
doc:	  'Document' '{' json '}' ;
json: '{' tuples '}'  ;
tuples: (key '=' value ',' WHITES?)*  key '=' value ;
key: WORD
	| '"' WORD '"'
	| COMMAND
	| '"' COMMAND '"'
    ;
value:	WORDSPACE
	| INT
	| ALPHANUM
	| FLOAT
	| array
	| doc
	| COMMAND
	| AGGCMD	
	;
NEWLINE : [\r\n]+ ;
INT     : [0-9]+ ;
FLOAT     : [0-9]+[.][0-9]* ;
WORD	: [_a-zA-Z][_.a-zA-Z0-9]* ;
WORDSPACE	: [_a-zA-Z][_. a-zA-Z0-9]* ;
COMMAND : '$'[_a-zA-Z][_.a-zA-Z0-9]* ;
AGGCMD  : '$$'[_a-zA-Z][_.a-zA-Z0-9]* ;
ALPHANUM: [_.a-zA-Z0-9]+ ;
WHITES  : [ \t]+ ;

