/*
Hiding the internal implementation and highlighting the set of services that process is called Abstraction.

Two ways to achieve Abstraction:
-Abstract Class
-Interfaces

*/

//Abstraction using Abstract Class

abstract class Bank{
    abstract int getRateOfInterest();
}
class SBI extends Bank{
    int getRateOfInterest(){
        return 3;
    }
}
class PNB extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}
public class abstraction {
    public static void main(String[] args) {
        Bank b;
        b=new SBI();
        System.out.println(b.getRateOfInterest());//3
        b=new PNB();
        System.out.println(b.getRateOfInterest());//8
    }
}
