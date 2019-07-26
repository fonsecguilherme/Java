package Desafios.AcoesPorta;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
       
        Casa casa1 = new Casa();
        Porta portas = new Porta();
        casa1.portas = new Porta[3];

        Porta p1 = new Porta();
        Porta p2 = new Porta();
        Porta p3 = new Porta();

        casa1.adicionaPorta(p1);
        casa1.adicionaPorta(p2);
        casa1.adicionaPorta(p3);

        p1.abre();
        p2.abre();
        //p2.fecha();
        p3.abre();
        System.out.println(p1.estaAberta());
        casa1.tPortasAbertas(portas);

        

        /*  Porta p1 = new Porta();
        Porta p2 = new Porta();
        Porta p3 = new Porta();

        p1.aberta = true;
        p1.fecha();
        p1.estaAberta();

        p1.cor = "vermelha";
        p1.dimensaoX = 1;
        p1.dimensaoY = 2;
        p1.dimensaoZ = 3;
        p1.pinta("azul");
        p1.pinta("branca");

        p2.aberta = true;

        p2.estaAberta(); */

    }
}