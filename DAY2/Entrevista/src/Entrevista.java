import java.util.Scanner;

public class Entrevista {
    int idade;
    double contadorIdade1835, contadorIdade40;

    public Entrevista(int idade) {
        this.idade = idade;
    }
    public Entrevista() { }

    public Pessoa obterDados() {
        Pessoa p = new Pessoa();
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome: ");
        p.setNome(sc.nextLine());

        System.out.println("Informe o ano de nascimento: ");
        p.setAnoNascimento(sc.nextInt());
        idade = p.calcularIdade();
        if (idade > 17 && idade < 36) {
            contadorIdade1835++;
        } else if (idade > 40) {
            contadorIdade40++;
        }

        System.out.println("Informe a altura: ");
        p.setAltura(sc.nextDouble());
        System.out.println("Informe o peso: ");
        p.setPeso(sc.nextDouble());
        sc.nextLine();
        return p;
    }// obterDados

    public double getContadorIdade1835() {
        return contadorIdade1835;
    }

    public double getContadorIdade40() {
        return contadorIdade40;
    }
}// Entrevista
