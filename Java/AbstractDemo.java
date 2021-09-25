 abstract class Mahesh
{
    public void cal()
    {
        System.out.println("calling");
    }

    public abstract void move();
    public abstract void dance(); 
    public abstract void cook();
}


 abstract class Ramesh extends Mahesh
{
    public void move()
 {
     System.out.println("Moving");
 }
 public abstract void dance(); 
 public abstract void cook();

}


class Suresh extends Ramesh
{
    public void dance()
 {
     System.out.println("Dancing");
 }

 public void cook()
 {
     System.out.println("Cooking");
 }
 

}

public class AbstractDemo {
 
    public static void main(String[] args) {
        Suresh obj = new Suresh();
        obj.cal();
        obj.move();
        obj.dance();
        obj.cook();
        
        
    }
}
