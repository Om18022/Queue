package Queue;

public class SimpleQueue {
    static int[] que = new int[5];
    static int f = -1, r = -1;
    public static void main(String[] args) {
        enque(10);
        enque(20);
        enque(30);
        enque(40);
        enque(50);
        deque();
        print();

    }

    private static void deque() {
        if(r == -1){
            System.out.println("is empty.");
            return;
        }
        f++;
        System.out.println("deque value " + que[f]);
    }

    private static void print() {
        if(r == -1){
            System.out.println("is empty.");
            return;
        }
        for(int i = f +1; i<=r; i++){
            System.out.println(que[i]);
        }
    }

    private static void enque(int value) {
        if(r == que.length){
            System.out.println("is full.");
            return;
        }
        r++;
        que[r] = value;
    }
}
