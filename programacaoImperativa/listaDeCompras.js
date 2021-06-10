let nomes = ['Frango','Feijão','Batata','Arroz'];

console.log("pop / Remove do array o ultimo elemento.")
let oUltimo = nomes.pop(); 
console.log(oUltimo)

console.log("shift /Remove do array o elemento indice 0",)
let oPrimeiro = nomes.shift(); 
console.log(oPrimeiro)

console.log("unshift /Insere os dados no começo do array.")

console.log("push /Insere um dado no final do array.")
nomes.unshift("Carne de Boi", "Sal"); 

nomes.push(4);  // push /Insere um dado no final do array.

console.log(nomes);  

console.log("IndexOf /Recebe a posição do elemento /Procura do começo do array.")
console.log(nomes.indexOf("Feijão"));  

console.log(".lastIndexOf /Começa a procurar do fim do array.")
console.log(nomes.lastIndexOf("Batata"))   

console.log(".join /Junta todos os elementos separando por virgula. Pode ser unido com outros caracterses exemplo join, - , /")
console.log(nomes.join());  // .join /Junta todos os elementos separando por virgula. Pode ser unido com outros caracterses exemplo join("-"), ("/")


