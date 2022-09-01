import java.util.List;

public class Relatorio {
    int contDentroDoPeso = 0, somaIdadesDentroDoPeso = 0;
    public double porcentagemIdade1835(double totalEntrevistadas, double cont1835) {
        return ((cont1835*100)/totalEntrevistadas);
    }// porcentagem1835

    public double porcentagemIdade40(double totalEntrevistadas, double cont40) {
        return ((cont40*100)/totalEntrevistadas);
    }// porcentagem40

    public void situacaoIMC(List<Pessoa> pessoas) {
        for (int i = 0; i < pessoas.size(); i++) {
            double imc = pessoas.get(i).calcularIMC();
            if (imc < 18.5) {
                System.out.println(pessoas.get(i).nome + ": abaixo do peso.");
            } else if (imc >= 18.5 && imc <= 24.9) {
                System.out.println(pessoas.get(i).nome + ": peso normal.");
                contDentroDoPeso++;
            } else if (imc >= 25 && imc <= 29.9) {
                System.out.println(pessoas.get(i).nome + ": sobrepeso. ");
            } else if (imc >= 30 && imc <= 39.9) {
                System.out.println(pessoas.get(i).nome + ": obesidade. ");
            } else if (imc > 40) {
                System.out.println(pessoas.get(i).nome + ": obesidade grave. ");
            }
        }
    }// situacaoIMC

    public void pessoasDentroDoPeso (List<Pessoa> pessoas) {
        for (int i = 0; i < pessoas.size(); i++) {
            somaIdadesDentroDoPeso += pessoas.get(i).calcularIdade();
        }// for
        System.out.println("Quantidade de pessoas dentro do peso: "+contDentroDoPeso);
        System.out.println("Média das idades das pessoas dentro do peso: "+(somaIdadesDentroDoPeso/contDentroDoPeso));
    }// pessoasDentroDoPeso

}// Relatorio
