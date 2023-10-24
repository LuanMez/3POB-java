public class ItemCarrinho {
    private Produto produto;
    private int quantidade;

    public ItemCarrinho(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return produto.getNome() + " (ID: " + produto.getIdProduto() + ") - Quantidade: " + quantidade +
                " - Preco de uma unidade: " + produto.getPreco() + " - Preco total: " + (quantidade * produto.getPreco());
    }
}
