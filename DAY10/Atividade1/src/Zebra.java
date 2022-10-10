public class Zebra extends Animal {
    String raca;
    public Zebra(String nome, String cor, int anoNascimento) {
        super(nome, cor, anoNascimento);
    }

    @Override
    public String obterRaca() {
        if (cor.equals("preto")) {
            setRaca("zebra");
        } else if (cor.equals("branco")) {
            setRaca("zebra");
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
