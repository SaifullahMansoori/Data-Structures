
package stringtokenizer1;

import java.util.*;
public class StringToKenizer1 {


    public static void main(String[] args) {
       String DATA="Name=Saifullah;Address=kabul;age=20";
       StringTokenizer stk=new StringTokenizer(DATA,"=;");
       String s;
        System.out.println("printing all token using while loop ");
       while(stk.hasMoreTokens())
       {
           s=stk.nextToken();
           System.out.print(s+" ");   
       }
        System.out.println();
           String Data="Name=Saifullah Address=kabul age=20";
       StringTokenizer stkr=new StringTokenizer(Data,"= ");
       String ss;
        System.out.println("printing all token using while loop and space delimeter ");
       while(stkr.hasMoreTokens())
       {
           ss=stkr.nextToken();
           System.out.print(ss+" ");   
       }
        System.out.println();
        System.out.println("inserting string data in integer arraylist ");
        String number="12-13-14-15-16-17-18";
        StringTokenizer stkk=new StringTokenizer(number,"-");
        ArrayList<Integer> li=new ArrayList<>();
        String a;
        while(stkk.hasMoreElements())
        {
            a=stkk.nextToken();
            li.add(Integer.valueOf(a));
        }
        System.out.println("printing value of array list ");
        System.out.println(li);
    }
    
}
