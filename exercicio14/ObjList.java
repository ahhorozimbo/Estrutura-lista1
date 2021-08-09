
package exercicio14;

public class ObjList extends StaticList {
    
    final int N = 5;
    Node lista[] = new Node[N];
    
    int ultimo = -1;
    int prim = -1;

    @Override
    public void insere(Node n) {
        if (ultimo < N){
            ultimo++;
            if(prim < 0){
                prim++;
            }
            lista[ultimo] = n;
            System.out.println("Inserindo");
        }else{
            System.out.println("Lista cheia!");
        }
    }

    @Override
    public void limpaLista() {
        for (int i = 0; i < N; i++) {
            lista[i] = null;
        }
        ultimo= -1;
        prim = -1;
    }

    @Override
    public Node busca(String s) {
        for (int i = 0; i <= ultimo; i++) {
            if(lista[i].getNomeProduto().contains(s)){
                return lista[i];
            }
            
        }
        return null;
    }

    @Override
    public void imprimeLista() {
        if(ultimo >= 0){
            for (int i = 0; i <= ultimo; i++) {
                System.out.println(lista[i].toString());
            }
        }else{
            System.out.println("Lista vazia!");
        }
    }

    @Override
    public void remove(String r) {
        Node remover = busca(r);
        int n = -1;
        for (int i = 0; i <= ultimo; i++) {
            if(lista[i] == remover){
                n = i;
            }
        }
        System.out.println(n);
        if(n != -1){
            for (int i = n; i < ultimo; i++) {
                lista[i] = lista[i+1];
            }
            System.out.println("Removendo o  item "+remover.toString());
            lista[ultimo] = null;
            ultimo--;
        }
        
    }
    
}
