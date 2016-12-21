package aulas;

public class ProvaOral extends MomentoAvaliacao{

	public ProvaOral() {
		// TODO Auto-generated constructor stub
	}
	

	public ProvaOral(int fluencia, int dominioMateria) {
		super();
		this.fluencia = fluencia;
		this.dominioMateria = dominioMateria;
	}


	private int fluencia;
	public int dominioMateria;
	
	public int getFluencia() {
		return fluencia;
	}


	public void setFluencia(int novaFluencia) {
		this.fluencia = novaFluencia;
	}


	
	
}
