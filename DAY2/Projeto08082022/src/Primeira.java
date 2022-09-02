import java.util.Scanner;

public class Primeira {
    public static void main(String[] args) {
        // sintaxe de linguagem
        int n1 = 0; // número inteiro
        double n2 = 1.2; // número decimal
        char letra = 35; // caractere
        boolean escolher = true; // verdadeiro ou falso
        String frase = "uma frase"; // texto

        Scanner sc = new Scanner(System.in); // obj sc da classe Scanner
        int entradaInteira = sc.nextInt(); // recebe entrada de inteiro
        sc.nextLine();
        String entradaTexto = sc.nextLine(); // recebe entrada de texto

        System.out.println("Inteiro: " + entradaInteira + "\nTexto: " + entradaTexto);
    }// main
}// Primeira
