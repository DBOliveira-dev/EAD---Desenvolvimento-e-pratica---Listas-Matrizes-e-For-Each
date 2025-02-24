package EAD_Atividades_Senai;
import java.util.Scanner;

public class Atv12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int soma = 0;

        // Preencher a matriz 3x3
        System.out.println("Digite os 9 números para preencher a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
                soma += matriz[i][j];  // Somando os elementos
            }
        }

        // Exibir a soma
        System.out.println("A soma de todos os elementos da matriz é: " + soma);

        scanner.close();
    }
}