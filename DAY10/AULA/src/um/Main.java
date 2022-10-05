package um;

public class Main {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Ana", 1984, 1, 10, 100);
//        System.out.println(estudante.obterIdade(2022));

        Professor professor = new Professor("Helder", 1976, "mestre", 10, 100);
//        System.out.println(professor.obterIdade(2022));

        Tecnico tecnico = new Tecnico("Paula", 2000, 5, 150);

        System.out.println(estudante.receberBolsa());
        System.out.println(professor.receberBolsa());
        System.out.println(tecnico.receberBolsa());
    }
}