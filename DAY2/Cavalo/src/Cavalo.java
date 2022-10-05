public class Cavalo {
    String nome, raca, cor;
    int idade;
    double peso, valor;

    public void inicializar(String nomeCavalo, int idadeCavalo, double pesoCavalo, String corCavalo) {
        this.nome = nomeCavalo;
        this.idade = idadeCavalo;
        this.peso = pesoCavalo;
        this.cor = corCavalo;
    }// inicializar

    public void descobrirRaca() {
        if(cor.equalsIgnoreCase("marrom")) {
            raca = "manga-larga";
        } else if(cor.equalsIgnoreCase("preta")) {
            raca = "árabe";
        } else if (cor.equalsIgnoreCase("cinza")) {
            raca = "indefinido";
        }
    }// descobrirRaca

    public void valorCavalo() {
        if (raca.equalsIgnoreCase("manga-larga")) {
            valor = 18000.00;
        } else if (raca.equalsIgnoreCase("árabe")) {
            valor = 25000.00;
        } else if (raca.equalsIgnoreCase("indefinido")) {
            valor = 5000.00;
        }
    }// valorCavalo

    public void mostrarCavalo() {
        System.out.println("Nome do cavalo: "+nome+
        "\nIdade do cavalo:"+idade+
        "\nPeso do cavalo: " +peso+
        "\nRaça do cavalo: "+raca+
        "\nCor do cavalo: "+cor+
        "\nValor do cavalo: "+valor);
    }// mostrarCavalo

}// Cavalo
