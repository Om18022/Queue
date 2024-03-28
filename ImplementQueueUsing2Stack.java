package Queue;
import java.util.*;
public class ImplementQueueUsing2Stack {
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    public static void main(String[] args) {
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);
        pop();
        stack1.push(50);
        pop();
        System.out.println(stack1);
    }
    //delete havi
    private static void pop()
    {
        while (stack1.size()!=1)
        {
            stack2.push(stack1.pop());
        }
        stack1.pop();
        while (!stack2.isEmpty())
        {
            stack1.push(stack2.pop());
        }
    }
}
