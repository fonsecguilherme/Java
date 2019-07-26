package UFAL;

/**
 * No
 */
public class No {
    // dados
    private String nome;
    // ponteiros
    private No esquerdo, direito;

    public No(String nome) { // construtor
        this.nome = nome;
        this.direito = null; //inicializando os ponteiros com null
        this.esquerdo = null;
    }

    /**
     * @return the direito
     */
    public No getDireito() {
        return direito;
    }

    /**
     * @return the esquerdo
     */
    public No getEsquerdo() {
        return esquerdo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param direito the direito to set
     */
    public void setDireito(No direito) {
        this.direito = direito;
    }

    /**
     * @param esquerdo the esquerdo to set
     */
    public void setEsquerdo(No esquerdo) {
        this.esquerdo = esquerdo;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

}