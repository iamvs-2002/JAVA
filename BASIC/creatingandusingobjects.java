public class CounterDemo 
{
    public static void main(String[ ] args) 
    {
        Counter c; //  declares a variable; no counter yet constructed
        c = new Counter( ); // constructs a counter; assigns its reference to c
      
        c.increment( ); // increases its value by one
        c.incremen  t(3); // increases its value by three more
      
        int temp = c.getCount( ); // will be 4
        c.reset( ); // value becomes 0
      
        Counter d = new Counter(5);// declares and constructs a counter having value 5
        d.increment( ); // value becomes 6
      
        Counter e = d; // assigns e to reference the same object as d
        temp = e.getCount( ); // will be 6 (as e and d reference the same counter)
        e.increment(2); // value of e (also known as d) becomes 8
    }
}
