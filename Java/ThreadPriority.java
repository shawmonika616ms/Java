public class ThreadPriority {

    public static void main(String[] args) throws Exception
    {


        Thread t1= new Thread(() ->
        
     
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
    );
        Thread t2= new Thread(() ->
       
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
       );

    //    t1.setName("Hi Thread");
    //    t2.setName("hello Thread");

    //    System.out.println(t1.getName());
    //    System.out.println(t2.getName());



     t1.setPriority(Thread.MIN_PRIORITY);
     t2.setPriority(10);
     System.out.println(t1.getPriority());
     System.out.println(t2.getPriority());
        
        t1.start();
        try
        {Thread.sleep(10); }catch(Exception e)
        {
            System.out.println(e);
        }
        t2.start();

   

        t1.join();
        t2.join();

     
       
        
    }
}

