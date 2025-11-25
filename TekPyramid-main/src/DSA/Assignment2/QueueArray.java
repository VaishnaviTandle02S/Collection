package DSA.Assignment2;

public class QueueArray {
    int[] queue;
    int rear;
    int front;

    //constructor to initialize non-static variables
    public QueueArray(int size) {
        queue = new int[size];
        rear = -1;   // queue is empty
        front = 0;
    }

    //Enqueue operation
    public void enqueue(int x) {
        if (isFull()) {
            System.out.println("Cannot Enqueue — Queue Full");
        }
        queue[++rear] = x;
        System.out.println(x + "  enqueued");
    }

    // dequeue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Cannot dequeue — Queue is Empty");
            return -1;
        }
        return queue[front++];  // move front forward
    }

    // peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }
        return queue[front];
    }

    // To check queue is Empty or not
    public boolean isEmpty() {
        return front > rear;
    }

    //To check stack is Full or not
    public boolean isFull() {
        return rear == queue.length - 1;
    }

    // main
    public static void main(String[] args) {
        QueueArray q = new QueueArray(3);

        System.out.println("Is Empty? " + q.isEmpty());
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);// overflow test
        System.out.println("Front: " + q.peek());
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());// underflow test
        System.out.println("Front: " + q.peek());
        System.out.println("Is Empty? " + q.isEmpty());
    }
}