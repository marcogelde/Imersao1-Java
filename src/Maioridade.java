import java.util.Scanner;

public class Maioridade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else if (idade < 0) {
            System.out.println("Digite uma idade válida.");
            main(args);
        } else {
            System.out.println("Você é menor de idade.");
        }
    }
}