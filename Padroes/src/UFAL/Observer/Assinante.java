package UFAL.Observer;

/**
 * Assinante
 */
public class Assinante implements Observer {
    private String nome;

    public Assinante(String nome){
        this.nome = nome;
    }
    
    public void atualizar(int atualizacao){
        System.out.println(nome +": saiu nova edição numero " +atualizacao);
    }
}