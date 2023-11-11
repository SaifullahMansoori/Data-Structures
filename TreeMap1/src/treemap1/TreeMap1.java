
package treemap1;
import java.util.*;
import java.util.Map.*;
public class TreeMap1 {
 
    public static void main(String[] args) {
        TreeMap<Integer,String> tm=new TreeMap<>(Map.of(1," abdullah",2," assadullah",3," Rahmatullah",4," Besmillah",5," Naimatulah",6," saifullah"));
        tm.put(7," mostafa");
        tm.put(8," mortaza");
        tm.put(9," maisam");
        System.out.println("Object "+tm);
        System.out.println("Ceiling Entry method "+tm.ceilingEntry(6));
        System.out.println("Get value method "+tm.get(6));
        Entry<Integer,String> e=tm.firstEntry();
        System.out.println(e.getKey()+" "+e.getValue());
        System.out.println("reverse of element using descendingMap method ");
        System.out.println(tm.descendingMap());
        System.out.println("printing all the values using descendingKeySet method ");
        System.out.println(tm.descendingKeySet());
    }
    
}
