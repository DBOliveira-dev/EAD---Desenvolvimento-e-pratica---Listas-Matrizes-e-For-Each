package EAD_Atividades_Senai;
import java.util.ArrayList;
import java.util.Arrays;

public class Atv21 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Exibir cada número usando "for each"
        System.out.println("Exibindo números usando 'for each':");
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}