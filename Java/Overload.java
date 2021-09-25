import java.util.Scanner;
class Make{
    int p;
    int q;
    int r;
    int addition=0;
    int addition1=0;

   void insert(int ps,int qs)
    {
       p=ps;
       q=qs;
    }

    void add(int p,int q)
    {
        addition=p+q;
    }

    void add(int p,int q,int r)
    {
        addition1=p+q+r;
    }

    void display()
    {
        System.out.println("The sum is"+addition);
        System.out.println("The sum is"+addition1);
    }
}


public class Overload {

    public static void main(String[] args) {
        int p1,q1,r1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the alue of p q and r");
        p1=sc.nextInt();
        q1=sc.nextInt();
        r1=sc.nextInt();
        Make obj= new Make();
        obj.add(p1, q1);
        obj.add(p1,q1,r1);
        obj.display();
        sc.close();

    }
}
