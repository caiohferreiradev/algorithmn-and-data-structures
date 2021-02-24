
//Author: Caio Henrique Azevedo Ferreira
//Função: Exibir tabela com os pesos variando de 60 a 100kg
//Data: 19/04/2020

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double altura=0, IMC=0, peso=0, novaAltura=0;
		String situacao = " ";
		
	    System.out.print("Altura da pessoa = ");
	    altura = teclado.nextDouble();
	    
	    if(altura > 100){
	        
	        novaAltura = (altura / 100);
	        
	        for(int i = 60; i <= 100; i++){
	        
	        peso = i;
	        
	        IMC = peso / Math.pow(novaAltura,2);
	        
	        if(IMC < 20){
	            situacao = "ABAIXO DO PESO";
	            System.out.println("Peso    | IMC ");
	            System.out.printf(peso+"    |  %.2f %n",IMC);
	            System.out.println("Situação = "+situacao);
	        }else if(IMC >= 20 && IMC <= 25){
	            situacao = "PESO IDEAL";
	            System.out.println("Peso    | IMC ");
	            System.out.printf(peso+"    |  %.2f %n",IMC);
	            System.out.println("Situação = "+situacao);
	        }else if(IMC > 25){
	            situacao = "ACIMA DO PESO";
	            System.out.println("Peso    | IMC ");
	            System.out.printf(peso+"    |  %.2f %n",IMC);
	            System.out.println("Situação = "+situacao);
	        }
	     
	    }
	        System.exit(0);
	    }
	    
	    for(int i = 60; i <= 100; i++){
	        
	        peso = i;
	        
	        IMC = peso / Math.pow(altura,2);
	        
	        if(IMC < 20){
	            situacao = "ABAIXO DO PESO";
	            System.out.println("Peso    | IMC ");
	            System.out.printf(peso+"    |  %.2f %n",IMC);
	            System.out.println("Situação = "+situacao);
	        }else if(IMC >= 20 && IMC <= 25){
	            situacao = "PESO IDEAL";
	            System.out.println("Peso    | IMC ");
	            System.out.printf(peso+"    |  %.2f %n",IMC);
	            System.out.println("Situação = "+situacao);
	        }else if(IMC > 25){
	            situacao = "ACIMA DO PESO";
	            System.out.println("Peso    | IMC ");
	            System.out.printf(peso+"    |  %.2f %n",IMC);
	            System.out.println("Situação = "+situacao);
	        }
	        
	    }
		
		teclado.close();
	}
}
