package main;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cartao;
        int vetG[] = new int[5];
        int cont = 0;
        int num;
        System.out.println("Digite o gabarito: ");

        for (int i = 0; i < vetG.length; i++) {
            num = input.nextInt();

            if(num == 1 || num == 2 || num == 3){
                vetG[i] = num;
            }
        }

        System.out.println("Digita a quantidade de jogadores");

        int jogadores = input.nextInt();



        for (int i = 0; i < jogadores; i++) {
            System.out.println("Numero do cartao: ");
            cartao = input.nextInt();
            int resp[] = new int[5];

            System.out.println("Digite as apostas ");
            for (int j = 0; j < resp.length; j++) {

                num = input.nextInt();
                if(num == 1 || num == 2 || num == 3){
                    resp[j] = num;
                }

                if(vetG[j] == resp[j]){
                    cont++;
                }
            }

            if (cont >= 3){
                System.out.println("Jogador: "+cartao +" acertou "+cont+" e é o ganhador, Parabéns!");
            }
            else{
                System.out.println("Acertou "+cont+" mas perdeu :(");
            }

            cont = 0;
        }

    }

}