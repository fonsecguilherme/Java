package UFAL;

/*
 todo objeto em java é um ponteiro
 */
public class Programa {

    public static void main(String[] args) {
        ListaEstatica lista1 = new ListaEstatica();
        lista1.itens = new Item[5];
        Item i1 = new Item("Guilherme", 8);
        Item i2 = new Item("Nicole", 10);
        Item i3 = new Item("Ana", 7.5f);
        Item i4 = new Item("Genivaldo", 10);
        Item i5 = new Item("Bibi", 7.3f);
        //Item i6 = new Item("Tom", 7.7f);

        //adicionando objetos
        lista1.addItem(i1);
        lista1.addItem(i2);
        lista1.addItem(i3);
        lista1.addItem(i4);
        lista1.addItem(i5);

        //chamada de funções
        lista1.showList();
        //lista1.searchItem("Nicole", 10);
        // System.out.println(lista1.isEmpty());
        lista1.deleteItem("Genivaldo", 10);
        lista1.showList();
        // lista1.addItemBegin(i3);
        // lista1.showList();

    }
}