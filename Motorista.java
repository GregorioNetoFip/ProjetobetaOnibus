package ProjetoOnibus;

class Motorista extends Usuario {
    private double cpnj;

    public Motorista(String nome, int idade, String sexo, double cpf, String login, String senha, double cpnj) {
        super(nome, idade, sexo, cpf, login, senha);
        this.cpnj = cpnj;
    }
}
	