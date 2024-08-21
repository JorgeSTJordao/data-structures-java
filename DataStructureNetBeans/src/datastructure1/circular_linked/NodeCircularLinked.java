/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure1.circular_linked;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class NodeCircularLinked {
    private Integer info;
    private Integer counter;
    private NodeCircularLinked next;

    public NodeCircularLinked(Integer counter){
        info = null;
        this.counter = counter;
        next = null;
    }
    
     public Boolean isNull(){
        return next == null;
    }

    public NodeCircularLinked addNode(){
        if (counter == 1){
            System.out.print("Type the next value: ");
            Scanner input = new Scanner(System.in);

            int number = input.nextInt();

            info = number;
            counter += 1;
            next = new NodeCircularLinked(1);
        } else {
            next.addNode();
        }
        return this;
    }
    
    public NodeCircularLinked deleteFirst(){
       return next;
    }
   
    public NodeCircularLinked deleteAny(Integer index, Integer actual, NodeCircularLinked nodePreview){
        if (isNull()){
            System.out.println("Index does not exist");
            return this;
        }
        if (index == actual){
           if (next == null){
               nodePreview.next = null;
               return nodePreview;
           }
           nodePreview.next = next;
           return nodePreview;
        }
        actual++;
        return next.deleteAny(index, actual, this);
    }

    public void print(){
        System.out.println("Value: " + info);

        if (next.counter != 1){
            next.print();  
        }
    }
}
