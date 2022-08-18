package exercicios.algoritmos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#####,##00000.00");

        System.out.print("Informe quantidade de cavalos: ");
        int quantidadeCavalos = entrada.nextInt();

        System.out.print("Informe o valor de cada ferradura R$: ");
        double valorFerradura = entrada.nextDouble();
        int quantidadeFerradura = quantidadeCavalos * 4;

        System.out.println("\nA quantidade de ferraduras necessarias: " + quantidadeFerradura +
                "\nValor total para a compra das ferraduras: R$ " + format.format(quantidadeFerradura * valorFerradura));

    }
}
