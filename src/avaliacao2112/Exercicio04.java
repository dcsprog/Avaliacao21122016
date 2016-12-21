package avaliacao2112;

import java.util.Scanner;

public class Exercicio04 {

	public Exercicio04() {
		// TODO Auto-generated constructor stub
		solucao04();
	}
	
	public static void solucao04(){
		
		char opc=' ';
		boolean verf=true;
		Scanner n = new Scanner(System.in);
		int cont=0;
		double bilh=7.5, somaC=0,somaS=0, camis=14;
		
		do{
			
			System.out.println("--------  Bem vindo ao jogo do ano  ---------");
			System.out.println(" click --> c  - torcedor com camisola oficial ---");
			System.out.println(" click --> n  - torcedor com camisola nao oficial ---");
			
			
			opc=n.nextLine().charAt(0);
			
			switch(opc){
				case'c':
					cont++;
					
					somaC+=bilh+camis;
					break;
				case 'n':
					cont++;
					
					somaS+=bilh;
					break;
				case 's':
					verf=false;
					break;
				default:
					System.out.println("O programa vai ser encerrado....");
			}
			
			
			System.out.println("Foram vendidos "+cont+" bilhetes");
			System.out.println("O balanco foi de "+somaC+" camisolas vendidas");
			System.out.println("O balanco foi de "+(somaS+somaC)+" bilhetes vendidos");
			
		}while(verf);
		
	}

}
