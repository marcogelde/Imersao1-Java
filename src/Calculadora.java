import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o primeiro número
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        // Solicita ao usuário que insira o segundo número
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Solicita ao usuário que insira a operação desejada
        System.out.print("Escolha a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        double resultado;

        // Realiza a operação escolhida
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                // Verifica se o segundo número não é zero para evitar divisão por zero
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    scanner.close();
                    return; // Sai do programa
                }
                break;
            default:
                System.out.println("Operação inválida.");
                scanner.close();
                return; // Sai do programa
        }

        // Exibe o resultado da operação
        System.out.println("O resultado é: " + resultado);
        scanner.close();
    }
}
