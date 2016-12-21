package aulas;

public class Exame {

	public Exame() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Exame(Questao questoes) {
		super();
		this.questoes = questoes;
	}

	private Questao questoes;

	public Questao getQuestoes() {
		return questoes;
	}



	public void setQuestoes(Questao questoes) {
		this.questoes = questoes;
	}
	
	
}
