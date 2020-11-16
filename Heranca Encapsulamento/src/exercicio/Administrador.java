package exercicio;

public class Administrador extends Pessoa {
	private double estadias;
	private double viagens;

	public Administrador(String nome, String endereco, String cpf, int telefone, int idade) {
		super(nome, endereco, cpf, telefone, idade);
		// TODO Auto-generated constructor stub
	}

	public void imprimirInfo() {
		System.out.println("\nNome do administrador: " + getNome() + "\nCPF: " + getCpf() + "\nIdade: " + getIdade()
				+ "\nTelefone: " + getTelefone() + "\nEndereço: " + getEndereco());
	}

	public void totalAjuda() {
		double ajudaDeCustos = estadias + viagens;
		System.out.println("Ajuda de Custos: " + ajudaDeCustos);
	}

	public double getEstadias() {
		return estadias;
	}

	public void setEstadias(double estadias) {
		this.estadias = estadias;
	}

	public double getViagens() {
		return viagens;
	}

	public void setViagens(double viagens) {
		this.viagens = viagens;
	}
}
