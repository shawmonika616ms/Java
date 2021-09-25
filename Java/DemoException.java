public class DemoException {
    public static void main(String[] args) {
        
        int i,j,k=0;
        int a[]= new int[4];
        i=8;
        j=4;
        try{
            k=i/j;
            for(int c=0;c<=4;c++)
            {
                a[c]=c+1;
            }
        }
      
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
       

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("MAximum no of vales is 4");
        }
        catch(Exception e)
        {
            System.out.println("Unknown exception");
        }

        System.out.println(k);
        
        
    }
}
