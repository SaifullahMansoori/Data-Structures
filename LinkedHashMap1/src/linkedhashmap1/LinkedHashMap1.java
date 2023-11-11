
package linkedhashmap1;

import java.util.*;
public class LinkedHashMap1 {

    public static void main(String[] args) {
     LinkedHashMap<Integer,String>lhm=new LinkedHashMap<>(5,.75f,true);
     lhm.put(1,"A");
     lhm.put(2,"B");
     lhm.put(3,"C");
     lhm.put(4,"D");
     lhm.put(5,"F");
     System.out.println("Printing all element with for each ");
     lhm.forEach((k,v)->System.out.println(k+" "+v));
     String s=lhm.get(2);
     s=lhm.get(5);
     s=lhm.get(1);
     System.out.println("after used element print ");
     lhm.forEach((a,b)->System.out.println(a+" "+b));
     System.out.println("new linkedhashmap with size limition ");
     LinkedHashMap<Integer,String>lhmm=new LinkedHashMap<>(5,.75f,true){
         protected boolean removeEldestEntry(Map.Entry e)
         {
             return size()>3;
         }
     };
     lhmm.put(1,"A");
     lhmm.put(2,"B");
     lhmm.put(3,"C");
     lhmm.put(4,"D");
     lhmm.put(5,"F");
     System.out.println("after limition size element print ");
     lhmm.forEach((a,b)->System.out.println(a+" "+b));
    }
    
}
