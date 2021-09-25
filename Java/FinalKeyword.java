class Ay
{
           public void show()
           {
               System.out.println("In a show");
           }
}

class By extends Ay
{
    public void show()
    {
        System.out.println("In b show");
    }

}


public class FinalKeyword {

    public static void main(String[] args) {

        By obj= new By();
        obj.show();
       
    }
    
}
