// ATIVIDADE //

Você foi contratado para desenvolver um sistema simples de gerenciamento de veículos. O sistema deve utilizar conceitos de orientação a objetos, com foco em métodos de acesso, herança e classes abstratas.

Requisitos:
Crie uma classe abstrata chamada Veiculo, que deve conter os seguintes atributos:

marca (público)
modelo (público)
ano (privado)
Crie os seguintes métodos na classe Veiculo:

Um método abstrato informacoesVeiculo() que retornará informações sobre o veículo.
Métodos getAno() e setAno(int ano) para acessar e modificar o atributo ano.
Crie duas classes que herdam de Veiculo:

Carro: com o atributo adicional numeroPortas (público).
Moto: com o atributo adicional cilindrada (privado).
Implemente o método abstrato informacoesVeiculo() nas classes Carro e Moto, para que ele retorne uma string com todas as informações do veículo (marca, modelo, ano, e atributos adicionais).

Crie uma classe Main que deverá instanciar um objeto de cada classe (Carro e Moto), definir os valores dos atributos e imprimir as informações dos veículos utilizando o método informacoesVeiculo().


// BRANCHES //

Há duas "branches" no repositório, primeira "main" que é o que atividade pede para desenvolvimento do código, e a segunda "Mainalternative" é um teste que me desafiei em desenvolver pensando como seria mais fácil se o código gerasse uma listagem onde fosse possível adicionar multiplos valores das respectivas classes "Carro" e "Moto", e que guardasse essas informações.


// CÓDIGO //

--> Explicação do código desenvolvido:

- "Veiculo" é abstrata → não pode ser instanciada diretamente, mas fornece os atributos e métodos comuns;

- "Carro" e "Moto" herdam de "Veiculo" e implementam o método abstrato "informacoesVeiculo()";

- "Main" cria instâncias de carro e moto, define valores e imprime suas informações;

- "ano" e "cilindrada" são privados e acessados via getter e setter, seguindo boas práticas de encapsulamento.

- Na Branche "main" utilizei exemplos de valores fixos das classes para imprimir informações no Terminal;

- Na Branche "Mainalternative" utilizei JOptionPane para utilizar janelas flutuantes para execução das funcionalidades.
