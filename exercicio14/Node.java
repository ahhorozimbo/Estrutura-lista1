
package exercicio14;


public class Node {
    String nomeProduto;
    double valor;
    int quantidade;

    public Node(String nomeProduto, double valor, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
        this.quantidade = quantidade;
    }
    
    
    public String toString(){
        return "Nome do Produto: "+nomeProduto+" Valor: "+valor+" Quantidade: "+quantidade;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }
    
    
    
    
}

