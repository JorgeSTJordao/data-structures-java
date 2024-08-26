package datastructure1.doubly_list;

public class DoublyList {
    NodeDoublyList head;
    NodeDoublyList tail;
    NodeDoublyList headAux;

    public DoublyList(){
        head = null;
    }
    
    public void addList(){
        if (head != null){
            headAux = head;
        
            while (true){
                if (headAux.next == null){
                    tail = head.addNode();
                    break;
                }
                headAux = headAux.next;
            }
        }
        else 
            tail = head = new NodeDoublyList(null).addNode();    
    }
    
    public void printList(){
        if (head == null)
            System.out.println("Empty list"); 
        else 
            head.print();
    }
    
    public void deleteList(){
        head = head.deleteNode(2, 1, head);
    }
}
