Book1 Summary
Chapter 1
Welcome to Java

Features of java:

 Platform independence.
means that Java programs can be run on many types of computers. A Java program runs on any computer with a Java Runtime Environment, also known as a JRE, installed. A JRE is available for almost every type of computer you can think of.
A compiler is a program that translates programs written in a programming language into a form that can actually run on a computer.
Java is based on the concept of a virtual machine which is a design for a computer that doesn’t exist as actual hardware. Instead, the JRE is an emulator — a program that sets aside part of your hard drive to act like a computer (namely, the JVM) that can execute Java programs.


How does the JVM work

The Java compiler doesn’t translate Java into the machine language of the computer that the program is running on. Instead, the compiler translates Java into the machine language of the JVM, which is called bytecode. Then the JRE runs the bytecode in the JVM. Because of the JVM, you can execute a Java program on any computer that has a JRE installed without recompiling the program.


Object orientation, 
 which means that Java programs are made up from programming elements called objects, an object is a programming entity that represents either some real-world object or an abstract concept.
Objects also have behavior which are methods
Objects have data which are states
A class is the program code you write to create objects
An object is an instance of a class
A class is the blueprint from which objects are created(class are used to create object)


The Java API
          Java comes with a library of classes that provide commonly used utility functions that most Java programs can’t do without. This class library, called the Java API, mastering the API is more challenging because it has thousands classes and methods you can use in your program. For more information check java API documentation at http://download.java.net/jdk9/docs/api.


 The Internet

       the whole concept behind the JVM is to enable any computer connected to the Internet to run Java programs, regardless of the type of computer or the operating system it runs.


Java’s Weaknesses
The API is way too big
The API is overdesigned.
In my opinion, the biggest weakness of Java is that it doesn’t directly support true decimal data

Chapter 2 Installing Java

You need to install the jdk
then configure your path, 

Compiling a program
After typing your code save it as name.java(extention).
Open cmd type javac filename.java
A file class will be created.
Type in the cmd: java filename


Compiling more than one file
You can list more than one filename in the javac command. The following
command compiles three files: javac TestProgram1.java TestProgram2.java TestProgram3.java
You can use a wildcard to compile all the files in a folder, like this: javac *.java



Java Documentation
Complete documentation for Java is available on the Oracle Java website at
http://download.java.net/jdk98/docs.


Chapter 3 Working with TextPad
You don’t have to download TextPad there are a lot of alternatives out there. Such as Netbeans etc.
