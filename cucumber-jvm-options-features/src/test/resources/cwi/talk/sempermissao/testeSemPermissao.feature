#language: pt
Funcionalidade: Realizar um execução de um teste usando arquivos de Steps diferentes

  Cenário: Realizar um teste sem permissão
    Dado faço login no sistema com read only
    Quando verifico o estado do botão
    Então o botão esta desabilitado
