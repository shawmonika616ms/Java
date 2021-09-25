public class Perfect {
    
    //Factors of 6-1,2,3
    public static void main(String[] args) {
        
        int n=8;
        boolean b= isPerfect(n);
        if(b)
        
            System.out.println("Perfect number");
        else
        System.out.println("Not a perfect number");
    }
    public static boolean isPerfect(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            sum=sum+i;
        }
        if(n==sum)
        return true;
        return false;
    }
}
