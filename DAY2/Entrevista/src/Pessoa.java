public class Pessoa {
    String nome;
    int anoNascimento, altura;
    double peso;

    public Pessoa(String nome, int anoNascimento, int altura, double peso) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
        this.peso = peso;
    }// constructorPessoa

    public Pessoa() { }

    public int calcularIdade() {
        return (2022-anoNascimento);
    }// calcularIdade

    public double calcularIMC() {
        return 0;
    }// calcularIMC

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


}// Pessoa
