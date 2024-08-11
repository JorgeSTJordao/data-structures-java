package nodes_list;

public class MainNodesList {

    public void execute(){
        NodesList nodesList = new NodesList();

        System.out.println("---- REQUEST ----");
        nodesList.addList();

        System.out.println("---- RESPONSE ----");
        nodesList.printList();
    }
}
