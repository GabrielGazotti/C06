package Exercicio1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();

        int[][] campo = new int[2][2];
        boolean[][] revelado = new boolean[2][2];

        int bombaLinha = rand.nextInt(2);
        int bombaColuna = rand.nextInt(2);
        campo[bombaLinha][bombaColuna] = 1;

        int totalSeguros = (2 * 2) - 1;
        int segurosDescobertos = 0;

        System.out.println("CAMPO MINADO");
        System.out.println("Escolha uma posição (linha e coluna entre 0 e 1)");

        while (segurosDescobertos < totalSeguros) {
            System.out.print("Digite a linha (0 ou 1): ");
            int linha = entrada.nextInt();

            System.out.print("Digite a coluna (0 ou 1): ");
            int coluna = entrada.nextInt();

            if (linha < 0 || linha > 1 || coluna < 0 || coluna > 1) {
                System.out.println("Posição inválida! Digite 0 ou 1.");
                continue;
            }

            if (revelado[linha][coluna]) {
                System.out.println("Você já tentou essa posição, escolha outra.");
                continue;
            }

            revelado[linha][coluna] = true;

            if (campo[linha][coluna] == 1) {
                System.out.println("Você pisou em uma mina!");
                System.out.println("A mina está na posição [" + linha + "," + coluna + "].");
            } else {
                System.out.println("Essa posição é segura.");
                segurosDescobertos++;
            }
        }

        System.out.println("PARABÉNS! Você encontrou todas as casas seguras!");
        entrada.close();
    }
}
