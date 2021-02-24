
//Author: Caio Henrique Azevedo Ferreira
//Data: 30/03/2020
//Função: Calcular o total de pessoas contaminadas de acordo com dias, meses e anos

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner teclado = new Scanner(System.in);
		
		String nomeCidade = " ", cidadeMenorPopulacaoNome = " ", flag = "Zimbabue de Minas";
		int eleitoresMedia = 0, menorPopulacao=0, populacao = 0, eleitores=0, mulheres=0, homens=0, numeroCidades=0, populacaoEstado=0, maisMulheres=0, homensTodasCidades=0, mediaHomens, cidadeMenorPopulacao=0;
		double percentualEleitores=0;
		
		System.out.println("Para finalizar a leitura, digite: Zimbabue de Minas");
		
		do{
		
		System.out.print("Nome da cidade = ");
		nomeCidade = teclado.nextLine();
		
		System.out.print("População = ");
		populacao = teclado.nextInt();
		
		System.out.print("Eleitores = ");
		eleitores = teclado.nextInt();
		
		System.out.print("Quantidade de homens = ");
		homens = teclado.nextInt();
		
		homensTodasCidades += homens;
		
		
		System.out.print("Quantidade de mulheres = ");
		mulheres = teclado.nextInt();
		
		if((homens + mulheres) != populacao){
		    System.out.println("Número de homens e mulheres é diferente da população total da cidade. ");
		}
		
		if(mulheres > homens){
		    maisMulheres++;
		}
		
		numeroCidades++;
		populacaoEstado += populacao;
		eleitoresMedia = += eleitores;
		percentualEleitores = ((eleitoresMedia / populacaoEstado) * 100);
		
		if(numeroCidades == 1 || populacao < menorPopulacao){
		    menorPopulacao = populacao;
		    cidadeMenorPopulacaoNome = nomeCidade;
		}
		
		}while(nomeCidade != flag);
		
		//CAMPO DE IMPRESSÕES
		
		mediaHomens = (homensTodasCidades / numeroCidades);
		
		System.out.println("Cidades totais do estado = "+numeroCidades);
		System.out.println("População total do estado = "+populacaoEstado);
		System.out.println("Percentual de eleitores = "+percentualEleitores+"%");
		System.out.println("Número e cidades com mais mulheres que homens = "+maisMulheres);
		System.out.println("Média de homens nas cidades consultadas = "+mediaHomens);
		System.out.println("Cidade com menor população do estado = "+cidadeMenorPopulacaoNome);
		
		
		teclado.close();
	}
}
