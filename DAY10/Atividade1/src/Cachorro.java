public class Cachorro extends Animal {
    String raca;
    public Cachorro(String nome, String cor, int anoNascimento) {
        super(nome, cor, anoNascimento);
    }

    @Override
    public String obterRaca() {
        if (cor.equals("preto")) {
            setRaca("Doberman");
        } else if (cor.equals("branco")) {
            setRaca("Pastor Maremano");
        }
        return getRaca();
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}// class
