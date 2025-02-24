package EAD_Atividades_Senai;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Atv7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        // Solicitar 8 números ao usuário
        System.out.println("Digite 8 números:");
        for (int i = 0; i < 8; i++) {
            int num = scanner.nextInt();
            numeros.add(num);
        }

        // Ordenar a lista em ordem crescente
        Collections.sort(numeros);

        // Exibir os números ordenados
        System.out.println("Números em ordem crescente: " + numeros);

        scanner.close();
    }
}
