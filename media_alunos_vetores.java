package exercicios_prof_ohata;

public class media_alunos_vetores {

	public static void main(String[] args) {
		//Titulo exercicio
		System.out.println("Exerc�cio - M�dia de alunos em salas de aulas\n");
		
		//Declarar vari�veis 
		
		//Vari�evel para armazenar somas dos alunos de todas as salas
		int soma = 0; 
		
		//Array com quantidade de alunos em cada sala
		int Q[] = {35,4,22,20,30,36};
		
		//Atribu� a quantidade de itens no array
		int n = Q.length;
		
		//Looping para percorrer array e somar n�mero de alunos entre as salas
		for (int cont = 0; cont < n ; cont++) {
			soma = soma + Q[cont];		
		}
		
		//M�dia de alunos das salas
		float media_alunos = soma / n; 
		
		System.out.println("A m�dia de alunos nas salas � " + media_alunos);
		
		//Looping para percorrer array para 	
		for (int cont_2 = 0; cont_2 < n; cont_2++ ) {
			
			//Conferir se o item do array (alunos da sala) est� acima da m�dia
			if (Q[cont_2] > media_alunos) {
				System.out.println("A sala " + (cont_2 + 1) +  " est� acima da m�dia de alunos.");
			}
		
		}
		
		
		
	}

}
