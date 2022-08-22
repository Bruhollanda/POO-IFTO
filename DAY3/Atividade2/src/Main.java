public class Main {
    public static void main(String[] args) {
        Figura figura = new Figura(12, 5, 6);
        System.out.printf("Área do retângulo: %.2f m²\n", figura.getRectangleArea());
        System.out.printf("Área do quadrado: %.2f m²\n", figura.getSquareArea());
        System.out.printf("Área do trapézio: %.2f m²\n", figura.getTrapeseArea());
        System.out.printf("Área do triângulo: %.2f m²\n", figura.getTriangleArea());
    }
}