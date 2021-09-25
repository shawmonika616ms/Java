// public class DemoStatic {

//     static
//     {
//         System.out.println("Hi static 1");
//     }
//     public static void main(String[] args) {
//         System.out.println("Main method");
//     }

//     static{
//         System.out.println("bye static 2");
//     }
    
// }






public class DemoStatic {

    static String s="";
    static
    {
       s="Hello";
    }
    public static void main(String[] args) {
        
        System.out.println("Main method"+s);
    }

   
    
}
