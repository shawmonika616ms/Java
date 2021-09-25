import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        

        System.out.println("\n........");
        MyAddition();
    }
    public static void MyAddition()
    {
        int a,b,sum;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        sum=a+b;
        System.out.println("Sum is"+sum);
        sc.close();
    }
    
}
