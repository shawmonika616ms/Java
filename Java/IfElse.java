public class IfElse {
    public static void main(String[] args) {
        // int a=10;
        // if(a%2==0)
        //     System.out.println(a+ " is even number");
        // else
        //     System.out.println(a+ " is odd number");



        int a=10,b=20,c=30;
        if(a>b && a>c)
        System.out.println(a+ "is greater");
        else if(b>c)   // no need to check for b>a becaause if 1t condition is false it simply means a is not greater
        System.out.println(b+ "is greater");
        else
        System.out.println(c+ "is greater");
        
    }
    
}
