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
public class NodesList {
    private Node list;

    public NodesList(){
        list = null;
    }

    public void allOperations(){
        while (true){
            System.out.print("1 - Insert\n");
            System.out.print("2 - Delete\n");
            System.out.print("0 - Stop\n");

            Scanner input = new Scanner(System.in);

            int number = input.nextInt();

            switch (number) {
                case 1 -> {
                    addList();
                    printList();
                    break;
                }
                case 2 -> {
                    deleteList();
                    printList();
                    break;
                }
                default -> 
                    printList();
            } 
            if (number == 0)
                break;
        }
    }
    
    public void addList(){
        if (list != null)
            list = list.addNode();
        else 
            list = new Node().addNode();
    }
    
    public void deleteList(){
        System.out.print("Type the node number u'd like remove: ");
        Scanner input = new Scanner(System.in);

        int indexChosen = input.nextInt();
        
        if (indexChosen == 1)
            list = list.deleteFirst();
        else
            list.deleteAny(indexChosen, 1, list);
    }

    public void printList(){
        list.print();
    }
}
