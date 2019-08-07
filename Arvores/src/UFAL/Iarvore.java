package UFAL;

/**
 * Busca a partir do nome
 * 
 * @param nome
 * @return retorna no da arvore Iarvore
 */
public interface Iarvore {

    // todos recursivos
    //public void removerNo(String nome);
    public void imprimirArvorePreOrder(No no);
    public void imprimirArvoreInOrderAsc(No no);
    public void imprimirArvoreInOrderDesc(No no);
    public void imprimirArvorePosOrder(No no);

    /**
     * 
     * @param nome
     * @return Retorna o ultimo no (mais a direita) que tenha o nome informado, caso
     *         exista e null, caso contrario
     */
    public No buscarUltimoNo(String nome);

    /**
     * Busca a partir do nome*
     * 
     * @param nome
     * 
     * @return retorna no da arvore*Iarvore usar o comparecompareToIgnoreCase
     * 
     */
    public void adicionarNo(No no);

    /**
     * @param nome
     * 
     * @return Retorna o primeiro no (mais a esquerda) que tenha o nome 
     * informado,caso exista e null, caso contrario
     */
    public No buscarPrimeiroNo(String nome);
}