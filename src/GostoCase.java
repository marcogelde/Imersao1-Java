import java.util.Scanner;

public class GostoCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Como você gosta da comida:\n1)Azedo\n2)Doce\n3)Salgado\n4)Picante\nOpção:");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você prefere sabor Azedo");
                break;
            case 2:
                System.out.println("Você prefere sabor Doce");
                break;
            case 3:
                System.out.println("Você prefere sabor Salgado");
                break;
            case 4:
                System.out.println("Você prefere sabor Picante");
                break;
            default:
                System.out.println("Opção invalida");
                main(args);
                break;
        }
    }
}