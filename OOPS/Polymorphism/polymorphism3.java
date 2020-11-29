class Bike{  
    int speedlimit=90;  
}  
class Honda3 extends Bike{  
    int speedlimit=150;  
}
public class polymorphism3{
    public static void main(String args[]){     
        Bike obj=new Honda3();  
        Honda3 x=new Honda3();  
        System.out.println(obj.speedlimit);//90  
        System.out.println(x.speedlimit);//150  
    }  
}

/*Runtime polymorphism can't be achieved by data members.*/

