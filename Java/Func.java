import java.util.Scanner;

public class Func {
    //without argument without return
    // public static void main(String[] args) {
        
    //     System.out.println("\n");
    //     Myfunc();
    // }
    // public static void Myfunc() {
 
    //     int a, b ,sum=0;
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the number");
    //     a=sc.nextInt();
    //     b=sc.nextInt();
    //     sum=a+b;
    //     System.out.println("Sum is"+sum);
    //     sc.close();
    // }

    //with argument without return
     //  public static void main(String[] args) {
             
        //     int a,b;
        //     Scanner sc =new Scanner(System.in);
        //     System.out.println("Enter the number");
        //     a=sc.nextInt();
        //     b=sc.nextInt();
        //     Add(a,b);
        //     sc.close();
        //  }

        //  public static  void Add(int a ,int b)
        //  {
        //      int sum=0;
            
        //      sum=a+b;
        //      System.out.println("The sum is"+sum);
           
        //  }
    


    // without argument with return
    // public static void main(String[] args) {
        
    //     int sum;
    //     sum=Add();
    //     System.out.println("The sum is"+sum);
    // }

    // public static int Add() {

    //     int a, b,s=0;
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the numbers");
    //     a=sc.nextInt();
    //     b=sc.nextInt();
    //     s=a+b;
    //     sc.close();
    //     return s;
        
        
    // }

    public static void main(String[] args) {
        
        int a,b,sum;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        sum=Add(a,b);
        System.out.println("the result is"+sum);
        sc.close();
    }

    public static int Add(int a, int b) {

        int s=0;
        s=a+b;
        return s;
       
        
    }
}
