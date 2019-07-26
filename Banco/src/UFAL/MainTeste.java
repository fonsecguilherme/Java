package UFAL;

/**
 * MainTeste
 */
public class MainTeste {

    public static void main(String[] args) {

        Conta[] minhasContas = new Conta[10];

        Cliente guiCliente = new Cliente();

        guiCliente.nome = "Guilherme";
        guiCliente.setCpf("116022864-77");
        Conta c1 = new Conta(guiCliente, 1234);

        System.out.println(c1.titular.nome);
        System.out.println(c1.titular.getCpf());
        System.out.println(c1.numero);

        /*
         * Funcionario fun1 = new Funcionario(); Data d1 = new Data(); fun1.data = d1;
         * fun1.nome = "Guilherme da Fonseca Ramos"; fun1.rg = "1234567"; fun1.salario =
         * 1000; fun1.data.dia = 27; fun1.data.mes = 10; fun1.data.ano = 1995;
         * fun1.departamento = "Vendas";
         * 
         * fun1.mostra();
         */
        /*
         * Funcionario fun2 = fun1; fun2.nome = "Guilherme da Fonseca Ramos"; fun2.rg =
         * "1234567"; fun2.salario = 1000; fun2.departamento = "Vendas";
         * fun2.dataEntrada = "27/10/1995";
         * 
         * if (fun1 == fun2) { System.out.println("Iguais"); }else
         * System.out.println("Diferentes");
         */

    }
}
