
class A
{
  public A()
  {
      
      System.out.println("In a const");
  }

  public A(int i)
  {
      System.out.println("In A const int");
  }
}
class B extends A
{
    public B()
    {
        System.out.println("In b const");
    }

    public B(int i)
    {
        System.out.println("In b const int");
    }
}




public class ObjectCreation {

    public static void main(String[] args) {
        
        // B obj= new B();
        // A obj= new B();
    }
    
}
