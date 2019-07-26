package UFAL;

/**
 * Empresa
 */
public class Empresa {

    String nome, cnpj, endereco;
    Funcionario[] empregados;
    int i = 0;

    void adiciona(Funcionario f) {
        this.empregados[i] = f;
        this.i++;

    }

    void mostraEmpregados() {
        System.out.println("Funcionarios cadastrados: ");
        /*
         * for (int i = 0; i < empregados.length; i++) {
         * System.out.println("Funcionario na posição: " + (i + 1)); if (empregados[i]
         * != null) { empregados[i].mostra(); }
         */

        for (Funcionario fun : empregados) {
            if (fun != null) {
                fun.mostra();
            }

        }
    }

    boolean contem(Funcionario f) {
        for (int i = 0; i < empregados.length; i++) {
            if (f == empregados[i]) {
                return true;
            }
        }
        return false;
    }

    
}
