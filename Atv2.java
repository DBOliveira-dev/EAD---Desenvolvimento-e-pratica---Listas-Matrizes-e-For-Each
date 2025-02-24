package EAD_Atividades_Senai;
import java.util.ArrayList;
import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int soma = 0;

        // Solicitar 5 números ao usuário
        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            numeros.add(num);

            // Somando os números
            soma += num;
        }

        // Exibir a soma
        System.out.println("A soma dos números é: " + soma);

        scanner.close();
    }
}
