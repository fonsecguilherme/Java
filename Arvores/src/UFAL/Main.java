package UFAL;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Arvore a = new Arvore();
        No n1 = new No("mamao");
        No n2 = new No("banana");
        No n3 = new No("abacaxi");
        No n4 = new No("jambo");
        No n5 = new No("roma");
        No n6 = new No("melao");
        // nós a serem adicionados, mamao banana abacaxi jambo romã melao
        a.adicionarNo(n1);
        a.adicionarNo(n2);
        a.adicionarNo(n3);
        a.adicionarNo(n4);
        a.adicionarNo(n5);
        a.adicionarNo(n6);

        // a.imprimirArvore();
        System.out.println("\nIn order Ascedente: ");
        a.imprimirArvoreInOrderAsc(n1); //correto
        System.out.println("\nIn order descedente: ");
        a.imprimirArvoreInOrderDesc(n1); //correto
        System.out.println("\nPos Order: ");
        a.imprimirArvorePosOrder(n1); //correto
        System.out.println("\nPre Order: ");
        a.imprimirArvorePreOrder(n1); //correto
        System.out.println("\n");
        
        No var = a.buscarNo("roma");
        if (var == null) {
            System.out.println("O nó não existe!! ");
        }else{
            System.out.println("O nó existe! " +var.getNome());
        } 
    }
}