package exercicios.atividadesAvaliativas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] count = {0, 0, 0, 0,};
        int quantidadeVotos = 0;
        int opcao = 0;

        while (quantidadeVotos < 5) {
            System.out.println("===================================================");
            System.out.println("================== MENU DE VOTAÇÃO ================");
            System.out.println("===================================================");
            System.out.println("1 - Candidato A" +
                    "\n2 - Candidato B" +
                    "\n3 - Candidato C" +
                    "\n4 - Voto Nulo");
            System.out.print("---------------------------------------------------" +
                    "\nEscolha um candidato: ");
            try {
                opcao = entrada.nextInt();
            } catch (InputMismatchException e) {
                opcao = 0;
                System.err.println("\nValor digitado precisar ser numerico");
                entrada.nextLine();
            }

            switch (opcao) {
                case 0:
                    break;
                case 1:
                    System.out.println("Você votou no candidato A");
                    count[0]++;
                    quantidadeVotos++;
                    break;
                case 2:
                    System.out.println("Você votou no candidato B");
                    count[1]++;
                    quantidadeVotos++;
                    break;
                case 3:
                    System.out.println("Você votou no candidato c");
                    count[2]++;
                    quantidadeVotos++;
                    break;
                case 4:
                    System.out.println("Seu voto foi nulo");
                    count[3]++;
                    quantidadeVotos++;
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }
        resultadoElicao(count);
    }

    static void resultadoElicao(int[] count) {
        double pesoVoto = 100 / 5;
        int votosValidos = count[0] + count[1] + count[2];
        System.out.println("===================================================");
        System.out.println("=============== Resultado da Eleição ==============");
        System.out.println("===================================================");
        System.out.println("Percentual de Votos Válidos:     \t\t" + (votosValidos * pesoVoto) + " %" +
                "\nPercentual de Votos Candidato A: \t\t" + (count[0] * pesoVoto) + " %" +
                "\nPercentual de Votos Candidato B: \t\t" + (count[1] * pesoVoto) + " %" +
                "\nPercentual de Votos Candidato C: \t\t" + (count[2] * pesoVoto) + " %" +
                "\nPercentual de Votos Nulos:       \t\t" + (count[3] * pesoVoto) + " %");
        System.out.println("---------------------------------------------------");
        System.out.println(contadorDeVotos(count));
    }

    static String contadorDeVotos(int[] count) {

        int maisVotado = 0, contador = 0;
        String frase = null;
        for (int voto : count) {
            if (voto > maisVotado) {
                maisVotado = voto;
            }
        }
        for (int voto : count) {
            if (voto == maisVotado) {
                contador++;
            }
        }
        String vencedor = null;
        if (contador >= 2) {
            frase = "Houve um empate";
        } else {
            if (count[0] == maisVotado) {
                vencedor = "Candidato A";
            } else if (count[1] == maisVotado) {
                vencedor = "Candidato B";
            } else if (count[2] == maisVotado) {
                vencedor = "Candidato C";
            } else if (count[3] == maisVotado) {
                count[3] = 0;
                return contadorDeVotos(count);
            }
            frase = "O vencendor foi o " + vencedor;
        }
        return frase;
    }

}
