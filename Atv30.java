package EAD_Atividades_Senai;
import java.util.ArrayList;
import java.util.Arrays;

public class Atv30 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(1, -2, 3, -4, 5));

        // Substituir valores negativos por zero usando "for each"
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) < 0) {
                numeros.set(i, 0);
            }
        }

        // Exibir a lista após as modificações
        System.out.println("Lista após substituir os negativos por zero: " + numeros);
    }
}