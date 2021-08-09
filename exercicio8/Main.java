package exercicio8;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        ListaConta listaConta = new ListaConta();
        int TAM = 1;

        for (int i = 0; i < TAM; i++) {
            System.out.println("Digite o nome do titular");
            String nome = tec.nextLine();
            System.out.println("Digite o numero da conta");
            int numConta = tec.nextInt();
            System.out.println("Digite o numero da agencia");
            int numAgencia = tec.nextInt();
            System.out.println("Digite o saldo");
            double saldo = tec.nextDouble();

            Contas novo = new Contas(nome, numConta, numAgencia, saldo);

            listaConta.insere(novo);


            int usuario = listaConta.buscar("Antonio");

            listaConta.depositar(200.50, usuario);
            listaConta.imprimir();
            listaConta.sacar(100.50, usuario);
            listaConta.imprimir();
        }



    }
}
