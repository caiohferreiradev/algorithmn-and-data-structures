
//Author: Caio Henrique Azevedo Ferreira
//Data: 01/06/2020
//Função: imprimir salário de projeto a partir de número de horas trabalhadas

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double valorHoraTrabalhada = 0, remuneracao = 0, mediaDeHorasTrabalhadas=0, maiorRemuneracao = 0, valorTotalFolha=0, mediaHoras = 0;
		String nome = " ", funcao = " ",nomeMaiorRemuneracao = " ", funcaoMaiorRemuneracao = " ";
		int quantidadeHorasTrabalhadas = 0, premioPorProdutitivade=0, flag = 0, ate100 = 0, ate500 = 0, maior500 = 0;
		
		System.out.println("Para finalizar o algoritmo, figite FIM em nome. ");
		
		while(nome.compareTo("FIM") != 0){
		
		System.out.print("Valor hora trabalhada = ");
		valorHoraTrabalhada = teclado.nextDouble();
		
		System.out.print("Nome = ");
		nome = teclado.next();
		
		System.out.print("Função = ");
		funcao = teclado.next();
		
		System.out.print("Quantidade de horas trabalhadas = ");
		quantidadeHorasTrabalhadas = teclado.nextInt();
		
		if(quantidadeHorasTrabalhadas < 100){
		    premioPorProdutitivade = 1000;
		    ate100++;
		}else if(quantidadeHorasTrabalhadas > 100 && quantidadeHorasTrabalhadas < 500){
		    premioPorProdutitivade = (10 * quantidadeHorasTrabalhadas);
		    ate500++;
		}else{
		    
		    while(quantidadeHorasTrabalhadas > 10){
		        quantidadeHorasTrabalhadas -= 10;
		        premioPorProdutitivade += 100;
		        maior500++;
		    }
		}
		
		remuneracao = (quantidadeHorasTrabalhadas * valorHoraTrabalhada) + premioPorProdutitivade;
		mediaHoras += quantidadeHorasTrabalhadas;
		mediaDeHorasTrabalhadas = mediaHoras / flag;
		flag++;
		valorTotalFolha += remuneracao;
		
		if(flag == 1 || maiorRemuneracao > remuneracao){
		    maiorRemuneracao = remuneracao;
		    nomeMaiorRemuneracao = nome;
		    funcaoMaiorRemuneracao = funcao;
		}
		
		flag++;
		
		System.out.println("Valor a receber = "+remuneracao);
		
		}
		
		//SESSÃO DE IMPRESSÕES
		
		System.out.println("Média de horas trabalhadas por pessoa no projeto = "+mediaDeHorasTrabalhadas);
		System.out.println(nomeMaiorRemuneracao+", "+funcao+" recebe o maior salário.");
		System.out.println("Remuneração por produtividade, recebem até R$ 100 = "+ate100+", recebem até R$ 500 = "+ate500+", recebem acima de R$ 500,00 = "+maior500);
		System.out.println("Valor total de folha de pagamento = "+valorTotalFolha);
		
		
		teclado.close();
	}
}
