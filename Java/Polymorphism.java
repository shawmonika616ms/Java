class As
{
    public void show()
    {
        System.out.println("Hello");
    }

    public void show(int i)
    {
        System.out.println("Hello Hi "+i);
    }

    public void show(Double d)
    {
        System.out.println("Hello Hi "+d);
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        As obj= new As();
        obj.show(10);
    }

    
}
