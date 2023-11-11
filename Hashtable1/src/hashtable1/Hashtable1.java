/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashtable1;

import java.util.*;
public class Hashtable1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hashtable ht=new Hashtable();
        ht.put(1,"A");
        ht.put(2,"C");
        ht.put(3,"B");
        ht.put(4,"I");
        ht.put(5,"G");
        String s=(String)ht.get(3);
        System.out.println("Index 3 is "+s);
        System.out.println("printing ");
        System.out.println(ht);
        System.out.println("Enumeration printing only value ");
        Enumeration e=ht.elements();
        while(e.hasMoreElements())
        {
            System.out.print(e.nextElement()+" ");
        }
        System.out.println();
        System.out.println("Enumeration keys  ");
        Enumeration a=ht.keys();
        while(a.hasMoreElements())
        {
            System.out.print(a.nextElement()+" ");
        }
        System.out.println();
        System.out.println("New version of Hashtbale which is Generic class ");
        Hashtable<String,Integer> htt=new Hashtable<String,Integer>();
        htt.put("abdullah",1);
        htt.put("Assadullah",2);
        htt.put("Rahmatullah",3);
        htt.put("Besimaillah",4);
        htt.put("naimatullah",5);
        htt.put("saifullah", 6);
        int ss=htt.get("saifullah");
        System.out.println("printing the value of saifullah mansoori = "+ss);
        System.out.println("printing ");
        System.out.println(htt);
        System.out.println("Enumeration printing only value ");
        Enumeration E=htt.elements();
        while(E.hasMoreElements())
        {
            System.out.print(E.nextElement()+" ");
        }
        System.out.println();
        System.out.println("Enumeration keys  ");
        Enumeration A=htt.keys();
        while(A.hasMoreElements())
        {
            System.out.print(A.nextElement()+" ");
        }
        System.out.println();
        System.out.println("Lamda Expressain and compute method to change value ");
        htt.compute("Rahmatullah",(k,v)->v+12);
        System.out.println("value after changing ");
        Enumeration AB=htt.keys();
         Enumeration AC=htt.elements();
        while(AB.hasMoreElements())
        {
            System.out.print(AB.nextElement()+" "+AC.nextElement()+"  ");
        }
        System.out.println();
        
        
    }
    
}
