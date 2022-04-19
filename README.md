# facil-despensa-apirest

# Fácil Despensa
Aplicativo de gestão dos itens de mercado para sua casa
 
# Histórico de versões
Versão	Data	Autor	Detalhes
1.0	29/03/2022	Zuamir Gutemberg	Criação do documento
			

 
# Objetivo
Essa solução tem como objetivo ajudar os usuários a gerarem suas listas de compras de forma mais fácil, divertida e eficiente. Com isso, economizando tempo, dinheiro e mantendo sua despensa organizada.
O público principal são pessoas responsáveis por gerir suas casas. Mas também qualquer pessoa que precise manter um depósito organizado.
 

# Modelo de Negócio
A Despensa Fácil  é um aplicativo multiplataforma onde o usuário poderá gerenciar os itens de supermercado na despensa da sua casa. Ele poderá cadastrá-los e ter visibilidade do uso quinzenal e mensal dos produtos. Criar listas de compras a partir do estoque, gerar uma nova lista para compras completas de acordo com os itens e quantidades padrões previamente cadastrados ou uma lista complementar de acordo com o que ainda resta na despensa. Desse modo, fica fácil perceber os gastos da casa, fazer economia e comparar preços dos itens entre as compras dos últimos meses.

 
# Desejos
•	Poder cadastrar mais de uma despensa.
•	Cadastrar itens da despensa e a quantidade.
•	Gerar lista de compras a partir dos itens padrões da despensa.
•	Gerar listas automaticamente de acordo com itens pré-definidos, com opção de gerar lista completa, ou só com o que está faltando na despensa ou uma lista complementar.
•	Possibilidade de adicionar item a lista de compra e inseri-lo a despensa caso a lista de compra seja finalizada.
•	Atualizar quantidade dos itens da despensa a partir da lista de compras finalizada.
•	Aos itens da lista de compra que não fazem parte da despensa dar a possibilidade de tornar um item padrão ou não da despensa.
•	Na lista de compra, ao atualizar o valor do item, mostrar se ele está abaixo, igual ou acima do valor médio dos últimos três meses (Ou a quantidade de meses com limite de três meses).
•	Relatórios da despensa: quinzenal, mensal. Tipo fatura de cartão de crédito.


 
# Modelo de visão do banco de dados
A gestão do aplicativo será baseada na(s) despensa(s) do usuário. A despensa é um local onde ele poderá cadastrar itens e terá um código e nome. O usuário poderá ter uma ou mais despensas cadastradas.
Os itens são produtos que serão cadastrados previamente na despensa e conter um código, nome, descrição, quantidade, valor e item temporário (verdade ou falso) para defini-lo como padrão na despensa.
A lista de compra estará associada à uma despensa e poderá conter até todos os itens cadastrados na despensa. A lista terá um código, data, tipo da lista (dia, semana, quinzena ou mensal), status (criada, cancelada, executada e excluída) e valor total.
O usuário deverá ter código, nome, sobrenome, número de telefone e e-mail.

 
# Modelo relacional do banco de dados
[Modelo relacional do banco de dados](https://trello.com/1/cards/6246592e46807539fab7fa25/attachments/624f85678358c6471a1a95b9/download/Modelo_relacional_F%C3%A1cil_Despensa.png)



# Kanban Fácil Despensa
[Trello](https://trello.com/b/qYQ56BPS/f%C3%A1cil-despensa)

 
# Bibliografia

 ### Artigos
 [Padrões de projeto: o que são e o que resolvem - Kennedy Tedesco, treinaweb](https://www.treinaweb.com.br/blog/padroes-de-projeto-o-que-sao-e-o-que-resolvem)
 
 ### Vídeos
 [API REST com SPRING BOOT - Michelli Brito](https://www.youtube.com/playlist?list=PL8iIphQOyG-D2FP9wkg12AavzmVRWEcnJ)
 [Uncle Bob SOLID principles](https://www.youtube.com/watch?v=zHiWqnTWsn4)
 
 ### Livros
 	- Desenvolvimento Ágil Limpo: de volta às origens - Robert C. Martin (“Uncle Bob”)
 	- Tdd - Test Driven Development na Pratica - Camilo Lopes
