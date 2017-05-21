#language: pt
Funcionalidade: Testes com datatables simples

  Cenário: DataTable simples com apenas um nível de informações
    Dado que possuo os Power Rangers
      | Branco | Vermelho | Verde |

  Cenário: Mesmo resultado que o cenário acima
    Dado que possuo os Power Rangers: Branco, Vermelho, Verde

  Cenário: Utilizando o anotação @Delimiter para criar separadores diferentes
    Dado que possuo as pessoas: eu, você e nozes

  Cenário: Utilizando DataTables complexas, abordagem ruim
    Dado que possuo os barcos ruins
      | nomeBarco   | Pérola Negra | U.S.S Us | Titanic |
      | tamanho     | 50           | 30       | 269     |
      | canhoes     | 30           | 25       | 50      |
      | tripulantes | 100          | 50       | 500     |

  Cenário: Utilizando DataTables com uma abordagem boa
    Dado que possuo os barcos
      | nomeBarco    | tamanho | canhoes | tripulantes |
      | Pérola Negra | 50      | 30      | 100         |
      | U.S.S Us     | 27      | 25      | 50          |
      | Titanic      | 269     | 0       | 500         |

  Cenário: Utilizando DataTables com a annotation @Transpose
    Dado que possuo as delações premiadas
      | delator             | Reginardo Tunha | Cielo Odebest | Giorgio Jotabe'ése |
      | quantidadeDelatados | 5               | 10            | 2                  |
      | descontoPrisao      | 25              | 50            | 20                 |
      | quantidadeRecebida  | 45000           | 50000         | 60000              |