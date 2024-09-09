/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructure1.recursion;

/**
 *
 * @author jorge
 */
public class Recursion {
    
    public int recursionTimesN(int num, int comprimento, int qtde, int index){
        
        qtde += index;
        
        if (comprimento == 0){
            return 0;
        }
        
        String numString = String.valueOf(num); 
        int value = numString.charAt(comprimento - 1);
                
        
        if (value == comprimento){
            return qtde + recursionTimesN(num, comprimento - 1, qtde, 1);
        }
        
        return qtde + recursionTimesN(num, comprimento - 1, qtde, 0);
    }
}
