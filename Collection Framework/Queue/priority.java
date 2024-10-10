import java.util.PriorityQueue;

public class priority {
    public static void main(String[] args) {
        PriorityQueue<Integer>queue=new PriorityQueue<>();
        queue.offer(18);
        queue.add(89);
        queue.add(89);
        queue.offer(90);
        queue.remove();
        System.out.println(queue);
    }
    
}
