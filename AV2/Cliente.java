import java.util.Date;

public class Cliente {
    private int id;
    private String nome;
    private String endereco;
    private String postalCode;
    private String pais;
    private String cpf;
    private String passaporte;
    private String email;
    private Date dataNascimento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

    public String getPassaporte() {
        return passaporte;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean validarCliente() {
        return validaNome() && validaEndereco() && validaPostalCode() && validaPais()
                && validaCPF() && validaPassaporte() && validaEmail() && validaDataNascimento();
    }

    private boolean validaNome() {
        return nome != null && !nome.trim().isEmpty();
    }

    private boolean validaEndereco() {
        return endereco != null && !endereco.trim().isEmpty();
    }

    private boolean validaPostalCode() {
        return postalCode != null && !postalCode.trim().isEmpty();
    }

    private boolean validaPais() {
        return pais != null && !pais.trim().isEmpty();
    }

    private boolean validaCPF() {
        return cpf != null && cpf.matches("\\d{11}");
    }

    private boolean validaPassaporte() {
        return passaporte != null && !passaporte.trim().isEmpty();
    }

    private boolean validaEmail() {
        return email != null && email.matches("\\b[\\w\\.-]+@[\\w\\.-]+\\.\\w{2,4}\\b");
    }

    private boolean validaDataNascimento() {
        return dataNascimento != null && dataNascimento.before(new Date());
    }
}