package Queue;
import java.util.LinkedList;
import java.util.Deque;

public class ImplementQueue_DequeueCollectionFrameWork {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        deque.add(10);
        deque.addFirst(20);
        deque.addFirst(30);
        System.out.println(deque);

        deque.addLast(40);
        deque.addLast(50);
        System.out.println(deque);

        deque.pollFirst();
        deque.pollLast();


        System.out.println(deque);

    }
}
