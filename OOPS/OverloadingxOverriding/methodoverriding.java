//An example of Method Overriding
class Parent{
    public void mon(){
        System.out.println("Parent mon");
    }
    public void m2(){
        System.out.println("Parent m2");
    }
}
public class methodoverriding extends Parent{
    public void mon(){
        System.out.println("Child mon");
    }
    public static void main(String[] args) {

        methodoverriding a = new methodoverriding();//child class
        Parent b = new Parent();
        a.mon();//Child mon
        b.mon();//Parent mon
        a.m2();//Parent m2
        b.m2();//Parent m2
    }
}
