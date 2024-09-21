import java.util.Scanner;

public class ListaDeFrutas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array vazio para armazenar as frutas
        String[] frutas = new String[5];
        int quantidade = 0;
        int opcao;

        do {
            System.out.println("\n========== Menu ==========");
            System.out.println("1) Visualizar");
            System.out.println("2) Adicionar");
            System.out.println("3) Remover");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (opcao) {
                case 1:
                    if (quantidade == 0) {
                        System.out.println("A lista está vazia.");
                    } else {
                        System.out.println("Lista de frutas:");
                        for (int i = 0; i < quantidade; i++) {
                            System.out.println((i + 1) + "ª fruta: " + frutas[i]);
                        }
                    }
                    break;
                case 2:
                    if (quantidade == 5) {
                        System.out.println("A lista já está cheia. Não é possível adicionar mais frutas.");
                    } else {
                        System.out.print("Digite o nome da fruta: ");
                        frutas[quantidade] = scanner.nextLine();
                        quantidade++;
                    }
                    break;
                case 3:
                    if (quantidade == 0) {
                        System.out.println("A lista está vazia. Não há frutas para remover.");
                    } else {
                        System.out.println("Digite o número da fruta que deseja remover:");
                        for (int i = 0; i < quantidade; i++) {
                            System.out.println((i + 1) + "ª fruta: " + frutas[i]);
                        }
                        int remover = scanner.nextInt() - 1;

                        if (remover >= 0 && remover < quantidade) {
                            // Deslocar os elementos para a esquerda
                            for (int i = remover; i < quantidade - 1; i++) {
                                frutas[i] = frutas[i + 1];
                            }
                            frutas[quantidade - 1] = null; // Opcional: limpar a última posição
                            quantidade--;
                            System.out.println("Fruta removida com sucesso.");
                        } else {
                            System.out.println("Opção inválida.");
                        }
                    }
                    break;
                default:
                    System.out.println("Programa finalizado.");
                    return;
            }
        } while (opcao > 0 && opcao < 4);

        scanner.close();
    }
}
