package EAD_Atividades_Senai;
public class Atv26 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Percorrer e exibir os elementos da matriz usando "for each"
        System.out.println("Elementos da matriz:");
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}
