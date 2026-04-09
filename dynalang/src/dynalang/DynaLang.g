grammar DynaLang;

// Parser Specification of this Programming Language
//  - parser specification rules start with lowercase
// YOU WILL NEED TO EDIT THE PARSER RULES FOR THIS ASSGINMENT
program returns [Program ast] :   
		a=assign { $ast = new Program($a.ast);}
		| e=exp { $ast = new Program($e.ast); }
		| p=print { $ast = new Program($p.ast);}
		| o=open  { $ast = new Program($o.ast);}
		;

assign returns [AssignExp ast] :
		l=varexp '=' r=exp { $ast = new AssignExp($l.ast, $r.ast); }
		;

exp returns [Exp ast]:
	l=exp '+' r=exp { $ast = new AddExp($l.ast, $r.ast); }
	| n=numexp { $ast = $n.ast; }
	| v=varexp { $ast = $v.ast; }
	| s=strexp { $ast = $s.ast; }
	;

print returns [PrintExp ast]:
	Print e=exp	{$ast = new PrintExp($e.ast); }
	;

open returns [OpenExp ast]:
	Open l=varexp r=exp {$ast = new OpenExp($l.ast, $r.ast);}
	;


varexp returns [VarExp ast]:
	v=Identifier {$ast = new VarExp($v.text);}
	;

strexp returns [StringExp ast]:
	s=String {$ast = new StringExp($s.text);}
	;

numexp returns [Exp ast]:
 		n0=Number { $ast = new NumExp(Integer.parseInt($n0.text)); } 
  		| n0=Number Dot n1=Number { $ast = new NumExp(Double.parseDouble($n0.text+"."+$n1.text)); }
  		;		


 // Lexical Specification of this Programming Language
 //  - lexical specification rules start with uppercase
 // YOU SHOULD NOT EDIT THESE RULES IN THIS ASSIGNMENT
 Print: 'print';
 Open: 'open';

 Dot : '.' ;

 Number : DIGIT+ ;

 Identifier :   Letter LetterOrDigit*;

 String : '"' (~'"')* '"';

 Letter :   [a-zA-Z$_]
	|   ~[\u0000-\u00FF\uD800-\uDBFF] 
		{Character.isJavaIdentifierStart(_input.LA(-1))}?
	|   [\uD800-\uDBFF] [\uDC00-\uDFFF] 
		{Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}? ;

 LetterOrDigit: [a-zA-Z0-9$_]
	|   ~[\u0000-\u00FF\uD800-\uDBFF] 
		{Character.isJavaIdentifierPart(_input.LA(-1))}?
	|    [\uD800-\uDBFF] [\uDC00-\uDFFF] 
		{Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?;

 fragment DIGIT: ('0'..'9');

 WS  :  [ \t\r\n\u000C]+ -> skip;
