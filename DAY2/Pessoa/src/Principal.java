import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Entrevista e = new Entrevista();
        List<Pessoa> pessoas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int op = 0;
        while(op == 0) {
            pessoas.add(e.obterDados());
            System.out.println("Digite 0 para " +
                    "adicionar mais ou 1 para sair.");
            op = sc.nextInt();
        }
        for (Pessoa p: pessoas) {
            System.out.println(p.toString());
        }

    }// main
}// Principal
