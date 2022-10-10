public abstract class Forma {
    private String descricao;

    public Forma(String descricao) {
        this.descricao = descricao;
    }

    public abstract double obterArea();

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}// class
