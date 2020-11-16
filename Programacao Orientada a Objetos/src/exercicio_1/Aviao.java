package exercicio_1;

public class Aviao {

	private String modeloAviao;
	private String corAviao;
	private String tamanhoAviao;

	public Aviao(String modelo, String cor, String tamanho) {
		modeloAviao = modelo;
		corAviao = cor;
		tamanhoAviao = tamanho;
	}

	public String getdadosAviao() {
		String dadosAviao = modeloAviao + ", " + corAviao + ", " + tamanhoAviao;
		return dadosAviao;
	}
}
