package queue;

public class MainQueue {

    public void execute(){
        Queue queue = new Queue(3);
        queue.dequeue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.print();
        queue.enqueue(1);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.print();
        queue.dequeue();

    }
}
