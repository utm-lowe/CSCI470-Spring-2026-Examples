# Design Notes

- 2 opeators: + =
- 1 keyword: print
- 2 types: string, number
- dynamically typed

# Example Programs

__hello.dyn__
```
print "hello, world"
```

__add.dyn__
```
x=2
y=3
z=x+y
print z
```

__concat.dyn__
```
x="hello, "
y="world"
print x+y
```

__open.dyn__
```
open file "README.md"
print file
print file
print file
print file
```

# EBNF

```
< Program >     ::= < Assignment >
                    | < Expression >
                    | < Print >
                    | < Open >

< Assignment >  ::= < Id > = < Expression >

< Expression >  ::= < Expression > + < Expression >
                    | < Id >
                    | < Number >
                    | < String >

< Print >       ::= print < Expression >

< Open >        ::= open < Id > < Exp >

< Id >          ::= [a-zA-Z_][a-zA-Z_0-9]*

< String >      ::= '"' [^"]* '"'

< Number >      ::= [0-9]+ ('.' [0-9]+)?
```

# Todo List 
- [x] Design the language
- [x] EBNF Description
- [x] AST Nodes
- [x] Grammar File
- [x] Value Types
- [x] Environment
- [x] Evaluator
- [x] Printer
- [x] Interpter