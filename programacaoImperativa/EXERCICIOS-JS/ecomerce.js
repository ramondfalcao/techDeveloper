
// Crie uma variável produtos, que contenha um array de objetos, com no mínimo 3 itens. Dentro da variável, liste produtos disponíveis, informando os seguintes detalhes: Nome do Produto, Valor do Produto, Qualidade do Produto e Status.

// A informação Qualidade do Produto deve ser um número que irá de 0 a 10.
// A informação Status deve ser um Booleano, indicando se o produto está disponível em estoque.

// Em seguida, um usuário deseja filtrar os produtos, com base em alguns critérios. Selecione todos os produtos que tenham: 

// Valor entre 482 e 1600;
// Qualidade superior a 60;
// Status como disponível.

// O resultado do filtro deve ser armazenado na variável carrinho.

// Por fim, é necessário exibir todos os itens presentes no carrinho, com seus nomes e preços correspondentes, e no final um valor total, resultante da somatória de todos os produtos.


const produtos = [
    {nomeProd: "Xbox Series S", valor:2.659 , qualidadeProd:10, status: true},
    {nomeProd: "Headst Xbox", valor:2.000 , qualidadeProd:9, status: false},
    {nomeProd: "Controle Nintendo", valor: 460, qualidadeProd:7, status: true}
]

const carrinho = produtos.filter ((produto) => {
              const valor = produto.valor
              const qualidadeProd = produto.qualidadeProd 
              const status = produto.status

              const selecionado = (valor >=482 && valor <= 1600) && (qualidadeProd >=6 ) && (status == true)

              return selecionado
}) 

carrinho.forEach((produto) => {
    console.log("Produto: ", produto.nomeProd)
    console.log("Valor: ", produto.valor)
    console.log("------------------------")
})

const total = carrinho.reduce((acumulador, produto) => {
    return acumulador.valor + produto.valor
})

console.log("Total: ", total)