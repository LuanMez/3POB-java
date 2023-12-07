import java.util.Date;

public class Reserva {
    private int id;
    private int idQuarto;
    private int idCama;
    private int idCliente;
    private Date dataEntrada;
    private Date dataSaida;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
    }

    public int getIdCama() {
        return idCama;
    }

    public void setIdCama(int idCama) {
        this.idCama = idCama;
    }

    public int getCliente() {
        return idCliente;
    }

    public void setCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    // Método para validar dados da reserva
    public boolean validarReserva() {
        return validaIdQuarto() && validaIdCama() && validaIdCliente() && validaDatas();
        // Adicione outras validações necessárias para os atributos restantes
    }

    private boolean validaIdQuarto() {
        return idQuarto >= 0; // Verifica se o ID do quarto é válido (maior que zero)
    }

    private boolean validaIdCama() {
        return idCama >= 0; // Verifica se o ID da cama é válido (maior que zero)
    }

    private boolean validaIdCliente() {
        return idCliente >= 0; // Verifica se o ID do cliente é válido (maior que zero)
    }

    private boolean validaDatas() {
        return dataEntrada != null && dataSaida != null && dataEntrada.before(dataSaida);
        // Verifica se as datas de entrada e saída foram preenchidas e se a data de
        // entrada é anterior à data de saída
    }
}
