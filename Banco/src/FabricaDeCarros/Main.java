package FabricaDeCarros;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        Carro c1 = new Carro();
        c1.liga();
        c1.velocidadeAtual = 37;
        c1.acelera(13);

        System.out.println(c1.velocidadeAtual);
        System.out.println(c1.pegaMarcha());

    }

}