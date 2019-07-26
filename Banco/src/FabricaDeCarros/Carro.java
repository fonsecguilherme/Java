package FabricaDeCarros;

/**
 * Carro
 */
public class Carro {

    String cor;
    String modelo;
    double velocidadeMaxima;
    double velocidadeAtual;

    void liga() {
        System.out.println("Carro está ligado.");
    }

    void acelera(double quantidade) {
        double velocidadeNova = this.velocidadeAtual + quantidade;
        this.velocidadeAtual = velocidadeNova;
    }

    int pegaMarcha() {
        if (this.velocidadeAtual <= 0) {
            return -1;
        }
        if (this.velocidadeAtual > 0 && this.velocidadeAtual < 20) {
            return 1;
        }
        if (this.velocidadeAtual >= 20 && this.velocidadeAtual < 40) {
            return 2;
        }
        return 3;
    }

}