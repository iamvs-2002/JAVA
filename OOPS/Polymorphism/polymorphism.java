/*
One thing that can exhibit more than one form.
Runtime Polymorphism is applicable on methods, constructors but not on variables.
Two types of Polymorphism:
-Compile time polymorphism(Method Overloading)
-Runtime polymorphism(Method Overriding)
*/
class b{
    int i=2;
    void abc(){
        System.out.println(i);
    }
}
class a extends b{
    int i=3;
    void abc(){
        System.out.println(i);
    }
}
public class polymorphism{
    public static void main(String[] args) {
        a obj = new a();
        obj.abc();//3
        System.out.println(obj.i);//3
    }
}
