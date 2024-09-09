/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure1.binary_tree;

/**
 *
 * @author jorge
 */
public class Node {
    private int info;
    private Node esquerda;
    private Node direita;
    
    public Node(int info){
        this.info = info;
        this.esquerda = null;
        this.direita = null;
    }
    
    public int getInfo(){
        return info;
    }
    
    public void setInfo(int info){
        this.info = info;
    }
    
    public Node getEsquerda(){
        return esquerda;
    }
    
    public void setNode(Node node){
        this.esquerda = node;
    }
    
    public Node getDireita(){
        return direita;
    }
    
    public void setDireita(Node node){
        this.direita = node;
    }  
    
}
