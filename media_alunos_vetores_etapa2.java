package exercicios_prof_ohata;

import java.util.Scanner;

public class media_alunos_vetores_etapa2 {

	public static void main(String[] args) {
		
		//Declarar vari�veis 
		int[] salas = new int[6];//Array que armazena n�meros de alunos nas salas
		
		int soma = 0;//Var para armazenar soma dos alunos
		
		int sala_maior, sala_menor;//Var para armazenar as salas com mais e menos alunos
		
		int index_sala_maior = 1, index_sala_menor = 1;//Var para armazenar �ndice das salas
		
		Scanner input = new Scanner(System.in);//Scanner para armazenar entrada de dados
		
		for (int cont = 0; cont < 6; cont++) {//Looping para percorrer array e somar os alunos de cada sala
			
			//Entrada de dados de soma e salas[]
			System.out.println("Qual o n�mero de alunos da sala ?");
			salas[cont] = input.nextInt();
			soma = soma + salas[cont];			
		}
		
		sala_maior = sala_menor = salas[0]; //Atribui valor inical a variaveis para poder comparar elas depois
		
		float media_alunos = soma/6; //M�dia de alunos por sala
		
		System.out.println("A m�dia de alunos � " + media_alunos);
		
		for (int cont = 0; cont < 6; cont++) {//Looping para compara n�mero de alunos por sala e descobril qual � a maior e menor e seus �ndices
			
			if (salas[cont] > sala_maior) {//Verifica sala maior				
				sala_maior = salas[cont];
				index_sala_maior = (cont + 1);//Soma mais um pois itens no array come�am a contar com 0
			}
			
			else if (salas[cont] < sala_menor) {//Verifica sala menor
				sala_menor = salas[cont];
				index_sala_menor = (cont + 1);//Soma mais um pois itens no array come�am a contar com 0
			}		
		}
		
		//Exibi sala maior e menor
		System.out.printf("A sala com mais alunos � %d e cont�m %d aluno(s)!\n",index_sala_maior,sala_maior);	
		System.out.printf("A sala com menos alunos � %d e cont�m %d aluno(s)!",index_sala_menor,sala_menor);			
	}
}
