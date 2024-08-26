package datastructure1.nodes_list;

public class NodesList {
  private Node Lista;
    
    public NodesList(){
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
    
    //Deletando elementos
    public void deletar (int posicao){
                
        //Condição de parada: o último elemento sempre tem o próximo nó nulo
        if (Lista == null){
            System.out.println("Lista vazia!");
        }
        else {
            int posicaoAtual = 1;
            Node atual = Lista;
            Node anterior = null;

            while (true){
                
                if (posicaoAtual == posicao){
                    if (anterior != null && atual.getProximo() != null){
                        Node proximo = atual.getProximo();
                        anterior.setProximo(proximo);
                        break;
                    }
                    else if (anterior == null){
                        Lista = atual.getProximo();
                        break;
                    }
                    anterior.setProximo(null);
                    break;
                }
                else if (atual.getProximo() == null){
                    System.out.println("Posição inexistente!");
                    break;
                }
                posicaoAtual++;
                anterior = atual;
                atual = atual.getProximo();
            }
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
}
