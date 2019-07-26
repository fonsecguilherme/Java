package UFAL.Observer;

/**
 * Subject
 */
public interface Subject {

    public void registrarObservador(Observer o);
    public void removerObservador(Observer o);
    public void notificarObservador();
}