package UFAL;

/**
 * Arvore
 */
public class Arvore {

    public void adicionar(No no) {

    }

    public void obterNo() {

    }

    public void removerNos() {

    }

    public void imprimirArvore() {
        if (raiz != null) {
            System.out.println(this.raiz.getnome());
            imprimirSubArvore(this.raiz.getEsqueda);
            imprimirSubArvore(this.raiz.getDireita);
        } else {
        }
    }

        /* para ser em ordem alfabetica, bota imprimir depois de percorrer o nó esquerdo
        fazer isso tanto no imprimir arvore quanto subarvore
        ver pos order, in order e o outro 
        */
    public void imprimirSubArvore(No subRaiz) { // recursivo
        if (raiz != null) {
            System.out.println(subRaiz.getNome());
            System.out.println(subRaiz.getEsquerdo());
            System.out.println(subRaiz.getDireito());
        }
    }
}