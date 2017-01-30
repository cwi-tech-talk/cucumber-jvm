#language: pt
Funcionalidade: Testes com ListaSteps

  Cenário: Parâmetro com lista
    Dado que possuo a lista: item1, item dois, terceiro item listado
    Entao imprimo os itens

  Cenário: Parâmetro de DataTable
    Dado que possuo os itens:
      | item1                  |
      | item dois              |
      | terceiro item numerado |
    Entao imprimo os itens

  Cenário: Parâmetro de DataTable com lista de objetos
    Dado que possuo a listagem:
      | nome           | idade | sexo |
      | James Bondinho |    42 | M    |
      | Caribea        |    28 | F    |
      | Herculóide     |    34 | M    |
    #      | Com erro       | ABC   | F    |
    Então listo as pessoas
