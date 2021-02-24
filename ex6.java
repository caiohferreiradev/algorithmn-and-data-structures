
//Author: Caio Henrique Azevedo Ferreira
//Data: 30/03/2020
//Função: Ler informações de funcionários de uma empresa com flag para finalizar

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner teclado = new Scanner(System.in);
		
		double altura=0, peso=0, quantidadePessoas=0, quantidadeMulheres=0, mediaAlturaHomens=0, mediaHomens=0, mulheresPesoMenor=0, aux=0;
		String sexo = " ";
		
		System.out.println("Flag de parada = 0 ");
		
		do{
		    
		    System.out.print("Altura = ");
		    altura = teclado.nextDouble();
		    
		    System.out.print("Peso = ");
		    peso = teclado.nextDouble();
		    
		    System.out.print("Sexo (M/F) = ");
		    sexo = teclado.next();
		    
		    if(sexo.equalsIgnoreCase("M")){
		        
		        aux++;
		        mediaAlturaHomens += altura;
		        mediaHomens = (mediaAlturaHomens / aux);
		        
		    }else if(sexo.equalsIgnoreCase("F")){
		        
		        quantidadeMulheres++;
		         
		         if(peso < 60){
		             mulheresPesoMenor++;
		         }
		    }
		    
		    quantidadePessoas++;
		    
		}while(altura != 0 || peso != 0);
		
		System.out.println("Total de pessoas pesquisadas = "+(quantidadePessoas - 1));
		System.out.println("Quantidade de mulheres = "+quantidadeMulheres);
		System.out.println("Altura média dos homens = "+mediaHomens);
		System.out.println("Quantidade de mulheres com peso inferior a 60 = "+mulheresPesoMenor);
		
		teclado.close();
	}
}
