// abstract class Animal {
//     public abstract void sound();
    
// }

// public class Abstrct extends Animal
// {
//     public void sound()
//     {
//         System.out.println("hello");
//     }

//     public static void main(String[] args) {
//         Animal obj= new Abstrct();
//         obj.sound();
        
//     }
// }



abstract class  sum
{
    
    public abstract  int sumof(int a, int b);

public void display()
{
    System.out.println("Method of abstract class");
   }
}

/**
 * Abstrct
 */
public class Abstrct extends sum {
   
    public int sumof(int a,int b)
    {
   return a+b;
}

public static void main(String[] args) {
    sum obj = new Abstrct();
    System.out.println(obj.sumof(10, 20));
    obj.display();
  }
}