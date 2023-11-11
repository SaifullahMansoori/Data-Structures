
package hashset1;
import java.util.*;
public class HashSet1 {
    public static void main(String[] args) {
       HashSet<Integer> hs=new HashSet<>();
       hs.add(10);
       hs.add(20);
       hs.add(30);
       hs.add(10);
        System.out.println("this is simple prinln  method");
        System.out.print(hs);
        System.out.println();
        System.out.println("this is for each loop and Var to display");
        for(var X:hs)
        {
            System.out.print(X+" ");
        }
        System.out.println();
        System.out.println("this is for each to display");
        for(Integer I:hs)
        {
            System.out.print(I+" ");
        }
        System.out.println();
        System.out.println("this is dislpay using while adnd Iterator ");
        Iterator IT=hs.iterator();
        while(IT.hasNext())
        {
            System.out.print(IT.next()+" ");
        }
        System.out.println();
        System.out.println("this is for loop using Iterator");
        for(Iterator i=hs.iterator();i.hasNext();)
        {
            System.out.print(i.next()+" ");
        }
        System.out.println();
        System.out.println("this is for loop and lamda Expressian");
        hs.forEach((c)->System.out.print(c+" "));
        System.out.println();
    }
    
}
