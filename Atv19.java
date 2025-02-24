package EAD_Atividades_Senai;
import java.util.Scanner;

public class Atv19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        // Preencher a matriz 3x3
        System.out.println("Digite os 9 números para preencher a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Exibir a matriz transposta
        System.out.println("Matriz transposta:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i] + "\t");  // Troca as linhas pelas colunas
            }
            System.out.println();
        }

        scanner.close();
    }
}