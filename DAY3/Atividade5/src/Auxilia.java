import java.util.Scanner;

public class Auxilia {
    int num;
    Scanner sc = new Scanner(System.in);

    int obterNumero(){
        System.out.print("Informe um número impar maior que 1: ");
        num = sc.nextInt();
        while ((num % 2 == 0) || (num <= 1)){
            System.out.print("O número informado não é impar ou maior que 1.\nInforme o número novamente: ");
            num = sc.nextInt();
        }
        return num;
    }
}// Auxilia
