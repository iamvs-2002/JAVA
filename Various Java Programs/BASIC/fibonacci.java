import java.util.*;

public class fibonacci { 
  
    private static Scanner sc = new Scanner(System.in);
  
    public static void main(String args[]) 
    { 
        System.out.println("Kindly enter the number of fibonacci numbers required: ")
        int N = sc.nextInt(); 
      
        int a=0, b=1; 

          for(int i=0;i<N;i++){
            
              System.out.print(a + " "); 

              int c = b + a; 
              a = b; 
              b = c; 
          } 
    } 
} 
