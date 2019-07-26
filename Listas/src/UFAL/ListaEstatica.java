package UFAL;

/**
 * ListaEstatica
 */
public class ListaEstatica implements Ilista{

    Item[] itens;
    int tamanho = 0;

    public void addItem(Item itens) {
        if (!isFull()) {
            this.itens[tamanho] = itens;
            tamanho++;
        } else {
            System.out.println("Não foi possível adicionar: " + itens.getNome() + " - " + itens.getNota());
        }

    }

    public void addItemBegin(Item itens) {
        if (!isFull()) {
            for (int i = tamanho; i >= 1; i--) {
                this.itens[i] = this.itens[i - 1];
            }
            tamanho++;
            this.itens[0] = itens;
        } else {
            System.out.println("Não foi possível adicionar: " + itens.getNome() + " - " + itens.getNota());

        }
    }

    public void showList() {
        for (int i = 0; i < this.tamanho; i++) {
            System.out.println(
                    "Item na posição: " + i + " - Nome: " + itens[i].getNome() + " - Nota: " + itens[i].getNota());
        }
        System.out.println("\n");
    }

    public void searchItem(String nome, float nota) {
        for (int i = 0; i < this.tamanho; i++) {
            if (nome == this.itens[i].getNome() && nota == this.itens[i].getNota()) {
                System.out
                        .println("Item encontrado: " + this.itens[i].getNome() + " - Nota: " + this.itens[i].getNota());
                break;
            } else {
                System.out.println("Item não correspondente");
            }
        }

    }

    public void deleteItem(String nome, float nota) {
        for (int i = 0; i < this.tamanho; i++) {
            if (nome == this.itens[i].getNome() && nota == this.itens[i].getNota()) {
                for (int j = i; j < this.tamanho - 1; j++) {
                    this.itens[j] = this.itens[j + 1];
                }
                break;
            }
        }
    }

    public boolean isFull() {
        return tamanho == itens.length;
    }

    public boolean isEmpty() {
        if (tamanho == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void takeout() {
        tamanho = 0;
    }

}