import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<Produto> produtos = new ArrayList<>();
    private Carrinho carrinho = new Carrinho();
    private Scanner sc = new Scanner(System.in);

    public void processamento() {
        int opcao;
        do {
            System.out.println("1- Vendedor adicione seu Produto");
            System.out.println("2- Usuario adicione produto ao carrinho");
            System.out.println("3- Sair e Listar o carrinho");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    incluirProduto();
                    break;
                case 2:
                    listarProdutos();
                    incluirNoCarrinho();
                    break;
                case 3:
                    carrinho.listarItens();
                    opcao=3;
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 3);
    }

    public void incluirProduto() {
        int idProduto;
        String nome;
        float preco;

        System.out.println("Digite o id do Produto: ");
        idProduto = sc.nextInt();

        sc.nextLine(); // Limpar o buffer do teclado

        System.out.println("Digite o nome do Produto: ");
        nome = sc.nextLine();

        System.out.println("Digite o preço do produto: ");
        preco = sc.nextFloat();

        Produto produto = new Produto(idProduto, nome, preco);
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto encontrado.");
        } else {
            System.out.println("Lista de produtos:");
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }
    }

    public void incluirNoCarrinho() {
        int idProduto;
        int quantidade;

        System.out.println("Digite o id do Produto que deseja adicionar ao carrinho: ");
        idProduto = sc.nextInt();

        System.out.println("Digite a quantidade: ");
        quantidade = sc.nextInt();

        Produto produto = encontrarProdutoPorId(idProduto);

        if (produto != null) {
            carrinho.adicionarItem(produto, quantidade);
            System.out.println("Produto adicionado ao carrinho com sucesso!");
        } else {
            System.out.println("Produto nao encontrado.");
        }
    }

    private Produto encontrarProdutoPorId(int id) {
        for (Produto produto : produtos) {
            if (produto.getIdProduto() == id) {
                return produto;
            }
        }
        return null;
    }
}
