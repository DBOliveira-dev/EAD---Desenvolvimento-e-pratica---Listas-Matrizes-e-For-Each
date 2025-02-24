package EAD_Atividades_Senai;
public class Atv28 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int maior = Integer.MIN_VALUE;

        // Percorrer e encontrar o maior elemento usando "for each"
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                if (elemento > maior) {
                    maior = elemento;
                }
            }
        }

        // Exibir o maior elemento
        System.out.println("O maior elemento da matriz é: " + maior);
    }
}