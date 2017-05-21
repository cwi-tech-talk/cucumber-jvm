#language: pt
Funcionalidade: Testes com LoginSteps

  Cenário: Passo simples sem parâmetros
    Dado que faço login no sistema

  Cenário: Passo com parâmetro de palavra
    Dado que sou um usuário qualquer
    E que sou um usuário UNICO
  # E que sou um usuário ÚNICO
  # E que sou um usuário IN VALIDO

  Cenário: Passo com parâmetro livre
    Dado que estou com um admin
    E que estou com qualquer valor
    E que estou com Campo !@$% LIVRE

  Cenário: Passo com parâmetro pré-definitido
    Dado que faço acesso com perfil admin
    E que faço acesso com perfil peão
  # E que faço acesso com perfil simples

  Cenário: Passos com configurações de negação
    Quando não faço uma ação
    E faço uma ação

  Cenário: Step com timeout com 2 segundos e não passa do timeout
    Quando sou rápido e faço login em 1 segundo

  Cenário: Step com timeout com 2 segundos e que passa do timeout
    Quando sou lento e faço login em 3 segundo