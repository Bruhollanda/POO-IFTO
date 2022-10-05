package um;

public class Tecnico extends Pessoa {
    private double gratificacao;

    public Tecnico(String nome, int anoNascimento, int horasProjetos, double valorProjetos) {
        super(nome, anoNascimento, horasProjetos, valorProjetos);
    }

    public double receberBolsa() {
        return super.receberBolsa()+gratificacao;
    }
}// class
