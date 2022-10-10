import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(
                new Cachorro("Alfredo", "preto", 2004)
        );
        animals.add(
                new Gato("Garfield", "laranja", 2013)
        );
        animals.add(
                new Zebra("Martin", "branco", 2006)
        );

        for (Animal a: animals) {
            System.out.print("****************************");
            System.out.printf("  \n%s:\nIdade: %d\nRaça: %s\n", a.getNome(), a.obterIdade(2022), a.obterRaca());
        }

    }
}