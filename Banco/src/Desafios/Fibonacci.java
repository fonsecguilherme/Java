package Desafios;

/**
 * Fibonacci
 */
public class Fibonacci {

    int calculaFibonacci(int num) {
        if (num < 2) {
            return num;
        } else {
           return calculaFibonacci(num-1) + calculaFibonacci(num-2);
        }
    }

    /*
     * void TESTE() { System.out.println("Ok"); }
     */

}