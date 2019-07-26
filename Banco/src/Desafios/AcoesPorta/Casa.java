package Desafios.AcoesPorta;

/**
 * Casa
 */
public class Casa {

    String cor;
    int totalPortas = 0;
    Porta[] portas;
    int i = 0;

    public void pinta(String s) {
        System.out.println("A nova cor da casa é: " + s);
    }

    public void tPortasAbertas(Porta p) {
        int contador = 0;
        for (int i = 0; i < portas.length; i++) {
            if (this.portas[i].estaAberta() == true) {
                contador++;
            } 
        }
        System.out.println("Quantidade de portas abertas: " +contador);
    }

    public void adicionaPorta(Porta p) {
        this.portas[i] = p;
        this.i++;
    }

    public void totalDePortas() {
        System.out.println("Quantidade de portas é: " + this.i);
        // for (int i = 0; i < portas.length; i++) {
        // totalPortas++;
        // System.out.println("Quantidade de portas é: " + totalPortas);
        // }
    }

}