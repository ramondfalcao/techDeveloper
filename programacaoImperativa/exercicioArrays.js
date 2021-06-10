let filmes = ["Star wars","Clube da luta", "O poderoso chefão", "Top gun","Interestelar"]

let cartoons = ["Toy story", "Procurando Nemo","Kung-fu Panda","Wally","Fortnite"]

let todosFilmes = (adcionar)

// console.log(filmes[1])

function adcionar(){
    const novoarray = filmes.unshift(cartoons);
    return novoarray;

}

console.log(todosFilmes);