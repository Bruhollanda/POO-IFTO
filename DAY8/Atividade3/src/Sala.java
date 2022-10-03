import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sala {
    private int codigoSala, ano;
    private String nomeDisciplina;
    List<Aluno> alunos = new ArrayList<>();

    public Sala(int codigoSala, int ano, String nomeDisciplina) {
        this.codigoSala = codigoSala;
        this.ano = ano;
        this.nomeDisciplina = nomeDisciplina;
    }
    public void addAluno(){
        Scanner sc = new Scanner(System.in);
        for (Aluno a: alunos) {
            System.out.println("Informe o id: ");
            a.setId(sc.nextInt());
            System.out.println("Informe o nome: ");
            a.setNome(sc.next());
            System.out.println("Informe o ano de nascimento: ");
            a.setAnoNascimento(sc.nextInt());
        }
    }

    public int getCodigoSala() {
        return codigoSala;
    }

    public void setCodigoSala(int codigoSala) {
        this.codigoSala = codigoSala;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "codigoSala=" + codigoSala +
                ", ano=" + ano +
                ", nomeDisciplina='" + nomeDisciplina + '\'' +
                '}';
    }
}