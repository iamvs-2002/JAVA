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
public class polymorphism2{
    public static void main(String[] args) {
        b obj = new a(); //obj is of type b
        obj.abc();//3 //calls abc() method of a
        System.out.println(obj.i);//2 //prints instance variable of b because variables can't be overridden.
    }
}

/*
The explanation of: b obj = new a();
b is a superclass of a, i.e. a is under b in class hierarchy.
You are creating an object of a and assiging its reference to a variable called obj.
You are referencing your newly created object through the view of class b, i.e., you will not be able to use any method that a has but b doesn't have.
*/
