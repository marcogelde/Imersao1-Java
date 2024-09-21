import java.util.Scanner;

public class VotarDirigir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int num = sc.nextInt();

        if (num >= 16 && num < 18) {
            System.out.println("Você ja pode votar mas não pode dirigir");
        } else if (num < 16) {
            System.out.println("Não pode votar e nem dirigir");
        } else {
            System.out.println("Pode votar e pode dirigir");
        }
    }
}