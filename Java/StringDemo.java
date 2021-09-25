import java.util.Scanner;
public class StringDemo {
    public static void main(String[] args) {
    
        String s1,s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st string");
        s1=sc.nextLine();
        System.out.println("Emter the 2nd string");
        s2=sc.nextLine();
        String s4 = s1.toUpperCase();
        System.out.println("Uppercase"+s4);
        int l1 =s1.length();
        int l2=s2.length();
        System.out.println(l1+ "  "+l2);
        String s3=s1+s2 ;//s1.concat(s2);
        System.out.println("Result is"+s3);
        sc.close();
    }
    
}
