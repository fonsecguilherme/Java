package Desafios.AcoesPorta;

/**
 * Porta
 */
public class Porta {

    boolean aberta;
    String cor;
    float dimensaoX, dimensaoY, dimensaoZ;
    Casa casa;

    public boolean abre() {
        if (this.aberta == false) {
            return this.aberta = true;
        } else {
            return false;
        }
    }

    public boolean fecha() {
        if (this.aberta == true) {
            return this.aberta = false;
        } else {
            return false;
        }
    }

    public void pinta(String a) {
        System.out.println("Nova cor da porta é: " + a);
    }

    public boolean estaAberta() {
        if (this.aberta == true) {
            return true;
        } else {
            return false;
        }
    }

}