public abstract class Animal {
    protected String nome, cor;
    protected int anoNascimento;

    public Animal(String nome, String cor, int anoNascimento) {
        this.nome = nome;
        this.cor = cor;
        this.anoNascimento = anoNascimento;
    }// constructor

    public int obterIdade(int anoAtual) {
        return anoAtual - anoNascimento;
    }

    public abstract String obterRaca();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
}// class
