/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure1.nodes_list;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Node {
    private Integer info;
    private Node next;

    public Node(){
        info = null;
        next = null;
    }
    
     public Boolean isNull(){
        return next == null;
    }

    public Node addNode(){
        if (next == null){
            System.out.print("Type the next value: ");
            Scanner input = new Scanner(System.in);

            int number = input.nextInt();

            info = number;
            next = new Node();
            return this;
        } else {
            next = next.addNode();
        }
        
        return this;

    }
    
    public Node deleteFirst(){
       return next;
    }
   
    public Node deleteAny(Integer index, Integer actual, Node nodePreview){
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

        if (next != null) {
            System.out.println("Value: " + this.info);
            next.print();
        }
    }
    
   
}
