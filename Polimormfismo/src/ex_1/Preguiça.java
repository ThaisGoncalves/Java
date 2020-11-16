package ex_1;

public class Preguiça extends Animal {
	
	private String subirArvores;

	public Preguiça ()
	{	
		
	}
	
	public String getNome() {
		return "Preguiça: " + super.getNome() + "\nIdade: " + super.getIdade() + "\nSom: " + super.getSom() + "\nAção: " + subirArvores;
	}
	//getters and setters 
	public String getCorrer() {
		return subirArvores;
	}

	public void setCorrer(String correr) {
		this.subirArvores=subirArvores;
	}
}
