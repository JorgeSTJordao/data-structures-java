/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure1.queue;

/**
 *
 * @author jorge
 */
public class Queue {
       public int queueSize;
    public int[] data;
    //When add the first element, both top & list are added.
    //On the contrary the same thing
    public int top = -1;
    public int last = -1;

    public Queue(int queueSize) {
        this.queueSize = queueSize;
        this.data = new int[queueSize];
    }

    public boolean isFull(){ return (last - top) == queueSize - 1; }

    public boolean isEmpty(){ return last == -1; }

    public void enqueue(int value){
        if (isFull())
            System.out.println("Full queue");
        else if (last != -1){
            last++;
            data[last] = value;
        }
        else {
            last++;
            top++;
            data[last] = value;
        }
    }

    //Take the last
    public void dequeue(){
        if (isEmpty()){
            System.out.println("Empty queue");
        }
        else if (last == top){
            top = -1;
            last = -1;
        }
        else {
            top++;
        }
    }

    public void print(){

        if (isEmpty())
            System.out.println("Empty queue");
        else{
            for (int i = top; i <= last; i++) {
                System.out.println(data[i]);
            }
        }
    }
}
