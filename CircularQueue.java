package Queue;

public class CircularQueue {
    static int [] queue=new int[5];
    static int front=-1,rear=-1;
    static int n=queue.length;
    public static void main(String[] args) {

        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);

        dqueue();
        dqueue();

        display();


    }
    private static void display(){
        if(front==rear){
            System.out.println("queue is empty!!");
            return;
        }
        int j = front;
        do {
            System.out.print(queue[j] + " ");
            j = (j + 1) % queue.length;
        } while (j != ( rear + 1) % n);
    }
    private static void dqueue()
    {
        if(front==-1){
            System.out.println("queue is empty!!");
            return;
        }
        System.out.println("deleted element : " + queue[front]);
        if(front==rear)
        {
            front=rear=-1;
        }
        else{
            front=(front+1) % n;
        }

    }
    private static void enqueue(int value)
    {
        if(front == (rear+1) % n)
        {
            System.out.println("queue is full");
            return;
        }
        else if(front==-1)
        {
            front=0;
            rear=0;
        }
        else{
            rear=(rear+1) % n;
        }
        queue[rear]=value;
    }
}
