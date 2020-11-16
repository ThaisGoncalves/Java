package ex_1;

public class Cachorro extends Animal{
	
	private String correr;

	public Cachorro ()
	{	
		
	}
	
	public String getNome() {
		return "Cachorro: " + super.getNome() + "\nIdade: " + super.getIdade() + "\nSom: " + super.getSom() + "\nAção: " + this.getCorrer();
	}
	//getters and setters 
	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
}
