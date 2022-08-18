package exercicios.algoritmos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("##.##");

        System.out.print("Quantos metros o terreno possui de frente: ");
        double metrosFrente = entrada.nextDouble();

        System.out.print("Quantos metros o terreno possui de lateral: ");
        double metrosLateral = entrada.nextDouble();

        System.out.print("Informe o valor do metro quadrado: ");
        double valorMetroQuadrado = entrada.nextDouble();

        double areaTerreno = metrosFrente * metrosLateral;
        double valorTerreno = valorMetroQuadrado * areaTerreno;

        System.out.println("\nArea total do terreno de " + metrosFrente + " mts de frente com " +
                metrosLateral + " mts de laeral é: " + areaTerreno + " mts" +
                "\nO valor deste terreno é: " + format.format(valorTerreno));
    }
}
