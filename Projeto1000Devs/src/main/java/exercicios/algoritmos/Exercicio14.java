package exercicios.algoritmos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        System.out.print("Digite a quantidade de sanduiches: ");
        int qntdSanduiches = entrada.nextInt();

        double qntdQueijoKg = (qntdSanduiches * 2) * 50;
        double qntdPresuntojoKg = qntdSanduiches * 50;
        double rodelaHamburguer = qntdSanduiches * 120;


        System.out.println("\nPara produzir " + qntdSanduiches + " sanduiches serão necessarios: \n" +
                format.format(qntdQueijoKg / 1000) + " Kgs de mussarela\n" +
                format.format(qntdPresuntojoKg / 1000) + " Kgs de presunto\n" +
                format.format(rodelaHamburguer / 1000) + " Kgs  de hambuger");
    }
}
