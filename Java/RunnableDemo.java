class Hii implements Runnable
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

    public void start() {
    }
}

class Helloss implements Runnable
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

    public void start() {
    }
}
public class RunnableDemo {

    public static void main(String[] args) {

        Hii obj1= new Hii();
        Helloss obj2 = new Helloss();

        Thread t1= new Thread(obj1);
        Thread t2= new Thread(obj2);
        
        t1.start();
        try
        {Thread.sleep(10); }catch(Exception e)
        {
            System.out.println(e);
        }
        t2.start();
       
        
    }
}