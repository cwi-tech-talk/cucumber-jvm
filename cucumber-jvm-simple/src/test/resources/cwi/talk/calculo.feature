#language: pt
Funcionalidade: Testes com CalculoSteps

  Cenário: Parâmetros numéricos
    Dado tenho os números 1 e 2
    Quando faço a soma deles
    Então o resultado é 3

  Cenário: Chamando um StepDefinition declarado nos Steps diferente de como ele aparece na Feature
    Quando tenho os números 1 e 2
    Então faço a soma deles
    Dado o resultado é 3

  Esquema do Cenário: Utilizando exemplos
    Dado tenho os números <num1> e <num2>
    Quando faço a soma deles
    Então o resultado é <soma>

    Exemplos: 
      | num1 | num2 | soma |
      |    1 |    2 |    3 |
      |    2 |    2 |    4 |
      |  100 |  250 |  350 |
