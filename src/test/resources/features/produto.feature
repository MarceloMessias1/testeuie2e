#language: pt

@teste
Funcionalidade: Adicionar Produto
  Como usuario quero comprar produto

  @adicionar
  Cenario: Adicionar Produto
    Dado que eu clique em novidades
    Quando escolher produto
    E clicar em comprar
    Entao valido compra
    
  