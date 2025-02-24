package EAD_Atividades_Senai;
import java.util.Scanner;

public class Atv16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar o tamanho da matriz identidade
        System.out.print("Digite o tamanho da matriz identidade: ");
        int n = scanner.nextInt();
        int[][] matrizIdentidade = new int[n][n];

        // Gerar a matriz identidade
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matrizIdentidade[i][j] = 1;  // Diagonal principal com 1
                } else {
                    matrizIdentidade[i][j] = 0;  // Demais elementos com 0
                }
            }
        }

        // Exibir a matriz identidade
        System.out.println("Matriz Identidade:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrizIdentidade[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}