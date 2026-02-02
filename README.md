# Sistema de Cadastro de Funcionários
>Status: Developing

Projeto desenvolvide em Java, com foco em demonstrar fundamento sólidos de Programação Orientada a Objetos (POO), validação de dados, tratamento de exceções e organização de código.

A aplicação é executada via console e simula um sistema simples de cadastro de funcionários, evidenciando boas práticas para projetos iniciais e acadêmicosm com atenção à clareza, legibilidade e regras de negócio.


## Visão geral

Este projeto foi criado como parte do meu processo de aprendizado em Java e tem como objetivo demonstrar competências essenciais esperadas de um desenvolvedor iniciante como:
+ Estruturação de classes
+ Encapsulamento de dados
+ Validação de entradas do usuário
+ Uso de coleções 
+ Tratamento adequado de erros

## Funcionalidades

Cadastro de funcionários com validação completa dos dados:
+ Listagem de todos os funcionários cadastrados
+ Busca de funcionário por ID
+ Remoção de funcionário por ID
+ Menu interativo no console

## Regras de Negócio e Validações 

O sistema aplica validações para garantir consistência e integridade das informações:

#### Nome:
+ Não pode ser vazio
+ Aceita apenas letras e espaços

#### Cargo:
+ Não pode ser vazio
+ Aceita apenas letras e espaços

#### Idade:
+ Aceita apenas números
+ Idade mínima: 18 anos
+ idade máxima: 80 anos

#### ID:
+ Aceita apenas números
+ Deve conter exatamente 4 dígitos
+ Tratamento de exceções com mensagens claras, permitindo que o usuário tente novamente em caso de erro


## Conceitos Técnicos Aplicados

+ Programação Orientada a Objetos (POO)
+ Encapsulamento
+ Classes, atributos e métodos
+ Sobrescrita do método toString()
+ Coleções com ArrayList
+ Estruturas de controle (if/else, switch)
+ Estruturas de repetição (for, do-while)
+ Tratamento de exceções com try/catch

## Exemplo de Execução 

#### Sistema de cadastro
0. Sair
1. Cadastrar funcionários
2. Listar funcionários
3. Buscar por ID
4. Excluir funcionários
