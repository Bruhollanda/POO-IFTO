public class Cachorro extends Animal {
    public Cachorro(String nome, String cor, int anoNascimento) {
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