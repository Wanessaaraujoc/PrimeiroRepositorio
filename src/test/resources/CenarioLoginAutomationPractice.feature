#language: pt


@tag
Funcionalidade: Login no site Automation Practice

  @tag1
  Cenario: Logar com sucesso no site Automation Practice
    Dado que esteja no site "http://www.automationpractice.pl/index.php"
    Quando clicar para logar 
    E preencher login e senha válidos
    Então é logado com sucesso

 