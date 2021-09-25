class Abcd implements Cloneable
{
    int i;
    int j;

    public String toString()
    {
        return"Abc{" + "i" + i+ ",j"+j+'}';
    }

    public Object clone()  throws CloneNotSupportedException
    {
        return super.clone();
    }
}



public class ObjectCloning {
    public static void main(String[] args)  throws CloneNotSupportedException
     {
        
         Abcd obj= new Abcd();
         obj.i=1;
         obj.j=8;

        //  Abcd obj1 = obj;  // shallow cloning
       // Abcd obj1 = new Abcd(); // deep cloning
        //  obj1.i=obj.i;
        //  obj1.j=obj.j;
        //  obj1.j=6;


        Abcd obj1 = (Abcd)obj.clone();
        obj1.j=9;

         System.out.println(obj1);
         System.out.println(obj);
    }
}
