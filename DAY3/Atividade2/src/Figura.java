public class Figura {
    double base, lenght, hight;

    public Figura(double base, double lenght, double hight) {
        this.base = base;
        this.lenght = lenght;
        this.hight = hight;
    }

    public Figura() { }

    public double getRectangleArea() {
        return base * hight;
    }// getRectangleArea

    public double getSquareArea() {
        return base * hight;
    }// getSquareArea

    public double getTrapeseArea() {
        return ((base+lenght)*hight)/2;
    }// getTrapeseArea

    public double getTriangleArea() {
        return (base*hight)/2;
    }// getTriangleArea

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "base=" + base +
                ", lenght=" + lenght +
                ", hight=" + hight +
                '}';
    }
}// Figura
