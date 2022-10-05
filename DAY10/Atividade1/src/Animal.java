public abstract class Animal {
    protected String nome, cor;
    protected int anoNascimento;

    public Animal(String nome, String cor, int anoNascimento) {
        this.nome = nome;
        this.cor = cor;
        this.anoNascimento = anoNascimento;
    }// constructor

    public abstract int obterIdade();

    public abstract String obterRaca();
}// class
