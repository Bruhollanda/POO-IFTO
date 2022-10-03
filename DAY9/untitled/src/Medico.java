import java.util.List;

public class Medico {
    private String nome;
    private List<Consulta> consultas;

    public Medico(String nome, List<Consulta> consultas) {
        this.nome = nome;
        this.consultas = consultas;
    }

    public void adicionar(Consulta c) {
        consultas.add(c);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nome='" + nome + '\'' +
                ", consultas=" + consultas +
                '}';
    }
}
