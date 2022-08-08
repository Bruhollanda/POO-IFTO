public class Principal {
    public static void main(String[] args) {
        OO p = new OO();

        p.obterDados();
        System.out.println("Nome: "+p.nome);
        System.out.printf("Salário: R$%.2f", p.calcular());
    }
}