



class Container<T>
{
         T value;

         public T getValue() {
            return value;
        }
        public void setValue(T value) {
            this.value = value;
        }
        
         public void show()
         {
             System.out.println(value.getClass().getName());
         }
       
}

public class GenericsDemo {
    public static void main(String[] args) {
        
        Container<Integer> obj= new Container<Integer>();
        obj.value=9;
        obj.show();


       
        
       

    }
}
