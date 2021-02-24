
//Author: Caio Henrique Azevedo Ferreira
//Data: 30/05/2020
//Função: 

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner teclado = new Scanner(System.in);
	    
	    System.out.println("Digite os valores = ");
		
		int NUMEROS[] = new int [10], divisiveis=0;
		
		for(int i = 0; i < 10; i++){
		    
		    NUMEROS[i] = teclado.nextInt();
		}
		
		System.out.print("Valores informados = ");
		
		for(int x = 0; x < 10; x++){
		    
		    System.out.print(NUMEROS[x]+" ");
		    
		}
		
		System.out.print("Números impressos = ");
		
		for(int y = 0; y < 10; y++){
		        
		        System.out.print(Math.pow(NUMEROS[y],2)+" ");
		}
		
		teclado.close();
	}
}
