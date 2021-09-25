import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeNumber {
    public static void main(String[] args) throws Exception
     {
        
 
    int n,c=0;
    InputStreamReader is = new InputStreamReader(System.in);

    BufferedReader br = new BufferedReader(is);

    System.out.println("Enter the number");
    n=Integer.parseInt(br.readLine());
    for(int i=1;i<=n;i++)
    {
        if(n%i==0)
        {
            c++;
        }
    }
    if(c==2)
    System.out.println("Prime number");
    else
    System.out.println("Not prime number");
       }


}