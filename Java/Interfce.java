
interface Myinterface
{
    public void method1();
    public void method2();
}

class Demo implements Myinterface {
    public void method1()
    {
        System.out.println("impplementation of method1");
    }

    public void method2()
    {
        System.out.println("Implementation of method2");
    }

    public static void main(String[] args) {
        Myinterface obj= new Demo();
        obj.method1();
        obj.method2();
    }

    
}
