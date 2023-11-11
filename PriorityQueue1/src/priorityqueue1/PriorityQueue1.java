
package priorityqueue1;
import java.util.*;

public class PriorityQueue1 {


    public static void main(String[] args) {
       PriorityQueue<Integer> p=new PriorityQueue<>();
       p.add(20);
       p.add(10);
       p.add(30);
       p.add(5);
       p.add(15);
       p.add(3);
        System.out.println("Head element with peek method "+p.peek());
        System.out.println("using for each loop to print ");
        for(Integer A:p)
        {
            System.out.print(A+" ");
        }
        System.out.println();
        System.out.println("printing use Iterator and for loop ");
        for(Iterator it=p.iterator();it.hasNext();)
        {
            System.out.print(it.next()+" ");
        }
        
        System.out.println("\n using while loop and iterator to print ");
        Iterator it=p.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println("\nfor each with lamda Expressain");
        p.forEach((n)->System.out.print(n+" "));
        System.out.println();
    }
    
}
