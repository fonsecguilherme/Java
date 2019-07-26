package UFAL;

/**
 * Funcionario
 */
public class Funcionario {

    String departamento;
    String nome;
    double salario;
    Data data = new Data(); //objeto de classe precisa do new pra funcionar
    String rg;

    void recebeAumento(double valor) {
        this.salario += valor;
    }

    double ganhoAnual() {
        double valorTotal = this.salario * 12;
        return valorTotal;
    }

    void mostra() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        data.formatada();
        /*
         * System.out.println("Data de entrada: " + this.data.dia + "/" + this.data.mes
         * + "/" + this.data.ano);
         */
        System.out.println("RG: " + this.rg);
        System.out.println("Salário: " + this.salario);
        System.out.println("Salário anual: " + this.ganhoAnual());

    }
}
