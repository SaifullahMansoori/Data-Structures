
package linkedhashset1;
import java.util.*;
public class LinkedHashSet1 {

   
    public static void main(String[] args) {
       LinkedHashSet<String> ls=new LinkedHashSet<>();
       ls.add("A");
       ls.add("C");
       ls.add("F");
       ls.add("K");
       ls.add("I");
       ls.add("B");
       ls.add("G");
       ls.add("A");
       System.out.println("print all element ");
       ls.forEach((l)->System.out.print(l+" "));
       System.out.println();
        System.out.println("printing usinf Iterator");
        Iterator<String> it=ls.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println();
       
    }
    
}
