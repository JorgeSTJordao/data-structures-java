package datastructure1.circular_linked;

import java.util.Scanner;


public class CircularLinked {
    
    private NodeCircularLinked list;

    public CircularLinked(){
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
            list = new NodeCircularLinked(1).addNode();
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
        if(list == null)
            System.out.print("Empty list");
        else
            list.print();
    }
}
