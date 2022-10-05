import java.util.Scanner;

public class SalarioEstruturado {

    static void calcular (double horas, double valor, String nome){
        System.out.println("Funcionário: "+nome);
        System.out.println("Salário: R$"+(valor*horas));
    }

    static void obterDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome do funcionário: ");
        String nome = sc.next();
        System.out.println("Informe as horas trabalhadas do funcionário: ");
        int horas = sc.nextInt();
        System.out.println("Informe o valor da hora do funcionário: ");
        double valor = sc.nextDouble();

        calcular(horas, valor, nome);
    }

    public static void main(String[] args) {
        obterDados();

    }

}