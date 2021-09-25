
class Makes
{
    int n1,n2,res=0;
     public void sum()
     {
         res=n1+n2;
     }

}

class AddSub extends Makes
{
    

     public void sub()
     {
       res=n1-n2;
     }
}
class Mul extends AddSub
{
    public void mul()
    {
        res=n1*n2;
    }
}




public class SingleILevelInheritance {

    public static void main(String[] args) {
        Mul obj =  new Mul();
        obj.n1=1;
        obj.n2=2;
         obj.sum();
         System.out.println(obj.res);
         obj.sub();
        System.out.println(obj.res);
        obj.mul();
        System.out.println(obj.res);
        
    }
    
}
