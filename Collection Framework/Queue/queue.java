import java.util.LinkedList;
import java.util.Queue;
public class queue {
    public static void main(String[] args) {
        Queue<Integer>queue=new LinkedList<>();
        queue.add(89);
        queue.offer(78);
        queue.poll();
        System.out.println(queue);

    }
    
}
