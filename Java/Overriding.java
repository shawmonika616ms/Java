class Ak
{
 public void show()
 {
     System.out.println("In show A");
 }
}

class Bk extends Ak
{
    public void show()
    {
        System.out.println("In show B");
    }
}


public class Overriding {
    


public static void main(String[] args) {
     Bk obj = new Bk();
     obj.show();
       }

}