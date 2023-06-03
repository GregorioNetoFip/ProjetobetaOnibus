package Projeto;

class Usuario {
    private String nome;
    private int idade;
    private int cpf;
    private String sexo;
    private String login;
    private String senha;

    public Usuario(String nome, int idade, int cpf, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public Usuario(String nome2, int idade2, double cpf2, String sexo2) {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getCpf() {
        return cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
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
