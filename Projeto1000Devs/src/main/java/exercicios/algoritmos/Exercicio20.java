package exercicios.algoritmos;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero de 4 digitos: ");
        Integer numero = entrada.nextInt();
        String valorString = String.valueOf(numero.toString().charAt(3));
        String number = String.valueOf(numero);
        char[] digitos = number.toCharArray();

        System.out.println("\nMilhares: " + digitos[0] +
                "\nCentenas: " + digitos[1] +
                "\nDezenas:  " + digitos[2] +
                "\nunidades: " + digitos[3]);

    }
}
