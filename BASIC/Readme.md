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

eg:

     int i,j,k=20;  //3 variables, i, j, k declared but only k is initialized
     char $ab = 'A'; //a variable of char type, named as $ab initialized with a value = A
    
### Conditional Statements(if/if-else/if-else if-else)
- The various kinds of conditional statements:
     * if statement
     * if-else statement
     * Switch Case Statement
   
- *if statement*
     ```
     if(condition)
     {
          statement
     }
     ```
     * if the condition is satisfied, then execute the statement
     * else is optional
- *else statement*
     ```
     if(condition)
     {
          statement1
     }
     else
     {
          statement2
     }
     ```
     * if the condition is satisfied, then execute the statement1
     * else execute the statement2
- *else if statement*
     ```
     if(condition1)
     {
          statement1
     }
     else if(condition2)
     {
          statement2
     }
     else
     {
          statement3
     }
     ```
     * if the condition1 is satisfied, then execute the statement1
     * if not, check condition2
     * if condition2 is satisfied, then execute the statement2
     * else execute the statement3

### Classes and Objects
- A **class** is a group of objects having common property.
- An **object** is an instance of class.

**Test t = new Test();**

Here,
* Test : Class name
* t : Reference Variable
* new : Keyword to create an object of that class
* Test() : Constructor used to initialize the object

**NOTE: Declaring reference variable doesn't mean creating an object. An object is created only by the use of "new" operator/keyword.**

### Constructors
- Every class has a constructor. 
- A user-defined constructor's name must be same as its class name.
- Constructors do not have a return type. If a return type is provided, comiler shows a comilation error.
- **Constructors are executed as a part of object creation.**
- **If we want to perform any type of initializations at the time of object creation, we use constructors.**
- If we do not explicitly write a constructor for a class, the Java compiler builds a default constructor for that class.
- Each time a new object is created, at least one constructor will be invoked. 
- The main rule of constructors is that they should have the same name as the class. 
- **A class can have more than one constructor.**

### Methods
- Functions in Java are called **Methods**.
- Return type is necessary, else it is a syntax error.
- A method’s name combined with the number and types of its parameters is called a **method’s signature**.
- Because the signature of a method in Java does not include the type that the method returns,
  so Java does not allow two methods with the same signature to return different types.
  
### Modifiers
- Immediately before defining any class, method or an instance variable, we can use modifiers to convey additional information about that definition.
- The various modifiers are:
    * **public**
        * modifier applicable for variables, methods, constructors, and classes.
        * The public access modifier is accessible everywhere. So, we can easily access the public inside and outside the class and package.
        * **NOTE: If a program contains multiple classes, at most one class can be assigned as public and the name of the program must be similar to that public class name.**
    * **private**
        * modifier applicable for methods and variables.
        * If a memeber is declared as private, then it can be accessed only from within that class.
        * If a method is declared as private, it means it can be accessed only from within its class. It is not possible to call even the child classes.
    * **protected**
        * If a member is declared as protected, then we can access it only within the current package anywhere, but outside the package only in the child classes.
        * From outside the package, we can access protected members only by using child reference. If we try to use parent reference, we get compilation error.
    * **static**
        * Used to create variables that will exist independently of any instances created for the class.
        * **NOTE: Only one copy of the static variable exists regardless of the number of instances of the class.**
        * Static methods do not use any instance variables of any object of the class they are defined in. 
        * Static methods take all the data from parameters and compute something from those parameters, with no reference to variables.
        * Class variables and methods can be accessed using the class name followed by a dot(.) and the name of the variable or method.
    * **final**
        * Used to restrict the user.
        * modifier applicable for variables, methods and classes.
        * If a variable is declared as final, we can't change the value of final variable(i.e., it will be constant).
        * If a method is declared as final, we can't override that method.
        * If a class is declared as final, we can't extend it.
        * **NOTE: A final method can be inherited but we can't override it.**
    * **abstract**
        * The abstract keyword is used to achieve abstraction in Java. 
        * It is a non-access modifier which is used to create abstract class and method.
        * The role of an abstract class is to contain abstract methods. However, it may also contain non-abstract methods.
    * **default**
        * modifier applicable for classes, methods and variables(only for instance and static variables but not for local variables).
        * If a class is declared with **default** modifier, then we can access that class only within that package but not from outside of the package.
        * The default modifier in Java is **default**.
        
     * **this** keyword
          * **this** is a reference variable that refers to the current object.
          * Usages of **this** keyword:
               * this can be used to refer current class instance variable.
               * this can be used to invoke current class method.
               * this() can be used to invoke current class constructor.
               * this can be passed as an argument in the method call.
               * this can be passed as argument in the constructor call. //first line
               * this can be used to return the current class instance from the method.
