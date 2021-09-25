import java.util.Scanner;

public class Pallindrome 
{
            public static void main(String[] args)
            {


                    int a=1,n,r=0,temp;
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter the number");
                    n= sc.nextInt();
                    temp=n;
                    while(n!=0)
                            {
                                a=n%10;
                                r=r*10+a;
                                n=n/10;
                            }
                    if(temp==r)
                                System.out.println("Pallindrome");
                    else

                                System.out.println("Not a Pallindrome number");
                                sc.close();


            }
          

}
