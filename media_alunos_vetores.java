package exercicios_prof_ohata;

public class media_alunos_vetores {

	public static void main(String[] args) {
		//Titulo exercicio
		System.out.println("Exercício - Média de alunos em salas de aulas\n");
		
		//Declarar variáveis 
		
		//Variáevel para armazenar somas dos alunos de todas as salas
		int soma = 0; 
		
		//Array com quantidade de alunos em cada sala
		int Q[] = {35,4,22,20,30,36};
		
		//Atribuí a quantidade de itens no array
		int n = Q.length;
		
		//Looping para percorrer array e somar número de alunos entre as salas
		for (int cont = 0; cont < n ; cont++) {
			soma = soma + Q[cont];		
		}
		
		//Média de alunos das salas
		float media_alunos = soma / n; 
		
		System.out.println("A média de alunos nas salas é " + media_alunos);
		
		//Looping para percorrer array para 	
		for (int cont_2 = 0; cont_2 < n; cont_2++ ) {
			
			//Conferir se o item do array (alunos da sala) está acima da média
			if (Q[cont_2] > media_alunos) {
				System.out.println("A sala " + (cont_2 + 1) +  " está acima da média de alunos.");
			}
		
		}
		
		
		
	}

}
