package avaliacao2112;

public class Exercicio05 {

	public Exercicio05() {
		// TODO Auto-generated constructor stub
		solucao05();
	}
	
	public static void solucao05(){
		
		int[] valores = new int[3];
		
		valores[0]=5;
		valores[1]=2;
		valores[2]=7;
		
		int produto=1;
		
		for(int i=0; i<valores.length; i++){
			produto*=valores[i];
		}
		
		System.out.println("O resultado do produto e "+produto);
	}

}
