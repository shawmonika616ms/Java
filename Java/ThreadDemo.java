class Hi extends Thread
{
    public void run() 
    {
            for(int i=1;i<=5;i++)
            {
                System.out.println("Hi");
                try
                {
                   Thread.sleep(1000);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
            }
    }
}

class Hellos extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Hello");
            try
            {
               Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
public class ThreadDemo {

    public static void main(String[] args) {

        Hi obj1= new Hi();
        Hellos obj2 = new Hellos();
        obj1.start();
        try
        {
           Thread.sleep(10);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        obj2.start();
       
        
    }
}