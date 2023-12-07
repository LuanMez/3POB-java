public class Cama {
    private int id;
    private String codigoCama;
    private boolean ehBeliche;
    private String posicao;
    private String descricao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoCama() {
        return codigoCama;
    }

    public void setCodigoCama(String codigoCama) {
        this.codigoCama = codigoCama;
    }

    public boolean isEhBeliche() {
        return ehBeliche;
    }

    public void setEhBeliche(boolean ehBeliche) {
        this.ehBeliche = ehBeliche;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Método para validar dados da cama
    public boolean validarCama() {
        return validaCodigoCama() && validaDescricao();
        // Adicione outras validações necessárias para os atributos restantes
    }

    private boolean validaCodigoCama() {
        return codigoCama != null && !codigoCama.trim().isEmpty();
    }

    private boolean validaDescricao() {
        return descricao != null && !descricao.trim().isEmpty();
    }
}