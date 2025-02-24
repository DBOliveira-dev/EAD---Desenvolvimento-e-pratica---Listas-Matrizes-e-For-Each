package EAD_Atividades_Senai;
import java.util.ArrayList;
import java.util.Iterator;

public class Atv6 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        // Adicionando 10 números à lista
        for (int i = 0; i < 10; i++) {
            numeros.add(i + 1);  // Exemplo: de 1 a 10
        }

        // Remover números ímpares
        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 != 0) {
                iterator.remove();
            }
        }

        // Exibir lista após remoção dos ímpares
        System.out.println("Lista após remover os números ímpares: " + numeros);
    }
}
