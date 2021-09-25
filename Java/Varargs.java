// public class Varargs {
//     public static void main(String[] args) {
//         Display obj= new Display();
//         obj.shows(10,20);
//         obj.shows(9, 5);
        
//     }
    
// }

// class Display
// {
//     public void show(int a)
//     {
//         System.out.println(a);
//     }
//     public void shows(int a,int b) {
        
//         System.out.println(a);
//         System.out.println(b);
//     }
// }

public class Varargs {
    public static void main(String[] args) {
        Display obj= new Display();
        obj.show(10);
      
        
    }
    
}

class Display
{
    public void show(int... a)
    {
        for(int i:a)
        {
        System.out.println(i);
        }
    }
    public void show(int a) {
        System.out.println(a+ "in show");
        
    }
    
}
