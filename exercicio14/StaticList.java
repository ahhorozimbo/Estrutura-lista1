
package exercicio14;

public abstract class StaticList {

   public int prim;
   public int ultimo;
   
   abstract public void insere(Node n);
   abstract public void limpaLista();
   abstract public Node busca(String s);
   abstract public void imprimeLista();
   abstract public void remove (String r);
    
}
