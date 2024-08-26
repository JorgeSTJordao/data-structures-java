package datastructure1.doubly_list;

import java.util.Scanner;

public class MainDoublyList {
    
    public void execute(){
        
     Scanner scanner = new Scanner(System.in);
     DoublyList lista = new DoublyList();
        
    System.out.println("Lista Encadeada:");

        
    System.out.println("Digite os itens da lista (digite '0' para parar):");
    int item;
    while (true) {
        System.out.println("1 - Inserir:");
        System.out.println("2 - Deletar:");
        System.out.println("0 - Imprimir:");

        item = scanner.nextInt();
        
        switch (item){
            case 1 -> {
               System.out.println("Digite o valor:");
               int valor = scanner.nextInt();

               lista.inserir(valor);
               break;
            }
            case 2 -> {
               System.out.println("Digite o índice:");
               int indice = scanner.nextInt();
               
                lista.removePorIndice(indice);
                break;
            }
            default -> {
                System.out.println("Fim da operação");
            }
        }
        
        lista.imprimeLista();

        if (item == 0) {
            break;
        }
        
    }
   }
}
