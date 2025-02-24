package EAD_Atividades_Senai;
import java.util.Scanner;

public class Atv17 {
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

        // Solicitar um número escalar
        System.out.print("Digite um número escalar para multiplicar os elementos da matriz: ");
        int escalar = scanner.nextInt();

        // Multiplicar os elementos da matriz pelo escalar
        System.out.println("Matriz resultante após multiplicar pelo escalar:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] *= escalar;  // Multiplicando pelo escalar
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}