public class Gato extends Animal {
    public Gato(String nome, String cor, int anoNascimento) {
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
