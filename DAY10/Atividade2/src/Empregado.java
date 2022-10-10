public abstract class Empregado {
    String nome;
    int codigo, qtdHoraTrabalhada;
    double valorHoraTrabalhada;

    public Empregado(String nome, int codigo, int qtdHoraTrabalhada, double valorHoraTrabalhada) {
        this.nome = nome;
        this.codigo = codigo;
        this.qtdHoraTrabalhada = qtdHoraTrabalhada;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    public double calcularSalario() {
        return getQtdHoraTrabalhada() * getValorHoraTrabalhada();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQtdHoraTrabalhada() {
        return qtdHoraTrabalhada;
    }

    public void setQtdHoraTrabalhada(int qtdHoraTrabalhada) {
        this.qtdHoraTrabalhada = qtdHoraTrabalhada;
    }

    public double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }

    public void setValorHoraTrabalhada(double valorHoraTrabalhada) {
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }
}// class
