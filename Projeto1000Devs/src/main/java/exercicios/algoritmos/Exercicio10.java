package exercicios.algoritmos;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o ano inicial: ");
        int anoInicial = entrada.nextInt();

        System.out.print("Digite o ano final: ");
        int anoFinal = entrada.nextInt();
        int idadeAnos = anoFinal - anoInicial;

        System.out.println("\nA idade desta pessoa em " +
                "\nanos é: " +  idadeAnos +
                "\nmeses é: " + (idadeAnos * 12) +
                "\ndias é: " + (idadeAnos * 365) +
                "\nsemanas é: " + (idadeAnos * 48));
    }
}
