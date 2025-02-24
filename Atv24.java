package EAD_Atividades_Senai;
import java.util.ArrayList;
import java.util.Arrays;

public class Atv24 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        // Exibir apenas números pares usando "for each"
        System.out.println("Números pares:");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
