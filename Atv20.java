package EAD_Atividades_Senai;
import java.util.Scanner;

public class Atv20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        // Preencher a matriz 4x4
        System.out.println("Digite os 16 números para preencher a matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Soma de cada linha
        System.out.println("Soma das linhas:");
        for (int i = 0; i < 4; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 4; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("Soma da linha " + (i + 1) + ": " + somaLinha);
        }

        // Soma de cada coluna
        System.out.println("Soma das colunas:");
        for (int j = 0; j < 4; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 4; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.println("Soma da coluna " + (j + 1) + ": " + somaColuna);
        }

        scanner.close();
    }
}