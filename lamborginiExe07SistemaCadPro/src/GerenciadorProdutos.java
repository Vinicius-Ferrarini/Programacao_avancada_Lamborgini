import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorProdutos {
    private static List<Produto> produtos = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Buscar produto por codigo");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    buscarProduto();
                    break;
                case 3:
                    System.out.println("Por que cara? ...");
                    break;
                default:
                    System.out.println("Digita direito ai!");
            }
        } while (opcao != 3);
    }

    private static void cadastrarProduto() {
        System.out.print("Codigo: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Preco: ");
        double preco = sc.nextDouble();

        produtos.add(new Produto(codigo, nome, preco));
        System.out.println("Produto cadastrado com sucesso!(Parabens)");
    }

    private static void buscarProduto() {
        System.out.print("Codigo do produto: ");
        int codigo = sc.nextInt();

        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                System.out.println(produto);
                return;
            }
        }
        System.out.println("Digita direito,por favor..");
    }
}
