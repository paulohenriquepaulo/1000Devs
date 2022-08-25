package exercicios.beecrowd;

import java.util.Scanner;

public class Exercicio1013 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
        System.out.println(maior + " eh o maior");

    }
}
