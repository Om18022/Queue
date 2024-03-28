package Queue;
import java.util.*;

public class ImplementStackUsing2Queue {
    static Queue<Integer> queue1 = new LinkedList<>();
    static Queue<Integer> queue2 = new LinkedList<>();
    public static void main(String[] args) {

        queue1.add(10);
        queue1.add(20);
        queue1.add(30);
        queue1.add(40);
        poll();
        queue1.add(50);
        queue1.add(60);
        queue1.add(70);
        poll();
        poll();

        System.out.println(queue1);

    }
    private static void poll()
    {
        while (queue1.size()!=1)
        {
            queue2.add(queue1.poll());
        }
        queue1.poll();
        while (!queue2.isEmpty())
        {
            queue1.add(queue2.poll());
        }
    }
}
