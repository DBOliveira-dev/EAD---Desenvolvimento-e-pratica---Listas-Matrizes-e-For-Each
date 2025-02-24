package EAD_Atividades_Senai;
import java.util.ArrayList;
import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int soma = 0;

        // Solicitar 6 números ao usuário
        System.out.println("Digite 6 números:");
        for (int i = 0; i < 6; i++) {
            int num = scanner.nextInt();
            numeros.add(num);
            soma += num;  // Somando os números
        }

        // Calcular e exibir a média
        double media = soma / 6.0;
        System.out.println("A média dos números é: " + media);

        scanner.close();
    }
}
