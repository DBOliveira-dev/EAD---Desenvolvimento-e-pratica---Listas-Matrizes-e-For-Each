package EAD_Atividades_Senai;
import java.util.Random;

public class Atv18 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][4];
        int soma = 0;

        // Preencher a matriz 4x4 com números aleatórios
        System.out.println("Matriz 4x4 preenchida com números aleatórios:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(100);  // Números aleatórios de 0 a 99
                soma += matriz[i][j];  // Somando os elementos
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Calcular a média
        double media = soma / 16.0;  // 4x4 = 16 elementos
        System.out.println("A média de todos os elementos da matriz é: " + media);
    }
}
