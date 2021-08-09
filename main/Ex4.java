package main;

public class Ex4 {
    public static void main(String[] args) {
        int vetor[]=new int[20];
        int aux=0;
        int k=0;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1;
            System.out.print(vetor[i]+" ");
        }
        System.out.println("");
        k=vetor.length-1;
        for (int i = 0; i < vetor.length; i++) {
            aux = vetor[i];
            vetor[i] = vetor[k];
            vetor[k] = aux;
            k--;
            System.out.print(vetor[i]+" ");
        }

    }
}
