import java.util.Scanner;

class Average
{
   public static void main(String arg[])
    {
       int n;double res=0;
       Scanner sc=new Scanner(System.in);
 
       System.out.println("Enter how many numbers to calculate the average");
       n=sc.nextInt();
       int a[]=new int[n];
       System.out.println("Enter "+n+" numbers");
       for(int i=0;i<n;i++)
	        a[i]=sc.nextInt();
       for(int i=0;i<n;i++)
	        res =res+a[i];
       System.out.println("Average = "+res/n);
    }
}
