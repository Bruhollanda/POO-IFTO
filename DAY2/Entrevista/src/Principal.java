import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        Relatorio r = new Relatorio();
        Entrevista e = new Entrevista();
        Scanner sc = new Scanner(System.in);
        int option = 1;

        while (option == 1) {
            pessoas.add(e.obterDados());
            System.out.println("Deseja continuar?" +
                    "\nDigite 1 para sim;" +
                    "\nOutro número para sair;");
            option = sc.nextInt();
        }// while
        double listSize = pessoas.size();

        System.out.println(r.porcentagem1835(listSize, e.getContadorIdade1835()));
        System.out.println(r.porcentagem40(listSize, e.getContadorIdade40()));

    }// main
}// Principal
