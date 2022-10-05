public class Pessoa {
    String nome;
    int anoNasc;

    public Pessoa(String nome, int anoNasc) {
        this.nome = nome;
        this.anoNasc = anoNasc;
    }// constructor

    public Pessoa() { }// constructor

    public int calcularIdade() {
        return 2022 - anoNasc;
    }// calcularIdade

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", anoNasc=" + anoNasc +
                '}';
    }
}// class
