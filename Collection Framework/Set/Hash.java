
import java.util.HashSet;
public class Hash {
    public static void main(String args[])
     {
        HashSet<Integer>hashset=new HashSet<Integer>();
        hashset.add(89);
        hashset.add(89);
        hashset.add(78);
        hashset.remove(78);
        
        System.out.println(hashset);
        
    }
    
}
