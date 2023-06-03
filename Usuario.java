package ProjetoOnibus;

class Usuario {
    private String nome;
    private int idade;
    private String sexo;
    private double cpf;
    private String login;
    private String senha;

    public Usuario(String nome, int idade, String sexo, double cpf, String login, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
    }

    public boolean verificarCadastro(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }

    public void fazerCadastro(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
}