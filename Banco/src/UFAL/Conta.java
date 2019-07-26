package UFAL;

/**
 * Conta
 */
public class Conta {

    private int numero;
    private static int totalDeContas; // virou atributo da classe e não mais do objeto
    private double saldo;
    private double limite;
    private Cliente titular;

    Conta() {
        Conta.totalDeContas = Conta.totalDeContas + 1;
    }

    Conta(Cliente titular) { // construtor
        System.out.println("Construindo uma conta com dados cliente...");
        this.titular = titular;

    }

    Conta(Cliente titular, int numero) {
        this(titular);
        this.numero = numero;
        System.out.println("Construindo uma conta com dados conta...");
    }

    public void saca(double quantidade) {
        if (this.saldo + this.limite < quantidade) {
            System.out.println("Saque não realizado!!");
        } else {
            this.saldo -= quantidade;
            System.out.println("Saque realizado.");
        }
    }

    void deposita(double quantidade) {
        if (quantidade < 0) {
            System.out.println("Não foi possível depositar.");
        } else {
            this.saldo += quantidade;
            System.out.println("Dinheiro depositado.");
        }
    }

    void transfere(Conta destino, double valor) {
        saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo() {
        return this.saldo + this.limite;
    }

    public double getLimite() {
        return limite;
    }

    /**
     * @return the totalDeContas
     */
    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

}