import java.util.ArrayDeque;
import java.util.Deque;

public class dequeue {
    public static void main(String[] args) {
        Deque<Integer>dequeuee=new ArrayDeque<>();

        dequeuee.add(89);
        dequeuee.add(90);
        dequeuee.remove();
        System.out.println(dequeuee);
    }
    
}
