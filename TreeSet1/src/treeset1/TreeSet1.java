
package treeset1;

import java.util.*;
public class TreeSet1 {

    
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>(List.of(10,30,20,50,70,50,10,100));
        ts.add(25);
        ts.add(45);
        System.out.println("println with object it will convert it to toString method");
        System.out.println(ts);
        System.out.println("Ceil method is "+ts.ceiling(27));
        System.out.println("floor method is "+ts.floor(27));
        
    }
    
}

