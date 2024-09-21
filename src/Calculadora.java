import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int numero2 = sc.nextInt();
        int resultado = 0;

        System.out.print("Qual cálculo você quer fazer agora?\n1)Soma\n2)Subtração\n3)Multiplicação\n4)Divisão\nOpção:");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                resultado = numero1 / numero2;
                break;
            default:
                System.out.println("Opção invalida");
                main(args);
                break;
        }
        System.out.println("Resultado: " + resultado);
    }
}