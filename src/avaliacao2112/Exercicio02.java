package avaliacao2112;

import java.util.Random;
import java.util.Scanner;

public class Exercicio02 {

	public Exercicio02() {
		// TODO Auto-generated constructor stub
		solucao02();
	}
	
	 public static int aleatorio(int min, int max){
	        Random rand = new Random();
	        return rand.nextInt((10- 0)+1)+0;
	    }
	
	
	public static void solucao02(){
		
		
	        int num1=0, cont=0;
	        int rand = aleatorio(10,0);
	        Scanner n = new Scanner(System.in);
	        boolean jogo=true;
	        char opc=' ';
	        do{
	            
	            System.out.println("Escolha uma opcao para o jogo Somo e Desce:\n\n"
	                    + "numero maior -->  c \n\nnumero menor --> b\n\n");
	            
	            
	            System.out.println(num1);
	            opc=n.nextLine().charAt(0);
	        
	            int ale;
	            do{
	                ale=aleatorio(10,0);
	            }while(ale==rand);
	            
	            switch(opc){
	                case 'c':
	                    if(ale<rand){
	                        System.out.println("Acertou...");
	                        cont++;
	                    }else {
	                        System.out.println("Sorry, tente outra vez");
	                        jogo=false;
	                       
	                    }
	                    break;
	                case 'b':
	                    if(ale>rand){
	                        System.out.println("Acertou...");
	                        cont++;
	                    }else {
	                        System.out.println("Sorry, tente outra vez");
	                        jogo=false;
	                       
	                    }
	                    break;
	            }
	            
	        
	        
	        
	        }while(jogo);
	        System.out.println("Voce consegui acertar "+cont+" vezes....");
	        
	    }
	    
	   
		
	}
	


