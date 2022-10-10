public class Quadrado extends FormaBidimensional {
    double base, altura;

    public Quadrado(String descricao, double base,double altura) {
        super(descricao);
        this.base = base;
        this.altura = altura;
    }

    public double obterArea() {
        return (getBase()*getAltura());
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}// class
