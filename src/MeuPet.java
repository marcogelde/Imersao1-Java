import java.util.Scanner;

public class MeuPet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dog = {"Java", "Lua", "Sol", "Mingau", "Tob"};
        System.out.println("Cachorros da clinica");
        for (int i = 0; i < dog.length; i++) {
            System.out.println((i + 1) + " " + dog[i]);
        }
    }
}
