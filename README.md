### Math Expression Editor

Simple example of [Xtext](https://www.eclipse.org/Xtext/) project.

The project implements a simple editor for mathematical expressions. The editor allows defining:

- constants
- variables
- expressions

#### Constants

Constants are introduced by the keyword **Const**, followed by an identifier that allows using constant in expressions and a numerical value. Examples of constants are:

- **Const** c1 : 10;
- **Const** c2 : 3;

#### Variables

The definition of a variable has the same syntax of the definition of constants, but it is prefixed by keyword **Var**. Examples of variables are:

- **Var** x : 7;
- **Var** y : 12;

#### Expressions

Expressions allow combining constants, variables, and numerical values with mathematical operators **+** and **-**. The definition of and expression follows the same syntax used for constants and variables, but it is prefixed by keyword **Exp**. Examples of expressions are:

- **Exp** e1 : x + c1;
- **Exp** e2 : 7 - c2 + y;

Expression definition also support the use of parentheses

- **Exp** e3 : (x + c1 ) - (7 - c2 + y);


#### Syntactic checkers

The editor implements some basic syntactic checkers:

- Constant and variable identifiers cannot be duplicated. For instance, the following is not permitted

> **Const** c1 : 10;
>
> **Var** c1 : 7;

-  Constant and variable identifiers used in a expression must be defined. For instance, the following is not permitted

> **Var** x : 7;
>
> **Exp** e : x + y ;


#### Requirements

The project has been developed with Eclipse version 2022-06 (4.24.0) and Xtext version 2.27.0. 
