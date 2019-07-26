package UFAL;

/**
 * Item
 */
public class Item {

    private String nome;
    private float nota;
    private Item proximo; // siples encadeada e duplamente encadeada
    // private Item anterior; // duplamente encadeada

    public Item(String nome, float nota) {
        this.nome = nome;
        this.nota = nota;
        this.proximo = null;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the nota
     */
    public float getNota() {
        return nota;
    }

    /**
     * @return the proximo
     */
    public Item getProximo() {
        return proximo;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(float nota) {
        this.nota = nota;
    }

    /**
     * @param proximo the proximo to set
     */
    public void setProximo(Item proximo) {
        this.proximo = proximo;
    }
}