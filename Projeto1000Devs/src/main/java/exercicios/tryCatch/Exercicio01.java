package exercicios.tryCatch;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("##.##");
        double metrosFrente = 0.0;
        double metrosLateral = 0.0;
        double valorMetroQuadrado = 0.0;


        while (true) {
            try {
                System.out.print("Quantos metros o terreno possui de frente: ");
                metrosFrente = entrada.nextDouble();

                System.out.print("Quantos metros o terreno possui de lateral: ");
                metrosLateral = entrada.nextDouble();

                System.out.print("Informe o valor do metro quadrado: ");
                valorMetroQuadrado = entrada.nextDouble();

                validarValores(metrosFrente, metrosLateral, valorMetroQuadrado);

                break;
            } catch (InputMismatchException e) {
                System.out.println("\nO valor informado precisa ser números");
                entrada.nextLine();

            } catch (RuntimeException e) {
                System.out.println(e.getMessage());

            } catch (Exception e) {
                break;
            }

        }

        double areaTerreno = metrosFrente * metrosLateral;
        double valorTerreno = valorMetroQuadrado * areaTerreno;

        System.out.println("\nArea total do terreno de " + metrosFrente + " mts de frente com " +
                metrosLateral + " mts de laeral é: " + areaTerreno + " mts" +
                "\nO valor deste terreno é: " + format.format(valorTerreno));

    }

    public static void validarValores(double valor1, double valor2, double valor3) {
        if (valor1 <= 0) {
            throw new RuntimeException("\nO tamanho de metros da frente precisa ser maior que 0. ");
        } else if (valor2 <= 0) {
            throw new RuntimeException("\nO tamanho de metros lateral precisa ser maior que 0. ");
        } else if (valor3 <= 0) {
            throw new RuntimeException("\nO valor do metro precisa ser maior que 0. ");
        }
    }

}
