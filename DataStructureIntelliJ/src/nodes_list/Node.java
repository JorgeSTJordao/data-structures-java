package nodes_list;

import java.util.Scanner;

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
