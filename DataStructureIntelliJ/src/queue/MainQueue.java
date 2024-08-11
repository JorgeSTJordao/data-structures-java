package queue;

public class MainQueue {

    public void execute(){
        Queue queue = new Queue(3);

        queue.dequeue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.print();

        System.out.println(" ");
        queue.dequeue();
        queue.print();

        System.out.println(" ");
        queue.enqueue(4);
        queue.print();

        System.out.println(" ");
        queue.dequeue();
        queue.print();

        System.out.println(" ");
        queue.dequeue();
        queue.print();

        System.out.println(" ");
        queue.enqueue(5);
        queue.print();

        System.out.println(" ");
        queue.dequeue();
        queue.print();
    }
}
