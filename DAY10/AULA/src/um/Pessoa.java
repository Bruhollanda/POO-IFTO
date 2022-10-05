package um;

public class Pessoa {
    protected String nome;
    protected int anoNascimento;
    protected int horasProjetos;
    protected double valorProjetos;

    public Pessoa(String nome, int anoNascimento, int horasProjetos, double valorProjetos) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.horasProjetos = horasProjetos;
        this.valorProjetos = valorProjetos;
    }

    public int obterIdade(int anoAtual) {
        return anoAtual-anoNascimento;
    }

    public double receberBolsa() {
        return valorProjetos*horasProjetos;
    }


}// class
