package UFAL;

/**
 * Busca a partir do nome
 * 
 * @param nome
 * @return retorna no da arvore Iarvore
 */
public interface Iarvore {

    //todos recursivos

    public void adicionarNo(No no);
    /*
     * Busca a partir do nome*
     * 
     * @param nome
     * 
     * @return retorna no da arvore*Iarvore
     */
    public No buscarNo(String nome);
    /* 
    @param nome
    @return retorna o primeiro no que tenha o nome
     */

    public void removerNo(String nome);

    public void imprimirArvorePreOrder();

    public void imprimirArvoreInOrderAsc();

    public void imprimirArvoreInOrderDesc();
    
    public void imprimirArvorePosOrder();
    
}