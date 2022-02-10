#language: pt

Funcionalidade: Interviewzen Teste

  Contexto:
    Dado que eu acesse o sistema "https://blogdoagi.com.br/"

  Esquema do Cenario: pesquisa valida
    Quando acessar opção lupa no canto superior esquerdo
    E informar campo pesquisa como "<pesquisa>"
    E  acionar opção que permite pesquisar
    Entao o sistema apresenta pesquisa conforme parametro informado "<pesquisa>"

    Exemplos:
      | pesquisa |
      | teste    |

  @test2
  Esquema do Cenario: pesquisa nvalida

    Quando acessar opção lupa no canto superior esquerdo
    E informar campo pesquisa como inexistente "<pesquisa>"
    E  acionar opção que permite pesquisar
    Entao o sistema nao deve apresentar o texto "Nenhum resultado"

    Exemplos:
      | pesquisa       |
      | paralelepipedo |