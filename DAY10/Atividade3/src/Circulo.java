public class Circulo extends FormaBidimensional {
    double raio;
    public Circulo(String descricao, double raio) {
        super(descricao);
        this.raio = (raio*raio);
    }

    public double obterArea() {
        return 3.14*getRaio();
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}// class
