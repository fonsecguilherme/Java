package Desafios;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Fibonacci f1 = new Fibonacci();
        for (int i = 1; i <= 6; i++) {
            int resultado = f1.calculaFibonacci(i);
            System.out.println(resultado);
        }

        /*
         * Fibonacci soma os dois valores dos
         * índices anteriores e não o resultado da
         * subtração entre eles
         */

    }
}