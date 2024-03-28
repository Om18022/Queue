package Queue;

public class DoubleEndedQueue {
    static int max=5;
    static int[] queue=new int[max];
    static int rear=-1;
    static int front=-1;
    public static void main(String[] args) {
        insert_first(10);
        insert_first(20);
        insert_first(30);
        insert_first(40);
        insert_first(50);
        delete_front();
        delete_rear();
        insert_first(100);
        display();
    }
    private static void insert_last(int item)
    {
        if(front==-1 && rear==max-1)
        {
            System.out.println("Queue is full");
            return;
        }
        if(rear==-1 && front==-1)
        {
            ++rear;
        }
        else if(front>-1 && rear==max-1)
        {
            for(int i=front;i<rear;++i)
            {
                queue[i]=queue[i+1];
            }
            front--;

        }
        else{
            ++rear;
        }
        queue[rear]=item;
    }
    private static void delete_front()
    {
        if(front==rear)
        {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Deleted element:"+queue[++front]);
        if(front==rear)
        {
            front=rear=-1;
        }
    }
    private static void insert_first(int item)
    {
        if(front==-1 && rear==max-1)
        {
            System.out.println("Queue is full");
            return;
        }
        if(rear==-1 && front==-1)
        {
            queue[++rear]=item;
        }else if(rear<max-1 && front==-1)
        {
            for(int i=rear+1;i>0;--i)
            {
                queue[i]=queue[i-1];
            }
            queue[0]=item;
            rear++;
        }else{
            queue[front--]=item;
        }

    }
    private static void delete_rear()
    {
        if(front==rear)
        {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Deleted elment is :"+queue[--rear]);
        if(front==rear)
        {
            front=rear=-1;
        }
    }
    private static void display()
    {
        if(front==rear)
        {
            System.out.println("Queue is Empty");
            return;
        }
        for(int i=front+1;i<=rear;++i)
        {
            System.out.print(queue[i]+" ");
        }
    }
}
