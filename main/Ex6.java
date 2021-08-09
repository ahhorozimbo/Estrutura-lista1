package main;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);


        int m[][] = new int[5][5];

        int somaLinha4= 0;
        int somaColuna2 = 0;
        int diagonalPrimaria = 0;
        int diagonalSec = 0;
        int somaMatriz = 0;
        
        for (int i = 0; i < m.length; i++) {
            
            for (int j = 0; j < m.length; j++) {
                System.out.println("Digite um valor: ");
                m[i][j] = tec.nextInt();
                somaMatriz += m[i][j];
                

                if(i == 4){
                    somaLinha4+= m[i][j];
                }
                if(j == 2){
                    somaColuna2 += m[i][j];
                }
                if (i == j){
                    diagonalPrimaria += m[i][j];
                }

                if(i + j == m.length-1){
                    diagonalSec += m[i][j];
                }

            }
        }


        System.out.println("Soma da linha 4 = "+somaLinha4
        );
        System.out.println("Soma da coluna 2 = "+somaColuna2);
        System.out.println("Soma da diagonal principal = "+diagonalPrimaria);
        System.out.println("Soma da diagonal secundária = "+diagonalSec);
        System.out.println("Soma de todos elementos = "+somaMatriz);

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println("");
        }

    }

}