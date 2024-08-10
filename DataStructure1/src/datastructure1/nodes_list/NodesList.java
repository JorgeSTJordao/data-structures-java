/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure1.nodes_list;

/**
 *
 * @author jorge
 */
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
