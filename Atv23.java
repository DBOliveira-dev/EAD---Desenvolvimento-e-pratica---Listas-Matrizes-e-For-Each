package EAD_Atividades_Senai;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Atv23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Solicitar um valor para multiplicação
        System.out.print("Digite um número para multiplicar os elementos da lista: ");
        int multiplicador = scanner.nextInt();

        // Multiplicar cada número usando "for each"
        System.out.println("Lista após multiplicar os elementos pelo número " + multiplicador + ":");
        for (int num : numeros) {
            System.out.println(num * multiplicador);
        }

        scanner.close();
    }
}
