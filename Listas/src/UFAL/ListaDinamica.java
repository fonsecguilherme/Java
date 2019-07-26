package UFAL;

/**
 * ListaDinamica
 */
public class ListaDinamica implements Ilista {

    private Item primeiro, proximo, ultimo;
    private int tamanho = 0;

    public ListaDinamica() {
        primeiro = ultimo = null;

    }

    public void addItem(Item itens) {
        if (isEmpty()) {
            primeiro = ultimo = itens;
        }else{
            
        }
    }

    public void addItemBegin(Item itens) {

    }

    public void showList() {

    }

    public void searchItem(String nome, float nota) {

    }

    public void deleteItem(String nome, float nota) {

    }

    public boolean isFull() {
        return true;
    }

    public boolean isEmpty() {
        if (tamanho == 0) {
            return true;
        }else{
            return false;
        }
    }

    public void takeout() {
    }

    /**
     * @return the proximo
     */
    public Item getProximo() {
        return proximo;
    }

    /**
     * @param proximo the proximo to set
     */
    public void setProximo(Item proximo) {
        this.proximo = proximo;
    }

    /**
     * @return the ultimo
     */
    public Item getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(Item ultimo) {
        this.ultimo = ultimo;
    }

}