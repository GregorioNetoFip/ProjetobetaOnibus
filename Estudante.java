package Projeto;

class Estudante extends Usuario {
    private String curso;
    private int matricula;
    private String faculdade;

    public Estudante(String nome, int idade, int cpf, String sexo) {
        super(nome, idade, cpf, sexo);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getFaculdade() {
        return faculdade;
    }

    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }
}
