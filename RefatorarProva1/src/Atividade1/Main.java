package Atividade1;

public class Main {
    public static void main(String[] args) {
        Matriz matriz = new Matriz(5);
        matriz.preencher();
        System.out.println("*********************************************");
        System.out.println("  A soma total das bordas da matriz é: "+ matriz.sum());
        System.out.println("*********************************************");
        matriz.maiorElemento();
        System.out.println("*********************************************");

    }
}