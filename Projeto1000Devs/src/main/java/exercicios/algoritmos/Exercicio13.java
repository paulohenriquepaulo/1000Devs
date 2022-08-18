package exercicios.algoritmos;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de latas de 350ml: ");
        int qntd350 = entrada.nextInt();

        System.out.print("Digite a quantidade de latas de 600ml: ");
        int qntd600 = entrada.nextInt();

        System.out.print("Digite a quantidade de latas de 2lts: ");
        int qntd2Lts = entrada.nextInt();

        int qntdTotal = (qntd350 * 350) + (qntd600 * 600) + (qntd2Lts * 2000);

        System.out.println("\nA quantidade total de litros é: " + (qntdTotal / 1000));

    }

}
