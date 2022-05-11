# exercicio_media_alunos
Calcula a média de alunos entre as salas de aulas e exibir as que salas que estão acima da média.
------------------------------------------------------
# ALGORITMO DO EXERCÍCIO 
Início 

	Atribuir e declarar valores ao array
	Q[] = {35, 4, 22, 20, 30, 36}
	Declarar variável contadora cont e soma
	Se cont <= 6
	Então
	  soma = soma + Q[cont]
	Se não
	Declarar e exibir media_alunos = soma / 6
	Declarar variável contadora cont_2
	Se cont_2 <= 6 
	Então
	  Se Q[cont_2] > media_alunos  
	  Então
	    A sala (cont_2 +1) está acima da média de alunos.
	    cont_2 = cont_2 + 1 
	  Se não 
	     A sala (cont_2 +1) não está acima da média de alunos.
	     cont_2 = cont_2 + 1
  Se não 
  
Fim


------------------------------------------------------
![fluxograma_media_alunos_salas](https://user-images.githubusercontent.com/84599880/167879825-5a46d941-6bc2-4615-aa10-d3f09160ee48.png)

