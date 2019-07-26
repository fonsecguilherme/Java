package Desafios.FazAniversarios;

/**
 * Pessoa
 */
public class Pessoa {

    String nome;
    int idade;

    void fazNiver(int idade) {
        this.idade++;
        System.out.println(this.nome + " está fazendo: " + (this.idade) + " anos");

    }

}