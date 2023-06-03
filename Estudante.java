package ProjetoOnibus;

class Estudante extends Usuario {
    private double matricula;
    private String curso;

    public Estudante(String nome, int idade, String sexo, double cpf, String login, String senha, double matricula, String curso) {
        super(nome, idade, sexo, cpf, login, senha);
        this.matricula = matricula;
        this.curso = curso;
    }
