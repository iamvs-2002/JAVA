/*
Encapsulation in Java is a process of wrapping code and data together into a single unit.
It is a way to achieve data hiding in Java because other class will not be able to access the data through the private data members.
*/
class Account {  
    private int acc_no;  
    private String name,email;  
    private float amount;  
    public int getAcc_no() {  
        return acc_no;  
    }
    public void setAcc_no(int acc_no) {  
        this.acc_no = acc_no;  
    }
    public String getName() {  
        return name;  
    }
    public void setName(String name) {  
        this.name = name;  
    }
    public String getEmail() {  
        return email;  
    }
    public void setEmail(String email) {  
        this.email = email;  
    }
    public float getAmount() {  
        return amount;  
    }
    public void setAmount(float amount) {  
        this.amount = amount;  
    }
}
    public class encapsulation {  
        public static void main(String[] args) {  
            //creating instance of Account class  
            Account acc=new Account();  
            //setting values through setter methods  
            acc.setAcc_no(123);  
            acc.setName("Name");  
            acc.setEmail("abc@gmail.com");  
            acc.setAmount(1000f);  
            //getting values through getter methods  
            System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());  
        }  
        }  