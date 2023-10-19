public class itensCarrinho {
    //ver isso aqui
    private int idProduto;
	private int quantidade;
    private float preco;

    public Carrinho(int idProduto, int quantidade, float preco) {
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.preco = preco;
        
    }

    public int getIdProduto() {
		return idProduto;
	}

    public void setIdProduto(int idProduto){
        this.idProduto = idProduto;
    }

	public int getQuantidade() {
		return quantidade;
	}

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

}
