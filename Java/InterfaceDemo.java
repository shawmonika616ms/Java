interface Abc
{
     void show();    //by default methods in interface is public and abstract we don't need to mention it.
}

interface Pqr
{
    void xyz();
}


class AbcImpl implements Abc,Pqr
{
        public void show()
        {
            System.out.println("In show");
        }

        public void xyz()
        {
            System.out.println("In xyz");
        }
}
public class InterfaceDemo {
    
    public static void main(String[] args) {

        AbcImpl obj= new AbcImpl();
        obj.show();
        obj.xyz();
        

    }
}
