public class Principal {
    public static void main(String[] args) {
        Cavalo obj1 = new Cavalo();
        obj1.nome = "Pé de Pano";
        obj1.idade = 5;
        obj1.peso = 56;
        obj1.raca = "indefinido";
        obj1.cor = "cinza";
        obj1.valor = 5000.00;

        System.out.println("Nome do cavalo: "+obj1.nome+
            "\nIdade do cavalo:"+obj1.idade+
            "\nPeso do cavalo: " +obj1.peso+
            "\nRaça do cavalo: "+obj1.raca+
            "\nCor do cavalo: "+obj1.cor+
            "\nValor do cavalo: "+obj1.valor);
        System.out.println("******************************************");

        Cavalo obj2 = new Cavalo();
        obj2.inicializar("Pé de Pano", 5, 56, "cinza");
        obj2.descobrirRaca();
        obj2.valorCavalo();
        obj2.mostrarCavalo();

    }// main
}// Principal
