
package linkedlist1;

import java.util.*;
public class LinkedList1 {
    
    public static void main(String[] args) {
       LinkedList<Integer> li=new LinkedList<>();
       LinkedList<Integer> li2=new LinkedList<>(List.of(50,60,70,80,90));
       li.add(10);
       li.add(0,5);
       li.addAll(1,li2);
       li.set(0,2);
       li.addFirst(2);
       li.addLast(200);
        System.out.print(li+" ");
        System.out.println();
        System.out.println("last index of "+li.lastIndexOf(2));
        System.out.println("get first "+li.getFirst());
        System.out.println("Get last "+li.getLast());
        System.out.println("printing using for loop and get method");
        for(int i=0;i<li.size();i++)
        {
            System.out.print(li.get(i)+" ");
        }
        System.out.println();
        System.out.println("printing with for Each loop ");
        for(Integer N:li)
        {
            System.out.print(N+" ");
        }
        System.out.println();
        System.out.println("var with for each");
        for(var M:li)
        {
            System.out.print(M+" ");
        }
        System.out.println();
        System.out.println("descendingIterator with for loop");
        for(Iterator it=li.descendingIterator();it.hasNext();)
        {
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println("display with Iterator and for loop");
        for(Iterator l=li.iterator();l.hasNext();)
        {
            System.out.print(l.next()+" ");
        }
        System.out.println();
        System.out.println("while loop with simple iterator ");
        Iterator it=li.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println();
    }
    
}
