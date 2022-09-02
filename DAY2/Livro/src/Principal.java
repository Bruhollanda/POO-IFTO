public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.inicializar("Java", 300, "Autor", 1, "informática");
        livro.preencherSecao();
        System.out.println(livro.obterPaginas());
        System.out.println(livro.obterSecao());
    }
}// Principal
