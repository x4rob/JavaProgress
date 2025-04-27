README - Desafios:

DesafioConversao
Descrição
Este é um pequeno programa Java que calcula a média de três salários fornecidos pelo usuário. O código foi desenvolvido como parte de um desafio de programação para praticar conceitos básicos de Java, como entrada de dados, manipulação de strings e operações matemáticas.

Funcionalidades
Solicita ao usuário três valores de salário

Aceita valores com vírgula ou ponto como separador decimal

Remove espaços em branco extras dos valores inseridos

Converte os valores para double

Calcula e exibe a média dos três salários

Como Usar
Certifique-se de ter o Java instalado em seu computador

Compile o arquivo DesafioConversao.java com o comando:

javac DesafioConversao.java
Execute o programa com:

java DesafioConversao
Siga as instruções no terminal para inserir os três salários

O programa exibirá a média dos salários inseridos

Exemplo de Entrada/Saída
Digite o primeiro salário: 1.500,50
Digite o segundo salário:  2,000.75  
Digite o terceiro salário: 1.800,25
A soma dos salários é: 1767.1666666666667
Observações
O programa substitui vírgulas por pontos para garantir a correta conversão para double

Espaços em branco extras são removidos automaticamente

O cálculo é feito com precisão de ponto flutuante

Melhorias Futuras
Adicionar tratamento de erros para entradas inválidas

Formatador de saída para limitar casas decimais

Opção para calcular outros tipos de média (ponderada, etc.)


# Verificar Palíndromo

Este é um programa simples em Java que verifica se uma palavra fornecida pelo usuário é um **palíndromo**. Um palíndromo é uma palavra que pode ser lida da mesma forma de trás para frente, como "radar" ou "arara".

## Como funciona

1. O programa solicita ao usuário que insira uma palavra.
2. A palavra é invertida utilizando um laço `for`.
3. O programa compara a palavra original com a palavra invertida, ignorando diferenças entre maiúsculas e minúsculas.
4. O resultado é exibido informando se a palavra é ou não um palíndromo.

## Estrutura do Código

- **Entrada do Usuário**: O programa utiliza a classe `Scanner` para capturar a palavra digitada.
- **Inversão da Palavra**: Um laço `for` percorre a palavra de trás para frente e constrói a versão invertida.
- **Comparação**: A palavra original e a invertida são comparadas usando o método `equalsIgnoreCase()`.
- **Saída**: O programa exibe uma mensagem indicando se a palavra é um palíndromo.


## Como Executar

1. Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) instalado.
2. Compile o programa:

## Observações

- O programa contém um pequeno erro de digitação na palavra "polidromo", que deveria ser "palíndromo". Você pode corrigir isso no código, se necessário.
- Este programa funciona apenas com palavras simples. Para frases ou palavras com espaços e pontuações, seria necessário aprimorar o código.

## Autor

Este programa foi criado como um exemplo para treinar lógica de programação em Java.

## Número Primo
# Verificar Número Primo

Este projeto é um programa em Java que verifica se um número inteiro positivo é um número primo.

## Descrição

O programa solicita ao usuário que insira um número inteiro maior que zero. Ele valida a entrada para garantir que seja um número válido e, em seguida, verifica se o número é primo. Um número primo é aquele que só pode ser dividido por 1 e por ele mesmo.

## Funcionalidades

- Validação de entrada para garantir que o número seja um inteiro positivo.
- Verificação eficiente de números primos utilizando a raiz quadrada para otimizar o processo.
- Mensagens claras para o usuário em caso de erro ou sucesso.

## Como Executar

1. Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) instalado em sua máquina.
2. Clone este repositório ou copie o arquivo `VerificarNumeroPrimo.java` para o seu ambiente de desenvolvimento.
3. Compile o programa com o seguinte comando:


## Estrutura do Código

- **Validação de Entrada**: Garante que o número seja um inteiro positivo.
- **Verificação de Primalidade**: Utiliza um laço que verifica divisores até a raiz quadrada do número.
- **Mensagens ao Usuário**: Fornece feedback claro sobre o status da entrada e do número.

## Requisitos

- Java 8 ou superior.

## Autor

Este programa foi desenvolvido como um exemplo de verificação de números primos em Java.


