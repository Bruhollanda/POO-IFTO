import java.util.List;

public class Contabiliza {
    public void imprimir(List<Empregado> empregados) {
        for (Empregado e: empregados) {
            if (e instanceof Professor) {
                System.out.printf("\n%s:\nSalário total: %.2f\n\n",
                        e.getNome(), e.calcularSalario() + ((Professor) e).addTitulacao(2,5));
            } else if (e instanceof Servidor) {
                System.out.printf("\n%s:\nSalário total: %.2f\n\n",
                        e.getNome(), e.calcularSalario() + ((Servidor) e).getGratificacao());
            } else {
                System.out.printf("\n%s:\nSalário total: %.2f\n\n",
                        e.getNome(), e.calcularSalario());
            }
        }
    }
}// class
