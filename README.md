# exercicio_media_alunos
Calcula a média de alunos entre as salas de aulas e exibir as que salas que estão acima da média.
------------------------------------------------------
# ALGORITMO DO EXERCÍCIO 
Início
	
	Declarar Array -> int[] salas
	Declarar soma de alunos -> soma 
	Declarar sala com mais alunos -> sala_maior
	Declarar ala com menos alunos -> sala_menor
	Declarar variáveis contadoras -> cont, cont2
	Enquanto cont < 6. Faça
	  Receber quantidade de alunos nas sala em var de entrada de dados -> input 
	  salas[cont] = input
	  soma = soma + salas[cont]
	  cont = cont + 1
 	FimEnquanto
	  Calcular média -> soma/6
	  Atribuir um valor do array as variáveis -> sala_maior  = sala_menor = salas[0]
	  Declarar var com índice da sala maior e menor -> index_sala_maior e index_sala_menor
	Enquanto cont2 < 6. Faça
	  Se salas [cont] > sala maior. Então 
	    sala_maior = salas[cont] 
	    index_sala_maior  = (cont + 1)
	Se não 
	  Se salas[cont] < sala_menor. Então
	    sala_menor = salas[cont] 
	    index_sala_menor  = (cont + 1)
	cont2 = cont2 + 1
	FimEnquanto 
	Exibir sala_maior e sala_menor	

Fim


------------------------------------------------------
![fluxograma_media_alunos_salasa_etapa2](https://user-images.githubusercontent.com/84599880/168633163-95929383-10c8-460d-a2bd-07fd8bb4e95d.png)

