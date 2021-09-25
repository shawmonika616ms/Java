import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoException1 {
    public static void main(String[] args) throws Exception {
        
        int i,j=1,k=0;
    

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        i=8;
       
        try{
            System.out.println("Enter a number");
            j=Integer.parseInt(br.readLine());
            k=i/j;
            System.out.println("Output is: "+k);
         
        }
        catch(IOException e)
        {
            System.out.println("Some wrong inout");
        }
      
        catch(ArithmeticException e)
        {
            System.out.println(e);
            
        }
        catch(Exception e)
        {
            System.out.println("Unknown exception");
        }

        finally
        {
            br.close();
            System.out.println("Bye");
        }

      
        
        
    }
}

