package ProjetoOnibus;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Coordenador extends Usuario {
	 private double cpnj;
	    private List<Onibus> onibusList;
	    private List<Motorista> motoristaList;

	    public Coordenador(String nome, int idade, String sexo, double cpf, String login, String senha, double cpnj) {
	        super(nome, idade, sexo, cpf, login, senha);
	        this.cpnj = cpnj;
	        this.onibusList = new ArrayList<>();
	        this.motoristaList = new ArrayList<>();
	    }

	    public void cadastrarOnibus() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Número do ônibus: ");
	        int numero = scanner.nextInt();
	        System.out.print("Quantidade de estudantes: ");
	        int quantidadeEstudante = scanner.nextInt();

	        Onibus onibus = new Onibus(numero, quantidadeEstudante);
	        onibusList.add(onibus);

	        System.out.println("Ônibus cadastrado com sucesso!");
	    }

	    public void cadastrarMotorista() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nome do motorista: ");
	        String nome = scanner.nextLine();
	        System.out.print("Idade do motorista: ");
	        int idade = scanner.nextInt();
	        
	        System.out.print("Sexo do motorista: ");
	        String sexo = scanner.next();
	        
	        System.out.print("CPF do motorista: ");
	        double cpf = scanner.nextDouble();
	        
	        System.out.print("Login do motorista: ");
	        String login = scanner.next();
	        System.out.print("Senha do motorista: ");
	        String senha = scanner.next();
	        System.out.print("CPNJ do motorista: ");
	        double cpnj = scanner.nextDouble();

	        Motorista motorista = new Motorista(nome, idade, sexo, cpf, login, senha, cpnj);
	        motoristaList.add(motorista);

	        System.out.println("Motorista cadastrado com sucesso!");
	    }
}