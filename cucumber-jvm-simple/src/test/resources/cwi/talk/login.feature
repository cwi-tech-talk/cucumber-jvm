#language: pt
Funcionalidade: Testes com LoginSteps

  Cenário: Passo simples sem parâmetros
    Dado que faço login no sistema

  Cenário: Passo com parâmetro de palavra
    Dado que sou um usuário qualquer
    E que sou um usuário TALVEZ

  #    E que sou um usuário IN VALIDO
  Cenário: Passo com parâmetro livre
    Dado que estou com um admin
    E que estou com qualquer valor
    E que estou com Campo !@$% LIVRE

  Cenário: Passo com parâmetro pré-definitido
    Dado que faço acesso com perfil admin
    E que faço acesso com perfil peão
		#E que faço acesso com perfil simples