package Queue;
import java.util.Stack;

public class ReverseKElementOfQueue {
    static int [] queue = new int[50];
    static int front=-1,rear=-1;
    static Stack<Integer> stack=new Stack<>();

    public static void main(String[] args) {
        for(int i=1;i<=50;++i)
        {
            enqueue(i);
        }
        int k = 50;
        while(front!=(k-1))
        {
            stack.push(dequeue());
        }
        while (!stack.isEmpty()){
            queue[front-(stack.size()-1)]=stack.pop();
        }
        front=-1;
        System.out.println(Arrays.toString(queue));
    }
    private static void enqueue(int value)
    {
        if(rear== queue.length-1)
        {
            System.out.println("Queue is full");
            return;
        }
        queue[++rear]=value;
    }
    private static int dequeue()
    {
        if(rear==front)
        {
            System.out.println("Queue is Empty");
            return -1;
        }

        return queue[++front];
    }
    private static void display() {
        if (rear == front) {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = front; i <= rear; ++i) {
            System.out.print(queue[i] + " ");
        }
    }
}
