import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empregado> empregados = new ArrayList<>();
        Contabiliza contabiliza = new Contabiliza();
        empregados.add(
                new Professor("Fulano", 1, 5, 55.5)
        );
        empregados.add(
                new Servidor("Ciclano", 2, 10,20, 50)
        );
        empregados.add(
                new Contratado("Beltrano", 3, 40, 10)
        );

        contabiliza.imprimir(empregados);
    }
}