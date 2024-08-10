package nodes_list;

public class NodesList {
    private Node list;

    public NodesList(){
        list = null;
    }

    public void addList(){
        list = new Node().addNode();
    }

    public void printList(){
        list.print();
    }
}
