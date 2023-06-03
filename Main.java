package ProjetoOnibus;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Onibus> onibusList = new ArrayList<>();
        List<Usuario> usuarios = new ArrayList<>();
        Coordenador coordenador = new Coordenador("Coordenador", 40, "Masculino", 123456789, "admin", "123456", 987654321);
        Motorista motorista1 = new Motorista("motorista", 40, "Masculino",12345678, "moto","123456", 987788900);
       
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("---------- Menu ----------");
            System.out.println("1. Cadastro");
            System.out.println("2. Fazer Login");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("---- Cadastro ----");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Sexo: ");
                    String sexo = scanner.nextLine();
                    System.out.print("CPF: ");
                    double cpf = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Login: ");
                    String login = scanner.nextLine();
                    System.out.print("Senha: ");
                    String senha = scanner.nextLine();

                    Usuario usuario = new Usuario(nome, idade, sexo, cpf, login, senha);
                    usuarios.add(usuario);
                    System.out.println("Usuário cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("---- Fazer Login ----");
                    System.out.print("Login: ");
                    String loginInput = scanner.nextLine();
                    System.out.print("Senha: ");
                    String senhaInput = scanner.nextLine();

                    boolean loggedIn = false;
                    Usuario usuarioLogado = null;

                    for (Usuario user : usuarios) {
                        if (user.verificarCadastro(loginInput, senhaInput)) {
                            loggedIn = true;
                            usuarioLogado = user;
                            break;
                        }
                    }

                    if (coordenador.verificarCadastro(loginInput, senhaInput)) {
                        System.out.println("Login realizado com sucesso!");

                        while (true) {
                            System.out.println("\nMenu Coordenador:");
                            System.out.println("1. Cadastrar ônibus");
                            System.out.println("2. Cadastrar motorista");
                            System.out.println("0. Sair");
                            System.out.print("Escolha uma opção: ");
                            int opcaoCoordenador = scanner.nextInt();

                            if (opcaoCoordenador == 0) {
                                break;
                            } else if (opcaoCoordenador == 1) {
                                coordenador.cadastrarOnibus();
                            } else if (opcaoCoordenador == 2) {
                                coordenador.cadastrarMotorista();
                            {
                                System.out.println("Opção inválida!");
                            }
                        }
                    
                    }} else {
                        System.out.println("Login ou senha incorretos!");
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 3);
    }
}