package EAD_Atividades_Senai;

import java.util.ArrayList;
import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        // Lista de 10 números
        System.out.println("Digite 10 números para a lista:");
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            numeros.add(num);
        }

        // Solicitar um número ao usuário
        System.out.println("Digite um número para verificar se está na lista:");
        int numBusca = scanner.nextInt();

        // Verificar se o número está presente na lista
        if (numeros.contains(numBusca)) {
            System.out.println("O número " + numBusca + " está na lista.");
        } else {
            System.out.println("O número " + numBusca + " não está na lista.");
        }

        scanner.close();
    }
}
