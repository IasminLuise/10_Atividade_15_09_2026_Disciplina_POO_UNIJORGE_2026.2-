1. Contextualização

Uma empresa deseja desenvolver um sistema para realizar o cadastro e o gerenciamento de seus funcionários. O sistema deverá permitir o cadastro de funcionários comuns e de gerentes.

Durante o desenvolvimento, a equipe decidiu utilizar os conceitos de Programação Orientada a Objetos (POO) para organizar melhor o código e facilitar futuras alterações no sistema.

O sistema deverá utilizar:

Classes para representar os funcionários;
Encapsulamento para proteger os atributos;
Métodos get e set para acessar e alterar os atributos;
Construtores para inicializar os objetos;
Herança para criar diferentes tipos de funcionários a partir de uma classe principal.

2. Problema proposto

Você foi contratado para desenvolver a primeira versão do sistema.

O sistema deverá possuir uma classe principal chamada Funcionario, contendo informações comuns a todos os funcionários.

Cada funcionário deverá possuir:

nome;
cpf;
salario.

Entretanto, a empresa possui diferentes tipos de funcionários.

Um Gerente, por exemplo, possui todos os dados de um funcionário, mas também possui:

departamento;
bonus.

Dessa forma, a classe Gerente deverá herdar as características da classe Funcionario.
