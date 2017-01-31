#language: pt
@one
Funcionalidade: Teste utilizando OneSteps

  @oneSteps1
  Cenário: Utiliza passos do OneSteps exclusivamente 1
    Dado que faço uma ação
    Quando específico OneSteps
    #Quando específico TwoSteps
    Então espero uma reação

  @oneSteps2 @oneStepsSpecific
  Cenário: Utiliza passos do OneSteps exclusivamente 2
    Dado que faço uma ação
    Quando específico OneSteps
    #Quando específico TwoSteps
    Então espero uma reação

  @oneSteps3 @oneStepsSpecific
  Cenário: Utiliza passos do OneSteps exclusivamente 3
    Dado que faço uma ação
    Quando específico OneSteps
    #Quando específico TwoSteps
    Então espero uma reação
    