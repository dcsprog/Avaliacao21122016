package avaliacao2112;

import java.util.Scanner;

public class Exercicio06 {

	public Exercicio06() {
		// TODO Auto-generated constructor stub
		solucao06();
	}

	public static void solucao06(){
		int num=0, cont=0, contp=0;
		boolean verf=true;
		Scanner n = new Scanner(System.in);
		
	
		do{	
			System.out.println("Introduza um numo primo: ");
			num=n.nextInt();
			
			
			
			for(int i=1;i<=num;i++)
			{
				for(int j=2;j<i;j++)
				{
					if((i%j)==0){
						contp++;
					}	
				}
				if(contp<=2){
						cont++;
						System.out.println(i);
						contp=0;
			   }
			}
			
			verf=false;
			
			
		}while(verf);
		
		
	}
	
}








