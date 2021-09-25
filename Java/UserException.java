public class UserException {
    public static void main(String[] args) {
        
        int i=5;
        try
        {
                if(i<10)
                {
                    throw new Myexception("Errorrr");
                }
        }

        catch(Exception e)  // we can also write Myexception here also.
        {
            System.out.println(e);
        }
    }
}

class Myexception extends Exception
{
    public Myexception(String msg)
    {
      super(msg);
    }
}
