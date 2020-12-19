### Basic 
- In Java, all the executable statements are placed inside functions called as **methods**, that belong to the class definitions.

For example, in the helloworld.java program, there is only one static method named as main, which is the first method that gets executed in a Java program.
- Any set of statements in between "{" and "}" define a **block**.
- The name of a class, method or any variable in Java, is called as **identifier**, which can be any string of characters beginning with a letter (or with an _ or $) and consists of letters or numbers, except the reserved words.

Some of the reserved words in Java are: public, class, static, try, catch, finally abstract, synchronized, true, false, void etc. *These names cannot be used as class, method or variable names.*

### Comments
- Comments are not executed by the compiler. These are basically the statements used to explain or define the working of the code.
- Used to increase readability of the code for ourselves as well as fellow programmers.
- Single line comments: // comment
- Multiline comments: /* comment */

### Data Types
- Also called as Base Types or Primitive Types.

* **boolean**-false-*1 bit*
* **char**- -*2 bytes*
* **byte**-0-*1 byte*
* **short**-0-*2 bytes*
* **int**-0-*4 bytes*
* **long**-0L-*8 bytes*
* **float**-0.0f-*4 bytes*
* **double**-0.0d-*8 bytes*

eg: - int i,j,k=20;  //3 variables, i, j, k declared but only k is initialized
    - char $ab = 'A'; //a variable of char type, named as $ab initialized with a value = A
    
### Classes and Objects
- A **class** is a blueprint from which individual objects are created.
- An **object** is an instance of class.

### Constructors
- Every class has a constructor. 
- If we do not explicitly write a constructor for a class, the Java compiler builds a default constructor for that class.
- Each time a new object is created, at least one constructor will be invoked. 
- The main rule of constructors is that they should have the same name as the class. 
- **A class can have more than one constructor.**

### Methods
- Functions in Java are called **Methods**.
- A method’s name combined with the number and types of its parameters is called a **method’s signature**.
- Because the signature of a method in Java does not include the type that the method returns,
  so Java does not allow two methods with the same signature to return different types.
