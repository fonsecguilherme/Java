package UFAL;

/**
 * Arvore
 */
public class Arvore implements Iarvore {

    private No raiz;

    public void adicionarNo(No no) {
        if (raiz == null) {
            this.raiz = no;
            System.out.println("Raiz inserida:" + this.raiz.getNome());
        } else {
            inserir(raiz, no);
        }
    }

    // maior vai pra direita, menor esquerda
    private void inserir(No subRaiz, No no) {

        if (no.getNome().compareToIgnoreCase(subRaiz.getNome()) > 0) {
            if (subRaiz.getDireito() == null) {
                subRaiz.setDireito(no);
                System.out.println("Nó inserido: " + no.getNome());
            } else {
                inserir(subRaiz.getDireito(), no);
            }
        } else {
            if (subRaiz.getEsquerdo() == null) {
                subRaiz.setEsquerdo(no);
                System.out.println("Nó inserido: " + no.getNome());
            } else {
                inserir(subRaiz.getEsquerdo(), no);
            }
        }
    }

    public void imprimirArvore() {
        if (raiz != null) {
            System.out.println(this.raiz.getNome());
            imprimirSubArvore(this.raiz.getEsquerdo());
            imprimirSubArvore(this.raiz.getDireito());
        } else {
            System.out.println("A raiz é nula!!");
        }
    }

    /*
     * para ser em ordem alfabetica, bota imprimir depois de percorrer o nó esquerdo
     * fazer isso tanto no imprimir arvore quanto subarvore ver pos order, in order
     * e o outro
     */
    public void imprimirSubArvore(No subRaiz) { // recursivo
        if (subRaiz != null) {
            System.out.println(subRaiz.getNome());
            imprimirSubArvore(subRaiz.getEsquerdo());
            imprimirSubArvore(subRaiz.getDireito());
        }
    }

    public No buscarNo(String nome) {
        if (this.raiz == null) {
            return null;
        } else {
            return buscaRecur(nome, raiz);
        }
    }

    public No buscaRecur(String nome, No noAtual) {
        if (noAtual != null) {
            if (noAtual.getNome().compareToIgnoreCase(nome) == 0) {
                return noAtual;
            } else if (noAtual.getNome().compareToIgnoreCase(nome) < 0) {
                return buscaRecur(nome, noAtual.getDireito());
            } else {
                return buscaRecur(nome, noAtual.getEsquerdo());
            }
        } else {
            return null;
        }
    }

    /*
     * public No buscarPrimeiroNo(String nome) { return no; }
     * 
     * public No buscarUltimoNo(String nome) { return no; }
     */

    /*
     * não precisa implementar public void removerNos(String nome) { }
     */
    // Talvez chamar o método imprimirArvore?

    public void imprimirArvoreInOrderAsc(No no) {
        if (no != null) {
            imprimirArvoreInOrderAsc(no.getEsquerdo());
            System.out.println(no.getNome() + " ");
            imprimirArvoreInOrderAsc(no.getDireito());
        }
    }

    public void imprimirArvoreInOrderDesc(No no) {
        if (no != null) {
            imprimirArvoreInOrderDesc(no.getDireito());
            System.out.println(no.getNome() + " ");
            imprimirArvoreInOrderDesc(no.getEsquerdo());
        }
    }

    public void imprimirArvorePosOrder(No no) {
        if (no != null) {
            imprimirArvorePosOrder(no.getEsquerdo());
            imprimirArvorePosOrder(no.getDireito());
            System.out.println(no.getNome() + " ");
        }
    }

    public void imprimirArvorePreOrder(No no) {
        if (no != null) {
            System.out.println(no.getNome() + " ");
            imprimirArvorePreOrder(no.getEsquerdo());
            imprimirArvorePreOrder(no.getDireito());
        }
    }

}