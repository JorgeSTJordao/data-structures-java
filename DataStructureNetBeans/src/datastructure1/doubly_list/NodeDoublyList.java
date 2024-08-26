package datastructure1.doubly_list;

public class NodeDoublyList {
    private Integer informacao;
    private NodeDoublyList anterior;
    private NodeDoublyList proximo;
    
    public NodeDoublyList()
    {
        this.informacao = null;
        this.anterior = null;
        this.proximo = null;
    }

    public Integer getInformacao() {
        return informacao;
    }

    public void setInformacao(Integer informacao) {
        this.informacao = informacao;
    }

    public NodeDoublyList getAnterior() {
        return anterior;
    }

    public void setAnterior(NodeDoublyList anterior) {
        this.anterior = anterior;
    }
    
    public NodeDoublyList getProximo() {
        return proximo;
    }

    public void setProximo(NodeDoublyList proximo) {
        this.proximo = proximo;
    }
     
}
