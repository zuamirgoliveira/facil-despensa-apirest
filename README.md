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
[Modelo relacional do banco de dados](https://viewer.diagrams.net/?tags=%7B%7D&highlight=0000ff&edit=_blank&layers=1&nav=1&title=Untitled%20Diagram.drawio#R7Vxdd6o4FP01PnYWAanySIW2durHiJ3eOy8uKqkyg8ZBrHp%2F%2FQ0SQEwsUkqwVFcf5PAh7J19yNlJWpNas82day6mHWRBpyYK1qYmaTVRBHVRrPl%2FgrUNIo1rEpi4tkUOigOG%2FQuSoECiK9uCy8SBHkKOZy%2BSwTGaz%2BHYS8RM10Xr5GGvyEn%2B6sKcQCpgjE2Hjj7bljcNok1ZiOP30J5Mw18GAtkzM8ODSWA5NS203gtJek1quQh5wbfZpgUdH7wQl%2BC82yN7oxtz4dw75QR9NZLFwT%2Fin46JwNh9lsb34yuJ3Ju3DR8YWvj5ySZyvSmaoLnp6HH0xkWruQX9qwp4Kz7mEaEFDgIc%2FBd63paQaa48hENTb%2BaQvXBjez%2F2vv%2F0L%2FWHTLa0DbnybmMbbsw9d%2Ftjf2PvLH8zPm23FZ9nqX4zwJtzNIdB5NZ2HLI%2FeH7%2FoY%2FCSkJLtHLH5Kjug1xvTLXbB8V%2BHT2svXHvtXXVCNun6U6g986BTTGiH%2BsGohnEd4xPdKFjevZb8k5M0oAn0XExx%2FgLoZlN%2Bbu3%2BWY6K%2FJTT8aTOmj3qLawXNszx9yh9oohayEHubs90u3uE%2BHHgOsNuh7c7IXo5yV760QgJEOEelnHchNDUU33pCZKQlEIiRRCtEwcB6cgH5n11PagsTB3bWONs2CysZvLRZCXXu2NL5pDJAVBwR8mku%2FTdzK%2BUhJfSWbgy4C3MHQlCt22RuGLn807ANKxJ3P8fYzxgRi8Gx8BG2dqleyY2ZYVJCi4tH%2BZL7tL%2BRpfIHvu7R5DvqnJmn8tnJOWQXryL730XPQfDEkheWKfJxIqjCI5lSKJK0V1jgJotY6mkmIEcF22AGQK3W6vo18kkEKSzJWk6ypLQClbAg0KXaN3M9AvOjjUAYMphStTzSrrAIhlC0GpNLxyyfA2BQpevaO2Hy85Jo0mri%2FbJl2Sdp86%2BgBXpMJQf9Rve93v%2FlqoN1ITF6gXxNndpK6szf%2Bv%2Bh3rpt%2Fr3Zmb55crmrIqJa7wHcshcTHRpR0IQ%2B%2Feq99dBHIqS9c88xaQmnSjP1f%2FNPJBX8wl1Mzl9IgX%2BhHrs0na64GPmsPiJKf2%2FTa59%2BI6fHOFTkl4icB7JWcdsBvdRh7ClTIJj0n%2BubenMMO8wIaS6pFH4yif16TydVHojKzpRl%2FvGnRS5mObR3Vg6Jic6JsDubBuHO3sFtcnyOqbRwSe3icACXzr%2FLoE7AegTdmK%2BebZKZJTKeLqmzdpZ7c4AWTtFOcWQKNsAdCWbOX8wtwSYJDEtZQHgLZ2i9OArwCB3SMpRgNRt6QsEQBAG7JtbXRsBP9ba4FFFlfzPHJkvkK5kN7tj0oKkK2koPk%2BuVwgyeTrlQt0FmwP9Q7VGviUCodl88lTbJTC3uU8h5UylwqNrACLSXxLLxXoUaWqlQqZKaqnUsS1VAiVdZ6lQl4BlF0qKIwBpcqVCnklUHapoNCWWoUkUHqloNBunKYbrUG7pVasTsgrhNLrBOWc51vmV4JUthJoW%2B6vJ7U7bGuqdnknpHLFVwrnPO8yvxSYgzQ84aXr0r%2FVx97gooI0mrhOLFDOedZlfhVwnF3DhpdRHw%2F1zqivaoNL5yidLMA0i4qzvHlOks08pJBXDWw3jie%2B4ZWTQwpHpzd8azmw2CpMDswluzwnXh6IgULtZMRPFoPMTwxMdGlP4rFtDLEIBL9UEFq9Tn%2FwpSRRAGeHkmBwBvhmMIHOYDvaRgFfBkUYp5XNIImUxKyEWUgVCBXP%2FJF15CUm8qNv07JXNwOBziAVG3v5AEn1VJK4Dr4AgedMxaz1VX4RlL3CGQi0oampwy%2F13uQgg7LXOAPhnOcr5pdB2aucgUCbmcN2vzciXcqLGN4nq8mXLJ4TF%2FmLofSlzkCgTU0sg%2BET3Tv%2F3kpgMcV3WZtwzqvSP0EKZS9LB2FdeDgMMxr2hmq1Vqd%2Fgh4YdPF2oHnWC1kd6E8QRLi0ojxBsBY3VdOC%2FgRBhC52AYLAm%2FG%2FpAyWzcb%2F2FPSfwM%3D)

 
 

