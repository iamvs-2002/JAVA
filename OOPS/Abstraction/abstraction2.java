//Abstraction using Interfaces

interface CarStart{    
    void start();    
}    
interface CarStop{    
    void stop();    
}    
public class abstraction2 implements CarStart, CarStop{    
    public void start()  {  
        System.out.println("start");  
    }    
    public void stop(){  
        System.out.println("stop");  
    }    
    public static void main(String args[]){    
        abstraction2 c = new abstraction2();    
        c.start();    
        c.stop();    
    }  
}  
