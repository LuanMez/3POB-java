public class Quarto {
    private int id;
    private String nomeQuarto;
    private int qtdeCamas;
    private boolean temBanheiro;
    private String descricao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeQuarto() {
        return nomeQuarto;
    }

    public void setNomeQuarto(String nomeQuarto) {
        this.nomeQuarto = nomeQuarto;
    }

    public int getQtdeCamas() {
        return qtdeCamas;
    }

    public void setQtdeCamas(int qtdeCamas) {
        this.qtdeCamas = qtdeCamas;
    }

    public boolean isTemBanheiro() {
        return temBanheiro;
    }

    public void setTemBanheiro(boolean temBanheiro) {
        this.temBanheiro = temBanheiro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Método para validar dados do quarto
    public boolean validarQuarto() {
        return validaNomeQuarto() && validaQtdeCamas() && validaDescricao();
        // Adicione outras validações necessárias para os atributos restantes
    }

    private boolean validaNomeQuarto() {
        return nomeQuarto != null && !nomeQuarto.trim().isEmpty();
    }

    private boolean validaQtdeCamas() {
        return qtdeCamas > 0; // Verifica se a quantidade de camas é maior que zero
    }

    private boolean validaDescricao() {
        return descricao != null && !descricao.trim().isEmpty();
    }
}