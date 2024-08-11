/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure1.queue;

/**
 *
 * @author jorge
 */
public class MainQueue {
        public void execute(){
        Queue queue = new Queue(3);
        
        queue.dequeue();
        
        queue.enqueue(1);
        queue.enqueue(3);
        
        queue.print();
        
        queue.enqueue(4);
        
        queue.dequeue();
        
        queue.print();
        
        queue.dequeue();
                
        queue.dequeue();
        
        queue.print();
        
        queue.dequeue();
        
        queue.enqueue(5);
        
        queue.print();

    }
}
