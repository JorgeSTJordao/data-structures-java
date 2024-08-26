package datastructure1.doubly_list;

import java.util.Scanner;

public class NodeDoublyList {
    private Integer info;   
    NodeDoublyList preview;
    NodeDoublyList next;

    public NodeDoublyList(NodeDoublyList preview){
        info = null;
        this.preview = preview;
        next = null;
    }
    
    
     public Boolean isNull(){
        return next == null;
    }

    public NodeDoublyList addNode(){
        System.out.print("Type the next value: ");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        info = number;
        next = new NodeDoublyList(this);    
        
        return this ;
    }
   
   
    public NodeDoublyList deleteNode(Integer index, Integer actual, NodeDoublyList nodePreview){
        if (isNull()){
            System.out.println("Index does not exist");
            return this;
        }
        else if (index == actual){
           
           nodePreview.next = next;
           next.preview = nodePreview;
           return nodePreview;
        }
        
        actual++;
        return next.deleteNode(index, actual, this);
    }

    public void print(){
        
        if (next != null) {
            System.out.println("Value: " + this.info);
            next.print();
        }    
    }
     
}
