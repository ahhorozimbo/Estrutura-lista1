package main;

public class Ex3 {
    public static void main(String[] args) {
        int vetA[] = new int[5];
        int vetB[] = new int[5];
        for (int i = 0; i < vetA.length; i++) {
            vetA[i] = i + 1;
            System.out.print(vetA[i]+" ");
        }
        System.out.println("");
        for (int i = 0; i < vetB.length; i++) {
            vetB[i] = vetA[i];
            System.out.print(vetB[i]+" ");
        }
    }
}
