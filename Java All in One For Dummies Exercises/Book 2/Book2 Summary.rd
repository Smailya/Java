Book2

Java Programming Basics

 Definition of a class:
               public class HelloApp 
                      {
                          Public static void main(String[] args)
                          {
                                 System.out.println("Hello, World!");
                          } 
                       }

Public: means other classes can use it.
Class: contains code that defines the behavior of the objects created and used by the program
HelloApp (Class name): An identifier that provides the name for the class
{: The opening brace on line 2 marks the beginning of the body of the
Class, Everything that appears within these braces belongs to the class.
Void: when the method doesn’t return a value.
(String[] args): is a parameter list, it passes data to a method.
System.out.println("Hello, World!");  It calls a method named println that belongs to the System.out object. The text to be displayed is passed to the println method as a parameter in parentheses following the word println

How does a java program work
it loads the Java Virtual Machine (JVM) into memory.
it locates the HelloApp class, which must be contained in a file named HelloApp.class
Finally, it runs the main method of the HelloApp class.
The main method, in turn, displays the message "Hello, World!" on the console.

Java Keywords
Java has 53 keywords that can’t be used as an identifier.
keywords are sensitive.
true, false, and null are called literals.
keywords are case-sensitive.

Types of statements
Declaration statements, ex. To declare a variable and assign a value to it.
Expression statement perform calculation.
If statements.
Block statement

Working with Blocks
A block is a group of one or more statements that’s enclosed in braces

Creating Identifiers
Idenditfiers are use to identify a:
Class
Method
Variables or fields
Parameters
Rules to create identifiers are:
Must start with a letter.
Can be written using low or upper cases numbers, underscored.
Case sensitive


Crafting Comments

Comments provide explanations of your code, the compiler ignores it.
There are 3 types of comets:
Single Line comment (//)
multiple line comments ( begins with the sequence /* , ends with the sequence */, and can span multiple lines
JavaDoc Comments mostly use to document web-based programs

Introducing Object-Oriented Programming
a class is code that defines the behavior of a Java programming element called an object
An object is an instance of a class.
If you declare a method with the static keyword, you can call the method without first creating an instance of the class, because static methods are called from classes, not from objects.
To create an object from a class you can use the new  keyword to create an instance of the class, then assign it to a variable
import statements must appear at the beginning of the class file, before any
class declarations.
You can include as many import statements as are necessary to import all the
classes used by your program.
You can import all the classes in a particular package by listing the package
name followed by an asterisk wildcard, like this: import javax.swing.*;

Chapter 2
Working with Variables
and Data Types
Declaring Variables:
You must declare your variable before using it, The basic form of a variable declaration is this: type name;  int x; String lastName;
You can also declare multiples variables on the same line, by separing them with coma.

Declaring class variables

class variable is a variable that any method in a class can access, including static
methods such as main. When declaring a class variable, you have two basic rules
to follow:
place the declaration within the body of the class but not within any
of the class methods.
You must include the word static in the declaration. The word static
comes before the variable type. Ex.



Declaring instance variables
An instance variable is similar to a class variable but doesn’t specify the word
static in its declaration. As the name suggests, instance variables are associated
with instances of classes. As a result, you can use them only when you create
an instance of a class. Because static methods aren’t associated with an instance
of the class, you can’t use an instance variable in a static method — and that
includes the main method

Declaring local variables
A local variable is a variable that’s declared within the body of a method. Then you
can use the variable only within that method. Other methods in the class aren’t
even aware that the variable exists.

You must initialise your variables before using them.
Assignment statements have this general form: variable = expression;
a constant, is a variable whose value you can’t change after it’s been initialized.
add the final keyword to the variable declaration to create a constant
Primitive and Reference types:

Primitive types are the data types defined by the language itself.
Reference types are types defined by classes in the Java application programming interface (API) or by classes you create rather than by the language itself.
Java defines a total of eight primitive types.


An integer is a whole number — that is, a number with no fractional or decimal portion, such as int, long, short, byte
Floating-point numbers are numbers that have fractional parts such as float and double, To save that time, you can add an F or D suffix to a floating-point literal to indicate whether the literal itself is of type float or double.
The char type represents a single character from the Unicode character set. It’s important to keep in mind that a character is not the same as a string; To assign a value to a char variable, you use a character literal, which is always enclosed in apostrophes rather than quotes
Character literals can also use special escape sequences to represent special characters.

The Boolean type
A Boolean type can have one of two values: true or false. Booleans are used to perform logical operations, most commonly to determine whether some condition is true.
Every primitive type has a corresponding class defined in the Java API class
library. This class is sometimes called a wrapper class because it wraps a primitive value with the object-oriented equivalent of pretty wrapping paper and a bow to make the primitive type look and behave like an object. Table 2-3 lists the wrapper classes for each of the eight primitive types.
a reference type is a type that’s based on a class rather than on one of the
primitive types that are built into the Java language. A reference type can be based on a class that’s provided as part of the Java API class library or on a class that you write yourself. 
if you assign the object to a variable, the variable is actually assigned a reference to the object, not the object itself. This reference is the address of the memory location where the object is stored.


string is a sequence of text characters, strings are a reference type, you can combine strings by using the plus sign + .
To convert a string to a primitive type, you use a parse method of the appropriate wrapper class, ex: String s = "10"; int x = Integer.parseInt(s);
Java can automatically convert some primitive types to others and do so whenever necessary
The rules Java follows when doing this conversion:
»»If one of the values is a double, the other value is converted to a double.
»»If neither is a double but one is a float, the other is converted to a float
»»If neither is a double nor a float but one is a long, the other is converted to
a long.
»»If all else fails, both values are converted to int.
Casting is similar to conversion but isn’t done automatically. You use casting to perform a conversion
When you use casting, you run the risk of losing information.
To cast a primitive value from one type to another, you use a cast operator, which is simply the name of a primitive type in parentheses placed before the value you want to cast. ex:
                              double pi = 3.1314;
                                    int iPi;
                                 iPi = (int) pi;

Getting input from users

Use the Scanner class to get simple input values from the user. Before you use it you must import it. By typing import java.util.Scanner; then use the corresponding data type to convert the input to it



use the JOptionPane class, to display simple dialog boxes, you need to impot it by typing javax.swing.JOptionPane. ex:


String s;
s = JOptionPane.showInputDialog 
("Enter an integer:"); 
int x = Integer.parseInt(s); 
System.out.println("You entered " + x + ".");

 
Using enum to Create Your
Own Data Types
an enum, which is basically a custom variable type which has a limited set of possible values. 
This is how you define a enum.
public enum CardSuit {HEARTS, SPADES, CLUBS, DIAMONDS.
You can declare variables using the enum’s name as the data type:
CardSuit suit;
Then, you can assign a value by using the enum name followed by a period and any of the enum values, as in this example:
suit = CardSuit.HEARTS;




Chapter 3                                   
  Working with Numbers
and Expressions


An operator is a special symbol or keyword that’s used to designate a mathematical operation or some other type of operation that can be performed on one or more values, called operands.




CATEGORIZING OPERATORS BY THE
NUMBER OF OPERANDS

Unary operators: Operators that work on just one operand ex: -x
Binary operators: Operators that work on two operands (x+y)
Ternary operators: Operators that work on three operands, Java has only one ternary operator, called the conditional operator (?:). The conditional operator is also infix operand1 ? operand2 : operand3
you want to divide int values and get an accurate double result, you must cast at least one of the int values to a double
You can use the increment and decrement operators only on variables — not on numeric literals or other expressions
The standard assignment operator (=) is used to assign the result of an expression to a variable. variable = expression;
A compound assignment operator is an operator that performs a calculation and an assignment at the same time

Refer to page 116  for Creating random numbers

Number Formating


import statement at the beginning of any class that uses NumberFormat: import java.text.NumberFormat;

Refer to page 124  for Recognizing Weird Things about
Java Math


Chapter 4                                             
                              Making Choices



A basic Java boolean expression has this form:
expression relational-operator expression
The basic form of the if statement looks like this:
if (boolean-expression)
statement
An if-else statement adds an additional element to a basic if statement: a statement or block that’s executed if the boolean expression is not true. Its basic format is
if (boolean-expression)
statement
else
statement
The general form of a nested if statement is this:
if (expression-1)
if (expression-2)
statement-1
else
statement-2
else
if (expression-3)
statement-3
else
statement-4



The general form for using the conditional operator is this:
boolean-expression ? expression-1 : expression-2
int tier = salesTotal > 10000.0 ? 1 : 0;
The correct way to test a string for a given value is to use the equals method of the String class: 
if (answer.equals("Yes"))
System.out.println("The answer is Yes.");
The String class has another method, equalsIgnoreCase, that’s also useful for
comparing strings. It compares strings but ignores case
if (input.equals("end"))




Chapter 5

Going Around in Circles
(Or, Using Loops)





The while statement creates a type of loop that’s called a
While loop, which is simply a loop that exe
Cutes continuously as long as some conditional expression evaluates to true.

The while statement
The basic format of the
while
statement is this:
while (expression)
Statement

An infinite loop goes on forever, So whenever you use a while expression that’s always true, be sure to throw in a
break statement to give your loop some way to terminate


The continue statement sends control right back to the top
of the loop, where the expression is immediately evaluated again. If the expression is still true, the loop’s statement or block is executed again.


The do-while loops execute first before checking the expression.
The basic form of a do-while loop is this:
do
statement
while (expression);

A for loop is that the loop itself maintains a counter variable — that is, a variable whose value increases each time the body of the loop is executed, you can also use for loop without body,  format of it:
for (initialization-expression; test-expression; count-expression)
statement;

Nesting Your Loops, The loop that’s inside is called the inner loop, and
the loop that’s outside is called the outer loop.






Chapter 6 
 Pulling a Switcheroo



The switch statements.The basic form of the switch statement is this:
switch (expression)
{
case constant:
statements;
break;
[ case constant-2:
statements;
break; ]...
[ default:
statements;
break; ]...
}

The expression must evaluate to an int, short, byte, or char. It can’t be a long or a floating-point type


Chapter 7 
 Adding some methods

All methods — including the main method — must begin with a method declaration. Here’s the basic form of a method declaration.
public static return-type method-name (parameter-list)
{
statements...
}

Refer to page 195 for more information about each word of the declaration,

To create a method that returns a value, you simply indicate the type of the value returned by the method on the method declaration in place of the void keyword. Here’s a method declaration that creates a method that returns an int value:

public static int getRandomNumber()
A parameter is a value that you can pass to a method. Then the method can use the parameter as though it were a local variable initialized with the value of the variable passed to it by the calling method.




Chapter 8
Handling Exceptions


An exception is an object that’s created when an error occurs in a Java program and Java can’t automatically fix the error.
You catch an exception by using a try statement, which has this general form:
try
{
statements that can throw exceptions
}
catch (exception-type identifier)
{
statements executed when exception is thrown
}

If you don’t want to be too specific in a catch block, you can specify Exception instead of a more specific exception class. For example:
try
{
int c = a / b;
}
catch (Exception e)
{
System.out.println("Oops, you can't "
+ "divide by zero.");
}


The following example shows how you could print the message for an exception in a catch block:


try
{
int c = a / b;
}
catch (Exception e)
{
System.out.println(e.getMessage());
}


A finally block is a block that appears after all the catch blocks for a statement. It’s executed whether or not any exceptions are thrown by the try block or caught by any catch blocks.

The basic framework for a try statement with a finally block is this:

try
{
statements that can throw exceptions
}
catch (exception-type identifier)
{
statements executed when exception is thrown
}
finally
{
statements that are executed whether or not
exceptions occur
}

you may want to write methods that throw exceptions all on their own. To do that, you use a throw statement. The throw statement has the following basic format:
throw new exception-class ();

Java lets you specify two or more exception types in the
Catch statement. You separate the exception types with a vertical bar,
like this:

{
// statements that might throw FileNotFoundException // or IOException
}
catch (FileNotFoundException | IOException e)
{
System.out.println(e.getMessage());
}
