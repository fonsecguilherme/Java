package UFAL;

/**
 * Ilista
 */
public interface Ilista {

    void addItem(Item itens);
    void addItemBegin(Item itens);
    void showList();
    void searchItem(String nome, float nota);
    void deleteItem(String nome, float nota);
    boolean isFull();
    boolean isEmpty();
    void takeout();
}