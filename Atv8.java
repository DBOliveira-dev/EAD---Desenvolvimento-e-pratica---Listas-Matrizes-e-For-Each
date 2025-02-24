package EAD_Atividades_Senai;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Atv8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        // Solicitar 5 nomes ao usuário
        System.out.println("Digite 5 nomes:");
        for (int i = 0; i < 5; i++) {
            String nome = scanner.nextLine();
            nomes.add(nome);
        }

        // Ordenar os nomes em ordem alfabética
        Collections.sort(nomes);

        // Exibir os nomes ordenados
        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}