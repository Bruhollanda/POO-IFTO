public class Servidor extends Empregado {
    private double gratificacao;

    public Servidor(String nome, int codigo, int qtdHoraTrabalhada, double valorHoraTrabalhada, double gratificacao) {
        super(nome, codigo, qtdHoraTrabalhada, valorHoraTrabalhada);
        this.gratificacao = gratificacao;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }
}// class
