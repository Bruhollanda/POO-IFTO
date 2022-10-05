import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            pessoas[i] = new Pessoa();

            System.out.print("Informe o nome: ");
            pessoas[i].setNome(sc.next());

            System.out.print("Informe o ano de nascimento: ");
            pessoas[i].setAnoNasc(sc.nextInt());
            pessoas[i].calcularIdade();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(pessoas[i]);
        }

    }
}