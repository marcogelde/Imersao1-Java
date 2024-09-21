import java.util.Scanner;

public class Votar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int num = sc.nextInt();

        if (num >= 16) {
            System.out.println("Você ja pode votar");
        } else
            System.out.println("Não pode votar");
        }
}