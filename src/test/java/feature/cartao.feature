# language: pt

Funcionalidade: Adquirir um cartao como um usuario do metro, Eu quero adquirir um cartao para entao viajar entre as estacoes

Esquema do Cenario: Validar cobrança
 Dado que o usuario comprou um cartao de uma tarifa <tarifa>
 Quando o mesmo utilizar o cartao na zona <zona>
 Entao realize a cobranca de <cobranca> reais

Exemplos: 
  |   zona   | tarifa | cobranca |
  |    A     | unico  |    6.0     |
  |    A     | dia    |    10.0    |
	|    A     | semana |    30.0    |
	|    A     | mes    |    130.0   |
	|    B     | unico  |    7.0     |
  |    B     | dia    |    12.0    |
	|    B     | semana |    45.0    |
	|    B     | mes    |    170.0   |