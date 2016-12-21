package avaliacao2112;

import java.util.Random;
import java.util.Scanner;

public class Exercicio01 {

	public Exercicio01() {
		// TODO Auto-generated constructor stub
		solucao01();
	}
	
	public static void solucao01(){
	
		char[] caracter = new char[5];
	    
	    int cont=0;
	    Scanner n = new Scanner(System.in);
	    char carac=' ';
	    
	    System.out.println("Introduza 5 caracteres: ");
	    
	    for(int i=0; i<caracter.length;i++){
	        carac=n.nextLine().charAt(0);
	        caracter[i]=carac;
	        if(carac>47&&carac<57){
	            cont++;
	        }
	    }
	    
	    /*for(int i=0; i<caracter.length;i++){
	        System.out.print(caracter[i]);
	    }*/
	    
	    System.out.println("Foram introduzidos "+cont+" caracter entre o 0 e 9");
	    
	    } 
		
	}


