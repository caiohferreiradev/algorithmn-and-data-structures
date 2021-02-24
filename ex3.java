
//Author: Caio Henrique Azevedo Ferreira
//Data: 17/04/2020
//Função: Algoritmo que imprime quadrado de números com para (for)

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int aux=0, a=0,num=0,x=0;
		
		aux = 1;
		
		for(int i = 0; i < 11; i++){
		    
		    if(i == 0){
		        aux = aux++;
		        System.out.println(aux);
		        
		    }else{
		        aux = (aux++) * 2;
		        
		        System.out.println(aux);
		    }
		    
		}
		
		teclado.close();
	}
}
