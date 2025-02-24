package EAD_Atividades_Senai;
import java.util.ArrayList;
import java.util.Arrays;

public class Atv22 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int soma = 0;

        // Somar todos os elementos usando "for each"
        for (int num : numeros) {
            soma += num;
        }

        // Exibir o resultado
        System.out.println("A soma de todos os elementos é: " + soma);
    }
}
