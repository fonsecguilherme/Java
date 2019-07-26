package Arrays;

public class Main {

    public static void main(String[] args) {
        int[] idades = new int[10]; // declaração vetor array //int[] é um tipo e um array é sempre um objeto e a
        // variável idade é uma referência
        /*
         * int n = 0; int numerosDoBilhete[] = new int[n];
         */ // n é o numero de quantos bilhetes terão

        for (int i = 0; i < 10; i++) {
            idades[i] = i * 10;
        }

        for (int x : idades) {
            System.out.println("Elemento " + (x/10) + " é: " + x);

        }

        /*
         * for (int i = 0; i < idades.length; i++) {
         * 
         * System.out.println("Elemento " + (i + 1) + " é: " + idades[i]);
         * 
         * }
         */

    }
}