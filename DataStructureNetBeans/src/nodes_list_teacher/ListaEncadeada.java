
import java.util.Scanner;
/**
 *
 * @author andrey
 */



public class ListaEncadeada {
    private Node Lista;
    
    public ListaEncadeada(){
        this.Lista = null;
    }

    //Inserindo elementos
    public void inserir (int informacao){
        //Declarando nosso novo nó
        Node no = new Node();
        
        no.setInformacao(informacao);
        if(Lista == null){
            Lista=no;
        }
        else{
           //Aqui se cria um apontador para a lista.
        Node atual =Lista;
        while(atual.getProximo()!=null){
            atual = atual.getProximo();
        }
        atual.setProximo(no);
        }
    }
    
    
    //Imprimindo elementos 
    public void imprime(){
        Node atual = Lista;
    while (atual != null) {
            System.out.print(atual.getInformacao()+ " -> ");
            atual= atual.getProximo();
        }
        System.out.println("Acabou");
    
    
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaEncadeada lista = new ListaEncadeada();
        
        
        System.out.println("Digite os itens da lista (digite '0' para parar):");
        int item;
        while (true) {
            item = scanner.nextInt();
            if (item == 0) {
                break;
            }
            lista.inserir(item);
        }
        System.out.println("Lista Encadeada:");
        lista.imprime();
       
    }
    
}
