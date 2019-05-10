	O programa em questão serve para calcular o CR(coeficiente de rendimento) de alunos e o CR médio dos cursos de uma universidade. Ele foi implementado como um desafio proposto pela Superintendência de Tecnologia da informação da Universidade Federal Fluminense(STI-UFF).

1 - Como o programa funciona? Ele lê um arquivo .CSV (comma-separated values), que é um arquivo sequencial cujas informações estão separadas por vírgulas seguindo um parâmetro. A partir desta leitura, ele trata os dados de forma adequada, "jogando-os" em um ArrayList para facilitar o processamento das informações e a legibilidade do algoritmo(com vetores ficaria muito pior para implementar e entender o seu funcionamento).

2 - Como utilizar?
	Basta ter a IDE do Netbeans 8.1 ou superior com Java: 1.8.0_191; OpenJDK 64-Bit Server VM 25.191-b12 e Runtime: OpenJDK Runtime Environment 1.8.0_191-8u191-b12-2ubuntu0.16.04.1-b12. Todos são instalados por padrão pela IDE e foram testados na versão do Ubuntu 16.04.6.

3 - Como poderia melhorar? O volume do arquivo de entrada pode afetar muito à rapidez do algoritmo, pois ele não está otimizado. Ele utiliza somente listas lineares que sempre são acessadas a partir do início, o que aumenta muito a complexidade do algoritmo. O ideal seria implementá-lo utilizando estruturas mais rápidas como arvores binárias. O programa funciona com todos os dados em memória principal, o que pode causar um estouro. O ideal nesse caso seria à implementação de um banco de dados no mySQL, por exemplo.
 
4 - Solução de erros:
	Caso ocorra erro na execução, o principal fator é o diretório do arquivo de entrada, que varia de máquina pra máquina e pode ser encontrado na classe LeiaCSV. O segundo fator é linha vazia existente no arquivo, nesse caso, apague à linha utilizando um editor de texto de preferência.
