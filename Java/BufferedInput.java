import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BufferedInput {
    public static void main(String[] args) throws Exception
    {
        
        System.out.println("Enter a number");
        InputStreamReader is =  new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n =Integer.parseInt(br.readLine());

        System.out.println(n);
        br.close();

    }
    
}
