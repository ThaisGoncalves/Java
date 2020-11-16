package exercicio;

public class Fornecedor extends Pessoa {

	public Fornecedor(String nome, String endereco, String cpf, int telefone, int idade) {
		super(nome, endereco, cpf, telefone, idade);
		// TODO Auto-generated constructor stub
	}

	private double valorCredito;
	private double valorDivida;

	public void imprimirInfo() {
		System.out.println("\nNome do empregado: " + getNome() + "\n" + "CPF: " + getClass() + "\n" + "Idade: "
				+ getNome() + "\n" + "Telefone: " + getTelefone() + "\n" + "Endereço: " + getEndereco() + "\n" + "\n"
				+ "Valor crédito: " + valorCredito + "\n" + "Valor dívida: " + valorDivida);
	}

	public void obterSaldo() {
		double diferencasaldo = valorCredito - valorDivida;
		System.out.println("O saldo referente ao fornecedor é igual a: " + diferencasaldo);
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
}
