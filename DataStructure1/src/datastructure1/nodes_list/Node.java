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

    public Node addNode(){
        System.out.print("Type the next value: ");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number != 0){
            info = number;
            next = new Node().addNode();
        }
        return this;
    }

    public void print(){

        if (next != null) {
            System.out.println("Value: " + this.info);
            next.print();
        }
    }
}
