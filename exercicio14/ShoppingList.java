
package exercicio14;

import java.util.Scanner;


public class ShoppingList {
    
    static void imprimeMenu(){
        System.out.println(" ## Lista de Compras ## ");
        System.out.println("1 - Inserir\n2 - Buscar\n3 - Imprimir\n4 - Limpar Lista\n5 - Remover\n6 - Calcular Total\n0 - Sair");
    }
   
    
    public static double calculoTotal(ObjList l){
        
        double total = 0;
        
        for (int i = 0; i <= l.ultimo; i++) {
            total += l.lista[i].getValor() * l.lista[i].getQuantidade();
        }
        
        return total;
    }
    
    
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        ObjList l = new ObjList();
        int num = 0;
        int op;
        
        while(true){
            System.out.println("");
            System.out.println("");
            imprimeMenu();
            op = tec.nextInt();
            tec.nextLine();
            
            switch (op){
                case 1:
                    System.out.println("Digite o Nome do Produto: ");
                    String nome = tec.nextLine();
                    System.out.println("Digite o Valor: ");
                    double valor = tec.nextDouble();
                    System.out.println("Digite a quantidade: ");
                    int quant = tec.nextInt();
                    
                    Node n = new Node(nome, valor, quant);
                    l.insere(n);
                    
                    break;
                case 2:
                    System.out.println("Digite o nome: ");
                    String name = tec.nextLine();
                    
                    Node search = l.busca(name);
                    if(search != null){
                        System.out.println("Resultado da busca\n"+search.toString());
                    }else {
                        System.out.println("Objeto nao encontrado");
                    }
                    
                    break;
                case 3:
                    l.imprimeLista();
                    break;
                case 4:
                    l.limpaLista();
                    break;
                case 5:
                    System.out.println("Digite o nome do produto a ser removido: ");
                    String item = tec.nextLine();
                    l.remove(item);
                    break;
                case 6:
                    double t;
                    t = calculoTotal(l);
                    System.out.println("O total é: "+t);
                    break;
                case 0:
                    num = - 3;
                    break;
            }
            
            if (num == -3){
                break;
            }
            
        }
        
    }
    
}
