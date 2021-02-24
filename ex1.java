
//Author: Caio Henrique Azevedo Ferreira
//Data: 15/04/2020
//Função: Algoritmo que calcula tabuada de número digitado pelo usuário

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num, aux = 0, resultado = 0;
		
		System.out.println("Número = ");
		num = teclado.nextInt();
		
		for(int i = 1; i < 10; i++){
		    
		    aux = i;
		    
		    resultado = aux * num;
		    
		    System.out.println(aux+" x "+num+" = "+resultado);
		}
		
		teclado.close();
	}
}
