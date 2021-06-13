# language: pt

Funcionalidade: Teste de Usuario o Usuario deve ter nome, cartao e conta bancaria

Esquema do Cenario: Autenticar Usuario
 Dado o usuario com o <nome>
 Quando o usuario tiver o <cartao>
 E o usuario tiver a <contaBancaria>
 Entao a viagem foi <status> 

Exemplos: 
  | nome  | cartao |contaBancaria|  status       |
  | Joao  |   5    |    555      | permitido     |
  | Maria |   10   |    892      | nao permitido |
  | Ana   |   88   |    458      | permitido     |
      
