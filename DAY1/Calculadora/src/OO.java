import java.util.Scanner;

public class OO {
    double valor;
    int horas;
    String nome;

    double calcular () {
        return horas*valor;
    }

    void obterDados() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do funcionário: ");
        nome = sc.next();
        System.out.println("Informe as horas trabalhadas do funcionário: ");
        horas = sc.nextInt();
        System.out.println("Informe o valor da hora do funcionário: ");
        valor = sc.nextDouble();
    }

}