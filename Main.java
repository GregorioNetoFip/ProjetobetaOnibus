package Projeto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Usuario> usuarios = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao aplicativo de Ônibus Escolar!");
        System.out.println("==========================================");

        while (true) {
            System.out.println("1. Fazer login");
            System.out.println("2. Fazer cadastro");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
            case 1:
                System.out.print("Digite o login: ");
                String login = scanner.next();
                System.out.print("Digite a senha: ");
                String senha = scanner.next();

                boolean encontrado = false;
                for (Usuario usuario : usuarios) {
                    if (usuario.verificarCadastro(login, senha)) {
                        encontrado = true;
                        System.out.println("Login realizado com sucesso!");
                        System.out.println("Bem-vindo, " + usuario.getNome());
                        
                        
                        if (usuario instanceof Estudante) {
                            Estudante estudante = (Estudante) usuario;
                            System.out.println("Gerenciando vaga no ônibus...");
                            System.out.print("Deseja adicionar ou remover a vaga? (A/R): ");
                            String opcaoVaga = scanner.next();

                            if (opcaoVaga.equalsIgnoreCase("A")) {
                                estudante.gerenciarVaga(onibus, true);
                                System.out.println("Vaga adicionada com sucesso!");
                            } else if (opcaoVaga.equalsIgnoreCase("R")) {
                                estudante.gerenciarVaga(onibus, false);
                                System.out.println("Vaga removida com sucesso!");
                            } else {
                                System.out.println("Opção inválida.");
                            }
                        } else if (usuario instanceof Motorista) {
                            Motorista motorista = (Motorista) usuario;
                            System.out.println("Gerenciando estudantes no ônibus...");
                            // ...
                        } else if (usuario instanceof Coordenador) {
                            Coordenador coordenador = (Coordenador) usuario;
                            System.out.println("Gerenciando ônibus...");
                            // ...
                        }

                        break;
                    }
                    }
                }

                if (!encontrado) {
                    System.out.println("Login ou senha incorretos. Por favor, tente novamente.");
                }
            case 2:
                System.out.print("Digite o nome: ");
                String nome = scanner.next();
                System.out.print("Digite a idade: ");
                int idade = scanner.nextInt();
                System.out.print("Digite o CPF: ");
                double cpf = scanner.nextDouble();
                System.out.print("Digite o sexo: ");
                String sexo = scanner.next();
                System.out.print("Digite o login: ");
                String login2 = scanner.next();
                System.out.print("Digite a senha: ");
                String senha2 = scanner.next();

                Usuario usuario = new Usuario(nome, idade, cpf, sexo);
                usuario.fazerCadastro(login2, senha2);
                usuarios.add(usuario);

                System.out.println("Cadastro realizado com sucesso!");
            case 3:
                System.out.println("Obrigado por usar o aplicativo. Até logo!");
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}