
package hashmap1;
import java.util.*;
import java.util.Map.*;
public class HashMap1 {

  
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>(Map.of(1," abdullah",2," assadullah",3," Rahmatullah",4," Besmillah",5," Naimatulah",6," saifullah"));
        hm.put(9," maisam");
        hm.put(7," mostafa");
        hm.put(8," mortaza");
        System.out.println(hm);
    }
    
}
