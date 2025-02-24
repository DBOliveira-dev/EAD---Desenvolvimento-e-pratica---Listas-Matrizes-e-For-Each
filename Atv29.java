package EAD_Atividades_Senai;
public class Atv29 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        // Soma de cada coluna
        System.out.println("Soma das colunas:");
        for (int j = 0; j < 4; j++) {
            int somaColuna = 0;
            for (int[] linha : matriz) {
                somaColuna += linha[j];
            }
            System.out.println("Soma da coluna " + (j + 1) + ": " + somaColuna);
        }
    }
}