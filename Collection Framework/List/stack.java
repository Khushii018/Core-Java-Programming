import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        stack.push(23);
        stack.push(78);
        stack.pop();
        System.out.println(stack);
        System.out.println("peek element is : "+stack.peek());
        

    }
    
}
