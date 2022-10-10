import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();
        formas.add(
                new Circulo("Circulo", 2)
        );
        formas.add(
                new Triangulo("Triangulo", 2, 2)
        );
        formas.add(
                new Quadrado("Quadrado", 2, 2)
        );
        formas.add(
                new Esfera("Esfera", 2)
        );

        for (Forma f: formas) {
            if (f instanceof FormaBidimensional) {
                System.out.printf("\n%s: \n", f.getDescricao());
                System.out.printf("Área: %.2f\n", f.obterArea());
                System.out.println();
            } else if (f instanceof FormaTridimensional) {
                System.out.printf("\n%s: \n", f.getDescricao());
                System.out.printf("Área: %.2f\n", f.obterArea());
                System.out.printf("Volume: %.2f\n", ((FormaTridimensional) f).obterVolume());
            }
        }
    }
}