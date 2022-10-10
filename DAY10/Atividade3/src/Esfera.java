public class Esfera extends FormaTridimensional {
    double raio;
    public Esfera(String descricao, double raio) {
        super(descricao);
        this.raio = raio;
    }

    @Override
    public double obterArea() {
        return 4 * 3.14 * Math.pow(getRaio(), 2);
    }

    @Override
    public double obterVolume() {
        return (4/3) * 3.14 * Math.pow(getRaio(), 3);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}// class
