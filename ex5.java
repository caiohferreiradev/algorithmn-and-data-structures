
//Author: Caio Henrique Azevedo Ferreira
// 12/04/2020
//Função: Algoritmo para verificar se número é primo

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
		Scanner teclado = new Scanner(System.in);
		
		int num = 0, aux=0;
		
		for(int i = 0; i < 5; i++){
		
		System.out.print("Número = ");
		    num = teclado.nextInt();
		    
		    aux = num;
		    
		    if(num % aux == 1 || num / 1 == num && num % 2 != 0){
		        
		        System.out.println(num+" É UM NÚMERO PRIMO QUE É DIVISÍVEL POR 1 e "+num);
		        
		    }else{
		        
		        System.out.println(num+" NÃO É UM NÚMERO PRIMO POIS APESAR DE SER DIVISÍVEL POR 1 E ELE MESMO, POSSUI OUTROS DIVISORES.");
		    }
		    
		}
		    
		
		
		teclado.close();
	}
}