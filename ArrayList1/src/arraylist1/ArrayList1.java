/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist1;

import java.util.*;
public class ArrayList1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayList<Integer> arr=new ArrayList<>();
      arr.add(10);
      arr.add(0,5);
      ArrayList<Integer> arr2=new ArrayList<>(List.of(20,30,100,50,2,200));
      arr.addAll(0, arr2);
      arr.add(100);
        System.out.print("values "+arr+"\n");
        System.out.println("contain = "+arr.contains(50));
        System.out.println("Get metod "+arr.get(3));
        System.out.println("Index of method "+arr.indexOf(50));
        System.out.println("Last index of method "+arr.lastIndexOf(100));
        arr.set(8,1000);
        System.out.println("Last index after set method "+arr.lastIndexOf(1000));
        System.out.println("Regular for loop ");
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        System.out.println("for each loop");
        for(Integer X:arr)
        {
            System.out.print(X+" ");
        }
        System.out.println();
        System.out.println("for each with Var variable ");
        for(var A:arr)
        {
            System.out.print(A+" ");
        }
        System.out.println();
        System.out.println("For loop with Iterator ");
        for(Iterator it=arr.iterator();it.hasNext();)
        {
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println("Creattin Iterator with while loop");
        Iterator it=arr.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println("Lambda expressain with for loop ");
        arr.forEach((L)->System.out.print(L+" "));
        System.out.println();
        System.out.println("List Iterator with while loop ");
        ListIterator l=arr.listIterator();
        while(l.hasNext())
            System.out.print(l.next()+" ");
        System.out.println();
        System.out.println("hasPrevious with while loop");
        while(l.hasPrevious())
        {
            System.out.print(l.previous()+" ");
        }
        System.out.println();
    }
    
}
