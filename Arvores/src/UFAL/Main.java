package UFAL;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Arvore a = new Arvore();
        
        //nõs a serem adicionados, mamao banana abacaxi jambo romã melao
        a.adicionarNo(New no("mamão"));
        
        a.imprimirArvore();

    }
}