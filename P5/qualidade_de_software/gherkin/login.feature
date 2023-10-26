#language: pt

Funcionalidade: login
    Como comprador da loja
    Quero acessar o portal
    Para fazer compras

Cenário: Autenticação Válida
    Dado que o usuário acesse a página inicial do SauceDemo
    Quando o usuário informar o login "standard_user"
    E informar a senha "secret_sauce"
    Então será exibido o texto "Products"

Cenário: Usuário Inválido
    Dado que o usuário esteja na página de login
    Quando o usuário informar um login diferente de "invalid_user"
    E informar a senha "secret_sauce
    Então será exibido um alert de "Usuário inválido"

Cenário: Senha Inválida
    Dado que o usuário esteja na página de login
    Quando o usuário informar o login "standard_user"
    E informar a senha de "secret_invalid"
    Então será exibido um alert de "Senha inválida"

Cenário: Usuário em branco
    Dado que o usuário esteja na página de login
    Quando o usuário informar o login ""
    E informar a senha "secret_sauce"
    Então será exibido um alert de "Usuário em branco"

Cenário: Senha em branco
    Dado que o usuário esteja na página de login
    Quando o usuário informar o login "standard_user"
    E informar a senha ""
    Então será exibido um alert de "Senha em branco"