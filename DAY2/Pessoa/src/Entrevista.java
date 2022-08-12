import java.util.Scanner;

public class Entrevista {
    Scanner sc = new Scanner(System.in);


    public Pessoa obterDados() {
        Pessoa p = new Pessoa();
        System.out.println("Informe o nome: ");
        p.nome = sc.next();
        System.out.println("Informe o ano de nascimento: ");
        p.anoNascimento = sc.nextInt();
        System.out.println("Informe a altura em centímetros: ");
        p.altura = sc.nextInt();
        System.out.println("Informe o peso: ");
        p.peso = sc.nextDouble();
        return p;
    }// obterDados
}// Entrevista
