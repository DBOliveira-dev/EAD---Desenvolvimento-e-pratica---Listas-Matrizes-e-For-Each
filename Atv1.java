package EAD_Atividades_Senai;
import java.util.ArrayList;
import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        // Solicitar 5 números ao usuário
        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            numeros.add(num);
        }

        // Exibir os números digitados
        System.out.println("Os números digitados foram:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
    }
}
