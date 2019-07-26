package UFAL;

/**
 * Cliente
 */
public class Cliente {

    String nome;
    private String sobrenrome;
    private String cpf;
    private int idade;

    public void mudaCPF(String cpf) {
        if (60 >= this.idade) {
            validaCPF(cpf);
        }
        this.cpf = cpf;
    }

    private void validaCPF(String cpf) {
        if (cpf.length() < 11 && cpf.length() > 11) {
            System.out.println("Cpf Inválido");
        } else {
            System.out.println("Cpf válido. ");
        }
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

}