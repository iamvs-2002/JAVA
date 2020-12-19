public class Puppy {
   public Puppy(String name) {// This constructor has one parameter, name.
      System.out.println("Passed Name is :" + name );
   }
   public Puppy(){
      System.out.println("Constructor with 0 arguments");  
   }
   public static void main(String []args) { // Following statement would create an object myPuppy
      Puppy myPuppy = new Puppy( "tommy" ); //Passed Name is :tommy
      Puppy myPuppy = new Puppy(); //Constructor with 0 arguments
   }
}
