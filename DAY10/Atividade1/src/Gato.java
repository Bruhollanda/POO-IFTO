public class Gato extends Animal {
    String raca;
    public Gato(String nome, String cor, int anoNascimento) {
        super(nome, cor, anoNascimento);
    }

    @Override
    public String obterRaca() {
        if (cor.equals("laranja")) {
            setRaca("garfield");
        } else if (cor.equals("branco")) {
            setRaca("fofinho");
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
