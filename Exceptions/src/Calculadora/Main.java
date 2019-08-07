package Calculadora;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        Operacoes op1 = new Operacoes();
        int resultado = 0;

        try {
            resultado = op1.divisao(4, 0);
        } catch (ArithmeticException e) {
            System.out.println("erro: " +e);
        }

        System.out.println(resultado);

    }

}