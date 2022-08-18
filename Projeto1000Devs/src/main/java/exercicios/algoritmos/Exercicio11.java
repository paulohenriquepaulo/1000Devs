package exercicios.algoritmos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        System.out.print("Digite a QTDE de lts de suco necessaria: ");
        float qntdLitros = entrada.nextFloat();

        System.out.println("\nSera necessario para fazer " + ((int) qntdLitros) + " lts de suco de maracuja\n" +
                format.format(qntdLitros * 0.8) + " lts de agua\n" +
                format.format(qntdLitros * 0.2) + " lts de suco concentrado de maracuja");
    }
}
