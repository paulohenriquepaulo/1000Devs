package exercicios.atividadesAvaliativas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String[] nomes = new String[3];
        Integer[] idades = new Integer[3];
        Character[] sexo = new Character[3];
        Integer crianca = 0, adolescente = 0, adulto = 0, melhorIdade = 0, x = 0;


        while (true) {
           while (x < 4){

               try {
                    System.out.println("-----------------------------------------");
                    System.out.print("Informe o " + (x + 1)+ "º nome: ");
                    nomes[x] = entrada.nextLine();
                    System.out.print("Informe a idade de " + nomes[x] + ": ");
                    idades[x] = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Informe o sexo de " + nomes[x] + ": F/M ");
                    sexo[x] = entrada.next().charAt(0);
                    entrada.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println("-----------------------------------------");
                    System.out.println("Tipo de entrada invalida.");
                    entrada.nextLine();
                    break;
                }
                x++;
                if (x == 3) {
                    break;
                }
            }
            if (x == 3) {
                break;
            }
        }

        for (Integer i : idades) {
            if (i <= 13) {
                crianca++;
            } else if (i < 20) {
                adolescente++;
            } else if (i <= 50) {
                adulto++;
            } else {
                melhorIdade++;
            }

        }
        int maisVelho = 0;
        for (int idade : idades) {
            if (idade > maisVelho) {
                maisVelho = idade;
            }
        }
        int contador = 0;
        for (int i : idades) {
            if (i == maisVelho) {
                contador++;
            }
        }
        String nomeMaisVelho = null;
        if (idades[0] == maisVelho) {
            nomeMaisVelho = nomes[0];

        } else if (idades[1] == maisVelho) {
            nomeMaisVelho = nomes[1];
        } else if (idades[2] == maisVelho) {
            nomeMaisVelho = nomes[2];
        }

        System.out.println("-----------------------------------------");
        System.out.println("Total de crianças: " + crianca +
                "\nTotal de adolescentes: " + adolescente +
                "\nTotal de adultos: " + adulto +
                "\nTotal de melhor idade: " + melhorIdade);

        if (contador >= 2) {
            StringBuilder nomesMaisVelhos = new StringBuilder();
            for (int i = 0; i < contador; i++) {
                nomesMaisVelhos.append(nomes[i] + ". ");
            }
            System.out.println("\n\nOs mais velhos são: " + nomesMaisVelhos);
        } else {
            System.out.println("\n\nO nome do indivíduo mais velho é: " + nomeMaisVelho);
        }
    }
}
