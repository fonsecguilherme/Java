package UFAL;

import java.util.Scanner;

/**
 * TesteEmpresa
 */
public class TesteEmpresa {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.empregados = new Funcionario[10];

        Funcionario f1 = new Funcionario();
        f1.nome = "Guilherme";
        f1.departamento = "Vendas";
        f1.rg = "11111";
        f1.salario = 1000;
        f1.data.ano = 1995;
        f1.data.dia = 06;
        f1.data.mes = 07;
        empresa.adiciona(f1);

        Funcionario f2 = new Funcionario();
        f2.nome = "Nicole";
        f2.departamento = "Gerencia";
        f2.rg = "222222";
        f2.salario = 1500;
        f2.data.ano = 2005;
        f2.data.dia = 06;
        f2.data.mes = 07;

        empresa.adiciona(f2);

        Funcionario f3 = new Funcionario();
        f3.nome = "Ana";
        empresa.adiciona(f3);
        Funcionario f4 = new Funcionario();
        f4.nome = "Genivaldo";
        // empresa.adiciona(f4);

        empresa.mostraEmpregados();
        System.out.println(empresa.contem(f4));

    }
}