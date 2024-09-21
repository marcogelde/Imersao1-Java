import java.util.Scanner;

public class ListaDeFrutas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] frutas = {"Maça", "Banana", "Laranja", "Manga", "Abacaxi"};

        int i = 0;

        System.out.println("Frutas cadastradas no sistema: ");
        do {
            System.out.println((i + 1) + ". " + frutas[i]);
            i++;
        } while (i < frutas.length);
    }
}
