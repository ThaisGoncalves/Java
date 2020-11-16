package exercicio_2;

public class Clientes {
	private String nomeCliente;
	private String genCliente;
	private String cidadeCliente;

	public Clientes(String nome, String gen, String cidade) {
		nomeCliente = nome;
		genCliente = gen;
		cidadeCliente = cidade;
	}

	public String getdadosClientes() {
		String dadosClientes = nomeCliente + ", " + genCliente + ", " + cidadeCliente;
		return dadosClientes;
	}
}
