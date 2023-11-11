
package vector1;
import java.util.*;

public class Vector1 {


    public static void main(String[] args) {
       Vector<Integer> ve=new Vector<>(List.of(1,2,10,12,15));
        System.out.println("size = "+ve.size());
        System.out.println("Capacity = "+ve.capacity());
        ve.add(30);
        System.out.println("size = "+ve.size());
        System.out.println("Capacity = "+ve.capacity());
        Iterator it=ve.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println();
        for(Iterator v=ve.iterator();v.hasNext();)
        {
         System.out.print(v.next()+" ");
        }  
        System.out.println();
        ve.forEach((n)->System.out.print(n+" "));
        System.out.println();
        
    }
    
}
