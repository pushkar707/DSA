public class Main {
    public static void main(String args[]){
        SortedQueue q = new SortedQueue(5);
        q.enqueue(0);
        q.enqueue(1);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(2);

        // q.dequeue();
        // q.dequeue();
        // q.dequeue();
        // q.dequeue();
        // q.dequeue();

        // q.enqueue(5);
        // q.enqueue(1);
        // q.enqueue(3);
        // q.enqueue(4);
        // q.enqueue(2);
        // q.enqueue(2);

        System.err.println(q);
    }
}
