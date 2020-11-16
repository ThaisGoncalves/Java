package exercicio;

public class Vendedor extends Pessoa {
	private double valorVendas;
	private double comissao;

	public Vendedor(String nome, String endereco, String cpf, int telefone, int idade) {
		super(nome, endereco, cpf, telefone, idade);
		// TODO Auto-generated constructor stub
	}

	public void imprimirInfo() {
		System.out.println("\nNome do vendedor(a): " + getNome() + "\nCPF: " + getCpf() + "\nIdade: " + getIdade()
				+ "\nTelefone: " + getTelefone() + "\nEndereço: " + getEndereco() + "\nValor Vendas: "
				+ getValorVendas() + "\nComissão: " + getComissao() + "%");
	}

	public void salarioTotal() {
		double salarioTotal = valorVendas + (valorVendas * comissao / 100);
		System.out.println("O salário total é = " + salarioTotal);
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
}
