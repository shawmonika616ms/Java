class Aq
{
   int i=5;


   public void abc()
 {
     System.out.println("A abc");
 }
}

class Bq extends Aq
{
 public void show()
 {
    //  int i=4;
     System.out.println(super.i);
 }

 public void abc()
 {
     super.abc();
     System.out.println("B abc");
 }
}


public class SuperKeyword {
    
    public static void main(String[] args) {
        
        Bq obj = new Bq();
        obj.show();
        obj.abc();
    }
}
