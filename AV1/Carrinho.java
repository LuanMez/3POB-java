import java.util.ArrayList;

public class Carrinho {
    private ArrayList<ItemCarrinho> itens = new ArrayList<>();

    public void adicionarItem(Produto produto, int quantidade) {
        ItemCarrinho item = new ItemCarrinho(produto, quantidade);
        itens.add(item);
    }

    public void listarItens() {
        if (itens.isEmpty()) {
            System.out.println("Carrinho vazio.");
        } else {
            System.out.println("Itens no carrinho:");
            for (ItemCarrinho item : itens) {
                System.out.println(item);
            }
        }
    }
}
