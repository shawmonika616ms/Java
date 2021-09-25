import java.util.Scanner;

public class Febonacci {
    public static void main(String[] args) {
        int i,a=1,b=1;
        Scanner sc=new Scanner(System.in);
        i=0;
        System.out.println("Enter the number");
        int n =sc.nextInt();
        System.out.print("1 1");

        while(i<=n)
        {
          i=a+b;
          if(i>=n)
          break;
          System.out.print(i+"");
          a=b;
          b=i;

        }
        sc.close();
        
    }
    
}
