package UFAL.Observer;
//import java.util.ArrayList;
import java.util.*;/**
import java.util.ArrayList;
 * RevistaInformatica
 */
public class RevistaInformatica implements Subject{

    int edicaoAtual;

    private ArrayList<Observer> assinantes; ///<tipo da variável> assinantes é a inst6ancia

    public RevistaInformatica() {
        assinantes = new ArrayList<Observer>();
    }

    public void registrarObservador(Observer o) {
        assinantes.add(o);
    }

    public void removerObservador(Observer o) {
        assinantes.remove(o);
    }

    public void notificarObservadores() {
        for (Observer o : assinantes)
            o.atualizar(this.edicaoAtual);
    }

    public void lancarEdicao(int numEdicao) {
        this.edicaoAtual = numEdicao;
        notificarObservadores();
    }
}