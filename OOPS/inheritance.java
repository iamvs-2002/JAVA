/*
The process of getting properties and behaviours from one class to another class is called Inheritance.
Inheritance is achieved by using the keyword "extends".
To reduce length of the code and redundancy of the code, we use inheritance.
The class who is giving the properties is called Parent class and who is taking the properties is called Child class.
*/
class Parent{
    public void m1(){
        System.out.println("m1 method");
    }
    public void m2(){
        System.out.println("m2 method");
    }
}
public class inheritance extends Parent{
    
    public void m3(){
        System.out.println("m3 method");
    }
    public static void main(String[] args) {
        inheritance e = new inheritance();
        e.m1();//m1 method
        e.m2();//m2 method
        e.m3();//m3 method
        Parent p =new Parent();
        p.m1();//m1 method
        p.m2();//m2 method
    }
}
