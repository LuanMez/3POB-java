import java.util.ArrayList;
import java.util.Scanner;

public class menu {

    public class Menu {
    private ArrayList<Produto> produtos = new ArrayList<>();
    private ArrayList<Carrinho> carrinhos = new ArrayList<>();
    private int opcao = 0;
    private Scanner sc = new Scanner(System.in);

    public void Processamento() {
        //vendedor adicionando o produto a loja
        do {
            System.out.println("1- Vendedor adicione seu Produto:");
            if(opcao==1){
                System.out.println("0- Finalizar ");
            }

            opcao = sc.nextInt();
            
            switch(opcao){
                case 1:
                  IncluirProduto();  
            }

        }while (opcao!=0);

        //usuario selecionando o produto para comprar
        do{
            System.out.println("1- Usuario adicione produto ao carrinho: ");
            if(opcao==1){
                System.out.println("0- Finalizar o carrinho: ");
            }

            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    listarProdutos();
                    IncluirCarrinho(); 

            }
        }while(opcao!=0);

        //achar o arraylist produto e carrinho e printar a quantidade valor e valor final
        itensNoCarrinho(produtos, carrinhos);//verificar passar array 
    }

    public void IncluirProduto() {
		int idProduto;
        String nome;
		float preco;
	
		System.out.println("Digite o id do Produto: ");
		idProduto = sc.next();
	
		System.out.println("Digite o nome do Produto ");
		nome = sc.next();
	
		System.out.println("Digite o preco do produto: ");
		preco = sc.next();
	
		Produto produto = new Produto(idProduto, nome, preco);
		protudos.add(produto);
		System.out.println("produto adicionado com sucesso!");
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

    public void IncluirCarrinho() {
		int idProduto;
        int quantidade;
	
		System.out.println("Digite o id do Produto: ");
		idProduto = sc.next();
	
		System.out.println("Digite a quantidade: ");
		quantidade = sc.next();
	
		Carrinho carrinho = new Produto(idProduto, quantidade);
		carrinhos.add(carrinho);
		System.out.println("produto adicionado ao carrinho com sucesso!");
	}

    //verificar parametro disso
    public void itensNoCarrinho(produtos[], carrinhos[]){
        int i;
        int idProduto;
        int quantidade;
        int valor;
        for(i=0; i<tamCarrinho; i++){ //saber tamanho do carrinho
            for(i=0; i<tamProduto; i++){ //saber tamanho do produto
                if(produtos[i].idProduto==carrinhos[i].idProduto){
                    //achou os iguais, agora manda para o id carrinho
                }
            }
        }
        //quando finalizar printar e exibir tudo e calcular o valor final
    }
}

}