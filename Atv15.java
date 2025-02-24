package EAD_Atividades_Senai;
import java.util.Scanner;

public class Atv15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaDiagonalSecundaria = 0;

        // Preencher a matriz 3x3
        System.out.println("Digite os 9 números para preencher a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
                if (i + j == 2) {
                    somaDiagonalSecundaria += matriz[i][j];  // Somando os elementos da diagonal secundária
                }
            }
        }

        // Exibir a soma da diagonal secundária
        System.out.println("A soma da diagonal secundária é: " + somaDiagonalSecundaria);

        scanner.close();
    }
}
