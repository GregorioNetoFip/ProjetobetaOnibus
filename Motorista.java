package Projeto;

class Motorista extends Usuario {
    private int cnpj;

    public Motorista(String nome, int idade, int cpf, String sexo) {
        super(nome, idade, cpf, sexo);
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
}
