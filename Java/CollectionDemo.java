import java.util.ArrayList;
import java.util.Collection;


public class CollectionDemo {
    public static void main(String[] args) throws Exception
     {
        
        // int values[]= new int[4];
        // Object values1[]= new Object[4];
        // values1[0]="Navin";


        Collection<Integer> values= new ArrayList<Integer>();
        values.add(3);
        // values.add("Tom");
        // values.add(4.5);
        values.add(88);
        values.remove(88);

        // Iterator i= values.iterator();   iterator is very old technique.

        // while(i.hasNext())
        // {
        //     System.out.println(i.next());
        // }

        for(int i : values)
        {
            System.out.println(i);
        }




        
    
        

    }
}
