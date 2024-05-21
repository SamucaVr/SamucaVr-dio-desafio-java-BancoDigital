# Sintaxe - Desafio-DIO: Conta Bancária

Este é um programa simples em Java que simula a criação de uma conta bancária através do terminal. O usuário é solicitado a fornecer alguns dados pessoais e de conta, e em seguida, recebe uma mensagem de confirmação com as informações fornecidas.

## Funcionamento

O programa utiliza a classe Scanner para ler entradas do usuário pelo terminal. Após coletar todas as informações necessárias, ele exibe uma mensagem formatada confirmando a criação da conta com os dados fornecidos. O programa realiza as seguinte operações:

- Solicita ao usuário que insira o seu nome.
- Solicita o número da conta bancária.
- Solicita o número da agência bancária.
- Solicita o saldo inicial da conta.
- Exibe uma mensagem de confirmação com os dados fornecidos.
  
## Como usar

1. Compile o código usando um compilador Java:
```bash
javac ContaTerminal.java
```

2. Execute o programa no terminal:
```sh
java ContaTerminal
```

## Requisitos
- Java Development Kit (JDK) instalado.
- Um terminal ou console para executar o programa.

## Observações
- O programa assume que todas as entradas fornecidas pelo usuário estão corretas. Em um cenário real, seria necessário adicionar validações para garantir que os dados sejam válidos.
- O método scanner.close() é utilizado para fechar o objeto Scanner após o uso, liberando os recursos associados.
- Este programa é um exemplo básico de interação com o usuário via terminal e manipulação de entradas em Java.

