package ex_1;

public class Pregui�a extends Animal {
	
	private String subirArvores;

	public Pregui�a ()
	{	
		
	}
	
	public String getNome() {
		return "Pregui�a: " + super.getNome() + "\nIdade: " + super.getIdade() + "\nSom: " + super.getSom() + "\nA��o: " + subirArvores;
	}
	//getters and setters 
	public String getCorrer() {
		return subirArvores;
	}

	public void setCorrer(String correr) {
		this.subirArvores=subirArvores;
	}
}
