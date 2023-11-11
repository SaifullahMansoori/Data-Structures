
package betset1;

import java.util.*;
public class BitSet1 {

   
    public static void main(String[] args) {
        BitSet bs=new BitSet();
        bs.set(0);
        bs.set(2);
        bs.set(4);
        bs.set(6);
        bs.set(8);
        System.out.println("printing bits which were set or true ");
        System.out.println(bs);
        System.out.println("false bits or num set bits ");
        System.out.println(bs.get(1));
        BitSet bst=new BitSet();
        bst.set(0);
        bst.set(1);
        bst.set(2);
        bst.set(3);
        bst.set(4);
        bst.set(5);
       // bst.set(6);
        bst.set(7);
       // bst.set(8);
        System.out.println("performing and (&) operation ");
        bs.and(bst);
        System.out.println(bs);
        System.out.println();
        System.out.println("printing nun set indexes using flips ");
        bs.flip(0,bs.length());
        System.out.print(bs+" ");
        System.out.println();
    }
    
}
