#language: pt
Funcionalidade: Realizar um execução de um teste usando arquivos de Steps diferentes

  Cenário: Realizar um teste com permissão admin
    Dado faço login no sistema como admin
    Quando clico em um botão
    Então a tela é recarregada
