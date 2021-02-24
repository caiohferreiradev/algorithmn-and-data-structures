
//Author: Caio Henrique Azevedo Ferreira
//Data: 13/05/2020
//Função: ler 50 alunos de exercício 7

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int ateDoze=0, idade=0, ateTrinta=0, cont=0, maiorIdade=0;
		String nome = " ", nomeMaiorIdade = " ";
		double mediaIdades=0, media;
		
		for(int i = 1; i < 51; i++){
		    
		    System.out.print("Nome = ");
		    nome = teclado.nextLine();
		    
		    System.out.print("Idade = ");
		    idade = teclado.nextInt();
		    
		    if(idade <= 12){
		        ateDoze++;
		        cont++;
		    }
		    
		    if(idade > 30){
		        ateTrinta++;
		        cont++;
		    }
		    
		     if(i == 1 || idade > maiorIdade){
		        nomeMaiorIdade = nome;
		        maiorIdade = idade;
		    }
		    
		    mediaIdades += idade;
		    
		    nome = teclado.nextLine();
		}
		
		media = (mediaIdades / cont);
		
		System.out.println("\nAlunos até 12 anos = "+ateDoze);
		System.out.println("Média das idades = "+media);
		System.out.println("Alunos acima de 30 anos = "+ateTrinta);
		System.out.println("Aluno de maior idade = "+nomeMaiorIdade);
		
		teclado.close();
	}
}
