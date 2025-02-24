package EAD_Atividades_Senai;
import java.util.Scanner;

import java.util.Scanner;

public class Atv14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaDiagonalPrincipal = 0;

        // Preencher a matriz 3x3
        System.out.println("Digite os 9 números para preencher a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
                if (i == j) {
                    somaDiagonalPrincipal += matriz[i][j];  // Somando os elementos da diagonal principal
                }
            }
        }

    }

}