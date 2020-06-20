# language: pt

@teste
Funcionalidade: Lista de filmes

  Eu como usuário
  desejo realizar uma busca de filmes por titulo
  para poder adicionar na minha lista de favoritos

  Cenário: Realizar uma busca por titulo do filme
    Dado que estou na lista de filmes
    Quando realizar uma busca por titulo
    Então vejo o resultado da busca

  @login
  Cenário: Realizar um login na aplicacao
    Dado que estou na lista de login
    E Eu escrevo no campo username
    E Eu escrevo no campo password
    Quando Eu clicar no botao Login
    Então Eu vejo que estou logado