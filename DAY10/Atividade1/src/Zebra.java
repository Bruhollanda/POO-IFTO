public class Zebra extends Animal {
    public Zebra(String nome, String cor, int anoNascimento) {
        super(nome, cor, anoNascimento);
    }

    @Override
    public int obterIdade() {
        return 0;
    }

    @Override
    public String obterRaca() {
        return null;
    }
}// class
