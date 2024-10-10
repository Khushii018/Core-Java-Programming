import java.util.LinkedHashSet;

public class linked {
        public static void main(String[] args) {
            LinkedHashSet<Integer>linkedhash=new LinkedHashSet<>();
            linkedhash.add(78);
            linkedhash.add(56);
            linkedhash.remove(56);
            System.out.println(linkedhash);
        }    
}
