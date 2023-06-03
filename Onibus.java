package Projeto;

class Onibus {
    private int quantidadeEstudante;
    private int quantidadeMotorista;
    private boolean ida;
    private boolean volta;

    public Onibus(int quantidadeEstudante, int quantidadeMotorista, boolean ida, boolean volta) {
        this.quantidadeEstudante = quantidadeEstudante;
        this.quantidadeMotorista = quantidadeMotorista;
        this.ida = ida;
        this.volta = volta;
    }

    public int getQuantidadeEstudante() {
        return quantidadeEstudante;
    }

    public int getQuantidadeMotorista() {
        return quantidadeMotorista;
    }

    public boolean isIda() {
        return ida;
    }

    public boolean isVolta() {
        return volta;
    }
}