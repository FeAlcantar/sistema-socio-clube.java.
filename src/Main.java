import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SistemaSocios sistema = new SistemaSocios();

        int opcao;

        do {

            System.out.println("\n=== SISTEMA DE SÓCIOS ===");
            System.out.println("1 - Cadastrar Sócio");
            System.out.println("2 - Listar Sócios");
            System.out.println("3 - Remover sócio");
            System.out.println("4 - Buscar Sócio por CPF");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();

                    System.out.print("Plano (Bronze/Prata/Ouro): ");
                    String plano = scanner.nextLine();

                    System.out.println("Idade");
                    int idade = scanner.nextInt();
                    scanner.nextLine();


                    Socio socio = new Socio(nome, cpf, email, telefone, plano, idade);
                    sistema.cadastrarSocio(socio);
                    break;

                case 2:
                    sistema.listarSocios();
                    break;

                case 3:
                    System.out.println("Digite o CPF do sócio para remover: ");
                    String cpfRemover = scanner.nextLine();
                    sistema.removerSocio(cpfRemover);
                    break;

                case 4:
                    System.out.println("Digite o CPF do Sócio: ");
                    String cpfBusca = scanner.nextLine();

                    sistema.buscarSocio(cpfBusca);

                    break;

                 case 5:
                    System.out.println("Encerrando sistema...");
                    break;
                    
                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 5);

        scanner.close();
    }
}
