package UFAL;

/**
 * Programa
 */
public class Programa {

    public static void main(String[] args) {
        // Conta[] minhasContas = new Conta[10]; // alocação de espaço para 10 contas

        Cliente cl1 = new Cliente();
        Cliente cl2 = new Cliente();
        Conta c1 = new Conta(cl1, 1245);
        Conta c2 = new Conta(cl2, 1234);

        cl1.setCpf("11602286477");
        System.out.println(cl1.getCpf());
        c1.setTitular(cl1); // associando conta c1 com a classe cliente que é seu
        c2.setTitular(cl2); // associando conta c1 com a classe cliente que é seu titular

        /*
         * c1.saldo = 1000; c1.numero = 123;
         * 
         * c2.saldo = 100; c2.numero= 124; c1.transfere(c2, 50);
         * 
         * System.out.println("Saldo Conta 1: " +c1.saldo);
         * System.out.println("Saldo Conta 2: " +c2.saldo);
         * 
         * 
         * 
         * 
         * * c1.saldo = 1000; c1.titular.nome = "Guilherme"; c1.numero = 1234;
         * System.out.println(c1.saldo);
         * 
         * c2.saldo = 150000; c2.titular.nome = "Nicole"; c2.numero = 123;
         * System.out.println(c2.saldo);
         * 
         * c2.transfere(c1, 500); System.out.println(c1.saldo);
         * System.out.println(c2.saldo);
         * 
         * boolean consegui = c1.saca(1200); if (consegui) {
         * System.out.println("Saque realizado com sucesso!!");
         * 
         * } else { System.out.println("Não foi possível realizar o saque. :("); }
         */

    }
}