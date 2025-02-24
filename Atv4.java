package EAD_Atividades_Senai;
import java.util.ArrayList;
import java.util.Random;

public class Atv4 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        // Gerar 10 números aleatórios
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(100) + 1;
            numeros.add(num);
            if (num > maior) maior = num;
            if (num < menor) menor = num;
        }

        // Exibir o maior e o menor número
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
    }
}

