package datastructure1.doubly_list;


public class DoublyList {
    
    private NodeDoublyList Lista;
    private NodeDoublyList cabeca;
    private NodeDoublyList cauda;
    
    public DoublyList(){
        this.Lista = null;
        this.cabeca = null;
        this.cauda = null;
    }

    //Inserindo elementos
    public void inserir (int informacao){
        //Declarando nosso novo nó
        NodeDoublyList no = new NodeDoublyList();
        
        no.setInformacao(informacao);
        if(Lista == null){
            Lista=no;
            cabeca = Lista;
            cauda = Lista;
        }
        else{
            //Aqui se cria um apontador para a lista.
            NodeDoublyList atual =Lista;

            while(atual.getProximo()!=null){
                atual = atual.getProximo();
            }
            atual.setProximo(no);
            no.setAnterior(atual);
            cauda = no;
       }
    }
  
    public void removePorIndice(int indice){
        int indiceAtual = 0;
        NodeDoublyList atual = null;
                
        if (Lista == null){
           System.out.println("Lista vazia");
        }
        else if (indice == 0){
            if (Lista.getProximo() != null) {
                atual = Lista.getProximo();

                cabeca = atual;
                Lista = atual;
                atual.setAnterior(null);
                
                if (atual.getProximo() == null){
                    cauda = atual;
                }
            }
            else {
                cabeca = null;
                cauda = null;
                Lista = null;
              }
        }
        else {
            indiceAtual++;
            atual = Lista.getProximo();
            NodeDoublyList anterior = Lista;
            
            
            while(true){
                if (indiceAtual == indice){
                    if (atual.getProximo() == null){
                        anterior.setProximo(null);
                        cauda = anterior;
                        break;
                    }
                    else {
                        NodeDoublyList proximo = atual.getProximo();
                        anterior.setProximo(proximo);
                        proximo.setAnterior(anterior);
                    }
                } 
                
                atual = atual.getProximo();
                indiceAtual++;
                
                if (atual == null){
                   System.out.println("Posição inexistente");
                   break;
                }
            }
        }
    }
    
    //Imprimindo elementos 
    public void imprimeLista(){
        NodeDoublyList atual = cabeca;
        
        
        while (atual != null) {
                System.out.print(atual.getInformacao()+ " -> ");
                atual= atual.getProximo();
            }
        System.out.println("Acabou");

        atual = cauda;
            
        while (atual != null) {
            System.out.print(atual.getInformacao()+ " -> ");
            atual= atual.getAnterior();
            }
        
        System.out.println("Acabou");
      }

}
