package EAD_Atividades_Senai;
public class Atv27 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int soma = 0;

        // Percorrer e somar os elementos da matriz usando "for each"
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                soma += elemento;
            }
        }

        // Exibir o resultado
        System.out.println("A soma de todos os elementos da matriz é: " + soma);
    }
}
