// 153 = 1^3 + 5^3 + 3^3

import java.util.Scanner;
class Armstrong
{
	public static void main(String[] arg)
	{
    int a,arm=0,n,temp;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number ");
    n=sc.nextInt();
    temp=n;
    for( ;n!=0;n/=10 )
    {
      a=n%10;
      arm=arm+(a*a*a);
    }
    if(arm==temp)
      System.out.println(temp+" is an armstrong number!");
    else
      System.out.println(temp+" is not an armstrong number!");
  }
}
