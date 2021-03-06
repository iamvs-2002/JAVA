//Hello World program in JAVA
public class helloworld{
/*
public : means that anyone can run this program
class : all codes in Java must belong to a class
helloworld : the name of our class
The name of the class must be the final name if it is declared public, else the class name can be anything.
{ : curly brace for opening the class body
*/

  public static void main(String[] args){
    /*
    public : means that anyone can run this method
    static : this method belongs to a class not an object
    void : this method doesn't return anything
    main : the name of this method
    (String[] args) : the parameters passed onto this method, in this case the arguments on the command line as an array of strings
    { : curly brace for opening the method body
    */
    
    System.out.println("Hello World!");
    /*
    System.out.println : the name of the method we want to call, in this case the method to print something on the screen
    ("Hello World!") : the parameter passed to this method, in this case the string/message we want to print
    ; : semi-colon indicates the end of this statement
    */
    
  }
  /*
  } : curly brace for closing the method body
  */
  
}
/*
} : curly brace for closing the class
*/
