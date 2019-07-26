package UFAL.Observer;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        RevistaInformatica revista = new RevistaInformatica();

        Observer ass1 = new Assinante("Joao");
        Observer ass2 = new Assinante("Ana");
        Observer ass3 = new Assinante("Carla");

        revista.registrarObservador(ass1);
        revista.registrarObservador(ass2);

        revista.lancarEdicao(1);

        revista.registrarObservador(ass3);
        revista.removerObservador(ass1);

        revista.lancarEdicao(2);
    }
}