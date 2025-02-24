package EAD_Atividades_Senai;
import java.util.ArrayList;
import java.util.Arrays;

public class Atv25 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>(Arrays.asList("João", "Maria", "José"));

        // Exibir uma saudação para cada nome usando "for each"
        System.out.println("Saudações:");
        for (String nome : nomes) {
            System.out.println("Olá, " + nome + "!");
        }
    }
}