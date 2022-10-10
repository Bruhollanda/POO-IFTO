public class Professor extends Empregado {

    public Professor(String nome, int codigo, int qtdHoraTrabalhada, double valorHoraTrabalhada) {
        super(nome, codigo, qtdHoraTrabalhada, valorHoraTrabalhada);
    }

    public double addTitulacao(int qnt, double valor) {
        return qnt * valor;
    }
}// class
