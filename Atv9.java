package EAD_Atividades_Senai;
import java.util.ArrayList;
import java.util.Collections;

public class Atv9 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        // Adicionando 7 elementos à lista
        for (int i = 0; i < 7; i++) {
            numeros.add(i + 1);  // Exemplo: de 1 a 7
        }

        // Exibir a lista na ordem inversa
        Collections.reverse(numeros);
        System.out.println("Lista na ordem inversa: " + numeros);
    }
}
