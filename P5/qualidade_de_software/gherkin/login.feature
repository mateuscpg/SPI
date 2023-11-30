#language: pt

Funcionalidade: login
    Como comprador da loja
    Quero acessar o portal
    Para fazer compras

Contexto: Dado que o usuário acesse a página inicial do saucedemo

Cenário: Autenticações Válidas
    Quando o usuário informar o login <usuario>
    E informar a senha <senha>
    Então será exibido o texto "Products"
    Exemplos:
    | usuario | senha |
    | "standard_user" | "secret_sauce"|
    | "problem_user" | "secret_sauce|
    | "performance_glitch_user" | "secret_sauce|
    | "error_user" | "secret_sauce"|
    | "visual_user" | "secret_sauce|

Cenário: Usuário Inválido
    Quando o usuário informar um login <usuario>
    E informar a senha <senha>
    Então será exibido um alert de <mensagem>
Exemplos:
| usuario               | senha             | mensagem                                                                      |
| "usuario_invalido"    | "secret_sauce "   |  "Epic sadface: Username and password do not match any user in this service"  |

| "standard_user"       | "senha_invalida"  |  "Epic sadface: Username and password do not match any user in this service"  |
| ""                    | "secret_sauce"    |  "Epic sadface: Username and password do not match any user in this service"  |


Cenário: Senha Inválida
    Quando o usuário informar o login "standard_user"
    E informar a senha de "secret_invalid"
    Então será exibido um alert de "Senha inválida"

Cenário: Usuário em branco
    Quando o usuário informar o login ""
    E informar a senha "secret_sauce"
    Então será exibido um alert de "Usuário em branco"

Cenário: Senha em branco
    Quando o usuário informar o login "standard_user"
    E informar a senha ""
    Então será exibido um alert de "Senha em branco"