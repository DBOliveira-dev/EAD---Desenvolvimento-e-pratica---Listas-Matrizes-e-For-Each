package EAD_Atividades_Senai;

import java.util.Scanner;

public class Atv13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int maior = Integer.MIN_VALUE;

        // Preencher a matriz 3x3
        System.out.println("Digite os 9 números para preencher a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];  // Encontrando o maior número
                }
            }
        }

        // Exibir o maior elemento
        System.out.println("O maior número na matriz é: " + maior);

        scanner.close();
    }
}
