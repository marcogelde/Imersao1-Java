import java.util.Scanner;

public class PositivoNegativoZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Esse número é positivo");
        } else if (num < 0) {
            System.out.println("Esse número é negativo");
        } else {
            System.out.println("Esse número é Zero");
        }
    }
}