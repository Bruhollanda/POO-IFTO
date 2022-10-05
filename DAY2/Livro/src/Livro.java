public class Livro {
    String titulo, nomeAutor, genero;
    int qntPaginas, codigo, secao;

    public void inicializar(String titulo, int qntPaginas, String nomeAutor, int codigo, String genero) {
        this.titulo = titulo;
        this.qntPaginas = qntPaginas;
        this.nomeAutor = nomeAutor;
        this.codigo = codigo;
        this.genero = genero;
    }// inicializar

    public void preencherSecao() {
        if (genero.equalsIgnoreCase("informática")) {
            secao = 1;
        } else if (genero.equalsIgnoreCase("português")) {
            secao = 2;
        } else if (genero.equalsIgnoreCase("matemática")) {
            secao = 3;
        } else {
            secao = 4;
        }
    }// preencherSecao

    public int obterPaginas() {
        return qntPaginas;
    }

    public int obterSecao() {
        return secao;
    }
}// Livro
