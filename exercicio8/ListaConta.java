package exercicio8;

public class ListaConta {
    Contas lista[] = new Contas[5];
    int ultimo = -1;

    public void insere(Contas c){
        if(ultimo < lista.length){
            ultimo++;
            lista[ultimo] = c;
        }else{
            System.out.println("Lista cheia");
        }
    }


    public int buscar(String s){
        for (int i = 0; i <= ultimo; i++) {
            if(lista[i].getNomeTitular().contains(s)){
                return i;
            }
        }
        return -1;
    }

    public void depositar(double v, int i){
        lista[i].saldoConta += v;
    }

    public void sacar(double v, int i){
        if (lista[i].saldoConta >= 0){
            lista[i].saldoConta -= v;
        }
    }

    public void imprimir(){
        for (int i = 0; i <= ultimo; i++) {
            System.out.println("Nome: "+lista[i].getNomeTitular());
            System.out.println("Saldo: "+lista[i].getSaldoConta());
        }
    }
}
