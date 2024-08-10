/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure1.pile;

/**
 *
 * @author jorge
 */
public class MainPile {
       
    int[] data = {1, 2, 3};

    public void execute(){
        Pile pile = new Pile();

        //is it full
        System.out.println(pile.isFull());

        //Enqueue
        pile.pileUp(data[0]);
        pile.pileUp(data[1]);
        pile.pileUp(data[2]);

        System.out.println(pile.isFull());

        //print each item
        pile.print();

        //Dequeue
        pile.unstack();
        pile.unstack();

        System.out.println(pile.isEmpty());

        pile.unstack();
        pile.unstack();

        System.out.println(pile.isEmpty());
    }
}
