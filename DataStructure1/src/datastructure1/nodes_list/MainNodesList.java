/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure1.nodes_list;

/**
 *
 * @author jorge
 */
public class MainNodesList {
    public void execute(){
    NodesList nodesList = new NodesList();

    System.out.println("---- REQUEST ----");
    nodesList.addList();

    System.out.println("---- RESPONSE ----");
    nodesList.printList();
    }
}
