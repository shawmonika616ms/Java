

class Iphone extends Phone
{
    public void show()
    {
        System.out.println("Iphone 2");
    }
}

class Samsung extends Phone
{
    public void show()
    {
        System.out.println("2 gb lollipop");
    }
}


abstract class Phone
{
    public abstract void show();
}


public class AbstractDemos {
    public static void main(String[] args) {
        Iphone obj= new Iphone();
        shows(obj);
        Samsung obj1= new Samsung();
        shows(obj1);
    }

    public static void shows(Phone obj)
    {
        obj.show();
    }
    
  
}
