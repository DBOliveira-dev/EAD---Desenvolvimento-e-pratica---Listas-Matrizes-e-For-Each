package EAD_Atividades_Senai;
import java.util.ArrayList;
import java.util.Scanner;

public class Atv10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();

        // Solicitar 5 números para a primeira lista
        System.out.println("Digite 5 números para a primeira lista:");
        for (int i = 0; i < 5; i++) {
            lista1.add(scanner.nextInt());
        }

        // Solicitar 5 números para a segunda lista
        System.out.println("Digite 5 números para a segunda lista:");
        for (int i = 0; i < 5; i++) {
            lista2.add(scanner.nextInt());
        }

        // Criar a terceira lista que será a junção das duas
        ArrayList<Integer> lista3 = new ArrayList<>();
        lista3.addAll(lista1);
        lista3.addAll(lista2);

        // Exibir a lista resultante
        System.out.println("Lista combinada: " + lista3);

        scanner.close();
    }
}
