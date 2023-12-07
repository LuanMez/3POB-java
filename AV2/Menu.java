import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Menu {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Cama> camas = new ArrayList<>();
    private ArrayList<Quarto> quartos = new ArrayList<>();
    private ArrayList<Reserva> reservas = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private Scanner scanner = new Scanner(System.in);
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public void processamento() {
        int opcao;
        int opcao2;
        do {
            System.out.println("1- Menu do Cliente");
            System.out.println("2- Menu do Quarto");
            System.out.println("3- Menu da Cama");
            System.out.println("4- Menu da Reserva");
            System.out.println("0- Para Finalizar");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("1- Incluir Cliente");
                    System.out.println("2- Alterar Cliente");
                    System.out.println("3- Excluir Cliente");
                    System.out.println("4- Listar Cliente");
                    opcao2 = sc.nextInt();
                    switch (opcao2) {
                        case 1:
                            incluirCliente();
                            break;
                        case 2:
                            alterarCliente();
                            break;
                        case 3:
                            excluirCliente();
                            break;
                        case 4:
                            listarClientes();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1- Incluir Quarto");
                    System.out.println("2- Alterar Quarto");
                    System.out.println("3- Excluir Quarto");
                    System.out.println("4- Listar Quarto");
                    opcao2 = sc.nextInt();
                    switch (opcao2) {
                        case 1:
                            incluirQuarto();
                            break;
                        case 2:
                            alterarQuarto();
                            break;
                        case 3:
                            excluirQuarto();
                            break;
                        case 4:
                            listarQuartos();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1- Incluir Cama");
                    System.out.println("2- Alterar Cama");
                    System.out.println("3- Excluir Cama");
                    System.out.println("4- Listar Cama");
                    opcao2 = sc.nextInt();
                    switch (opcao2) {
                        case 1:
                            incluirCama();
                            break;
                        case 2:
                            alterarCama();
                            break;
                        case 3:
                            excluirCama();
                            break;
                        case 4:
                            listarCamas();
                            break;
                    }
                    break;
                case 4:
                    System.out.println("1- Incluir Reserva");
                    System.out.println("2- Alterar Reserva");
                    System.out.println("3- Excluir Reserva");
                    System.out.println("4- Listar reserva");
                    opcao2 = sc.nextInt();
                    switch (opcao2) {
                        case 1:
                            incluirReserva();
                            break;
                        case 2:
                            alterarReserva();
                            break;
                        case 3:
                            excluirReserva();
                            break;
                        case 4:
                            listarReservas();
                            break;
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);
    }

    public void incluirCama() {
        Cama cama = new Cama();
        System.out.println("Incluir nova Cama:");
        System.out.print("Código da Cama: ");
        cama.setCodigoCama(scanner.nextLine());
        System.out.print("É beliche? (true/false): ");
        cama.setEhBeliche(scanner.nextBoolean());
        scanner.nextLine();
        System.out.print("Posição: ");
        cama.setPosicao(scanner.nextLine());
        System.out.print("Descrição: ");
        cama.setDescricao(scanner.nextLine());

        if (cama.validarCama()) {
            camas.add(cama);
            System.out.println("Cama incluída com sucesso!");
        } else {
            System.out.println("Dados da cama inválidos.");
        }
    }

    public void excluirCama() {
        System.out.print("Digite o ID da cama para excluir: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        camas.removeIf(c -> c.getId() == id);
        System.out.println("Cama excluída com sucesso!");
    }

    public void alterarCama() {
        System.out.print("Digite o ID da cama para alterar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Cama cama : camas) {
            if (cama.getId() == id) {
                System.out.print("Novo código da Cama: ");
                cama.setCodigoCama(scanner.nextLine());
                System.out.print("É beliche? (true/false): ");
                cama.setEhBeliche(scanner.nextBoolean());
                scanner.nextLine();
                System.out.print("Nova posição: ");
                cama.setPosicao(scanner.nextLine());
                System.out.print("Nova descrição: ");
                cama.setDescricao(scanner.nextLine());

                if (cama.validarCama()) {
                    System.out.println("Cama alterada com sucesso!");
                } else {
                    System.out.println("Dados da cama inválidos.");
                }
                return;
            }
        }
        System.out.println("Cama não encontrada.");
    }

    public void listarCamas() {
        if (camas.isEmpty()) {
            System.out.println("Não tem camas.");
        } else {
            for (Cama cama : camas) {
                System.out.println("ID: " + cama.getId() + ", Código: " + cama.getCodigoCama() + ", Beliche: "
                        + cama.isEhBeliche() + ", Posição: " + cama.getPosicao() + ", Descrição: "
                        + cama.getDescricao());
            }
        }
    }

    public void incluirCliente() {
        Cliente cliente = new Cliente();
        System.out.println("Incluir novo Cliente:");
        System.out.print("Nome: ");
        cliente.setNome(scanner.nextLine());
        System.out.print("Endereço: ");
        cliente.setEndereco(scanner.nextLine());
        System.out.print("Código Postal: ");
        cliente.setPostalCode(scanner.nextLine());
        System.out.print("País: ");
        cliente.setPais(scanner.nextLine());
        System.out.print("CPF: ");
        cliente.setCpf(scanner.nextLine());
        System.out.print("Passaporte: ");
        cliente.setPassaporte(scanner.nextLine());
        System.out.print("Email: ");
        cliente.setEmail(scanner.nextLine());
        System.out.print("Data de Nascimento (dd/MM/yyyy): ");
        try {
            cliente.setDataNascimento(sdf.parse(scanner.nextLine()));
        } catch (Exception e) {
            System.out.println("Formato de data inválido.");
            return;
        }

        if (cliente.validarCliente()) {
            clientes.add(cliente);
            System.out.println("Cliente incluído com sucesso!");
        } else {
            System.out.println("Dados do cliente inválidos.");
        }
    }

    public void excluirCliente() {
        System.out.print("Digite o ID do cliente para excluir: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        clientes.removeIf(c -> c.getId() == id);
        System.out.println("Cliente excluído com sucesso!");
    }

    public void alterarCliente() {
        System.out.print("Digite o ID do cliente para alterar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                System.out.print("Novo nome: ");
                cliente.setNome(scanner.nextLine());
                System.out.print("Novo endereço: ");
                cliente.setEndereco(scanner.nextLine());
                System.out.print("Novo codigo postal: ");
                cliente.setPostalCode(scanner.nextLine());
                System.out.print("Novo Pais: ");
                cliente.setPais(scanner.nextLine());
                System.out.print("Novo cpf: ");
                cliente.setCpf(scanner.nextLine());
                System.out.print("Novo passaporte: ");
                cliente.setPassaporte(scanner.nextLine());
                System.out.print("Novo email: ");
                cliente.setEmail(scanner.nextLine());
                System.out.print("Nova data de nascimento (dd/MM/yyyy): ");
                String dataNascimentoStr = scanner.nextLine();
                try {
                    Date dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimentoStr);
                    cliente.setDataNascimento(dataNascimento);
                } catch (Exception e) {
                    System.out.println("Formato de data inválido.");
                    return;
                }

                if (cliente.validarCliente()) {
                    System.out.println("Cliente alterado com sucesso!");
                } else {
                    System.out.println("Dados do cliente inválidos.");
                }
                return;
            }
        }
        System.out.println("Cliente não encontrado.");
    }

    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Não tem clientes.");
        } else {
            for (Cliente cliente : clientes) {
                System.out.println(
                        "ID: " + cliente.getId() + ", Nome: " + cliente.getNome() + ", Endereço: "
                                + cliente.getEndereco()
                                + ", Código Postal: " + cliente.getPostalCode() + ", País: " + cliente.getPais()
                                + ", CPF: "
                                + cliente.getCpf() + ", Passaporte: " + cliente.getPassaporte() + ", Email: "
                                + cliente.getEmail() + ", Data de Nascimento: "
                                + sdf.format(cliente.getDataNascimento()));
            }
        }
    }

    public void incluirQuarto() {
        Quarto quarto = new Quarto();
        System.out.println("Incluir novo Quarto:");
        System.out.print("Nome do Quarto: ");
        quarto.setNomeQuarto(scanner.nextLine());
        System.out.print("Quantidade de Camas: ");
        quarto.setQtdeCamas(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Tem banheiro? (true/false): ");
        quarto.setTemBanheiro(scanner.nextBoolean());
        scanner.nextLine();
        System.out.print("Descrição: ");
        quarto.setDescricao(scanner.nextLine());

        if (quarto.validarQuarto()) {
            quartos.add(quarto);
            System.out.println("Quarto incluído com sucesso!");
        } else {
            System.out.println("Dados do quarto inválidos.");
        }
    }

    public void excluirQuarto() {
        System.out.print("Digite o ID do quarto para excluir: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        quartos.removeIf(q -> q.getId() == id);
        System.out.println("Quarto excluído com sucesso!");
    }

    public void alterarQuarto() {
        System.out.print("Digite o ID do quarto para alterar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Quarto quarto : quartos) {
            if (quarto.getId() == id) {
                System.out.print("Novo nome do Quarto: ");
                quarto.setNomeQuarto(scanner.nextLine());
                System.out.print("Nova quantidade de Camas: ");
                quarto.setQtdeCamas(scanner.nextInt());
                scanner.nextLine();
                System.out.print("Tem banheiro? (true/false): ");
                quarto.setTemBanheiro(scanner.nextBoolean());
                scanner.nextLine();
                System.out.print("Nova descrição: ");
                quarto.setDescricao(scanner.nextLine());

                if (quarto.validarQuarto()) {
                    System.out.println("Quarto alterado com sucesso!");
                } else {
                    System.out.println("Dados do quarto inválidos.");
                }
                return;
            }
        }
        System.out.println("Quarto não encontrado.");
    }

    public void listarQuartos() {
        if (quartos.isEmpty()) {
            System.out.println("Não tem quartos.");
        } else {
            for (Quarto quarto : quartos) {
                System.out.println(
                        "ID: " + quarto.getId() + ", Nome: " + quarto.getNomeQuarto() + ", Quantidade de Camas: "
                                + quarto.getQtdeCamas() + ", Tem Banheiro: " + quarto.isTemBanheiro() + ", Descrição: "
                                + quarto.getDescricao());
            }
        }
    }

    public void incluirReserva() {
        Reserva reserva = new Reserva();
        System.out.println("Incluir nova Reserva:");
        System.out.print("ID do Quarto: ");
        int idQuarto = scanner.nextInt();
        System.out.print("ID da Cama: ");
        int idCama = scanner.nextInt();
        System.out.print("ID do Cliente: ");
        int idCliente = scanner.nextInt();
        scanner.nextLine();

        // Verifica se os IDs existem nos arrays
        boolean quartoExiste = quartos.stream().anyMatch(q -> q.getId() == idQuarto);
        boolean camaExiste = camas.stream().anyMatch(c -> c.getId() == idCama);
        boolean clienteExiste = clientes.stream().anyMatch(cl -> cl.getId() == idCliente);

        if (!quartoExiste) {
            System.out.println("ID inválido.");
            return;
        }
        if (!camaExiste) {
            System.out.println("ID inválido.");
            return;
        }
        if (!clienteExiste) {
            System.out.println("ID inválido.");
            return;
        }

        reserva.setIdQuarto(idQuarto);
        reserva.setIdCama(idCama);
        reserva.setCliente(idCliente);

        System.out.print("Data de Entrada (dd/MM/yyyy HH:mm): ");
        try {
            reserva.setDataEntrada(sdf.parse(scanner.nextLine()));
        } catch (Exception e) {
            System.out.println("Formato de data inválido.");
            return;
        }
        System.out.print("Data de Saída (dd/MM/yyyy HH:mm): ");
        try {
            reserva.setDataSaida(sdf.parse(scanner.nextLine()));
        } catch (Exception e) {
            System.out.println("Formato de data inválido.");
            return;
        }

        if (reserva.validarReserva()) {
            reservas.add(reserva);
            System.out.println("Reserva incluída com sucesso!");
        } else {
            System.out.println("Dados da reserva inválidos.");
        }
    }

    public void excluirReserva() {
        System.out.print("Digite o ID da reserva para excluir: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        reservas.removeIf(r -> r.getId() == id);
        System.out.println("Reserva excluída com sucesso!");
    }

    public void alterarReserva() {
        System.out.print("Digite o ID da reserva para alterar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Reserva reserva : reservas) {
            if (reserva.getId() == id) {
                System.out.print("Novo ID do Quarto: ");
                reserva.setIdQuarto(scanner.nextInt());
                System.out.print("Novo ID da Cama: ");
                reserva.setIdCama(scanner.nextInt());
                System.out.print("Novo ID do Cliente: ");
                reserva.setCliente(scanner.nextInt());
                scanner.nextLine();
                System.out.print("Nova Data de Entrada (dd/MM/yyyy HH:mm): ");
                try {
                    reserva.setDataEntrada(sdf.parse(scanner.nextLine()));
                } catch (Exception e) {
                    System.out.println("Formato de data inválido.");
                    continue;
                }
                System.out.print("Nova Data de Saída (dd/MM/yyyy HH:mm): ");
                try {
                    reserva.setDataSaida(sdf.parse(scanner.nextLine()));
                } catch (Exception e) {
                    System.out.println("Formato de data inválido.");
                    continue;
                }

                if (reserva.validarReserva()) {
                    System.out.println("Reserva alterada com sucesso!");
                } else {
                    System.out.println("Dados da reserva inválidos.");
                }
                return;
            }
        }
        System.out.println("Reserva não encontrada.");
    }

    public void listarReservas() {
        if (reservas.isEmpty()) {
            System.out.println("Não tem reservas.");
        } else {
            for (Reserva reserva : reservas) {
                System.out.println("ID: " + reserva.getId() + ", ID do Quarto: " + reserva.getIdQuarto()
                        + ", ID da Cama: "
                        + reserva.getIdCama() + ", ID do Cliente: " + reserva.getCliente() + ", Data de Entrada: "
                        + sdf.format(reserva.getDataEntrada()) + ", Data de Saída: "
                        + sdf.format(reserva.getDataSaida()));
            }
        }
    }

}