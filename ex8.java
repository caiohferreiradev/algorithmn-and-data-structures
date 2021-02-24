
//Author: Caio Henrique Azevedo Ferreira
//Data: 30/03/2020
//Função: Imprimir multas do DETRAN na cidade

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner teclado = new Scanner(System.in);
		
		int dia=0, placa=0, pontos=0;
		double valorMulta=0, multaPrimeiraQuinzena=0, valorTotalMultas=0;
		
	    System.out.println("Para encerrar o algoritmo, digite: 99 em dia.");
		
		while(dia != 99){
		
		System.out.print("Dia = ");
		dia = teclado.nextInt();
		
		System.out.print("Placa = ");
		placa = teclado.nextInt();
		
		System.out.print("Pontos = ");
		pontos = teclado.nextInt();
		
		if(pontos == 3){
		    
		    valorMulta = 42;
		    
		}else if(pontos == 5){
		    
		    valorMulta = 108;
		}else if(pontos == 8){
		    
		    valorMulta = 479;
		    
		    if(dia < 15){
		        multaPrimeiraQuinzena++;
		    }
		}
		
		valorTotalMultas += valorMulta;
		
		System.out.println("=========================================================================================");
		System.out.println("Placa = "+placa+" Valor da multa = "+valorMulta);
		System.out.println("Quantidade de multas com pontuação 8 na primeira quinzena do mês = "+multaPrimeiraQuinzena);
		System.out.println("Valor total arrecadado com as multas = "+valorTotalMultas);
		System.out.println("=========================================================================================");
		    
		}
		
		teclado.close();
	}
}
