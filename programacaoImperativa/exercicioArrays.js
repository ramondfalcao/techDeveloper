let filmes = ["Star wars","Clube da luta", "O poderoso chefão", "Top gun","Interestelar"]

let cartoons = ["Toy story", "Procurando Nemo","Kung-fu Panda","Wally","Fortnite"]


// console.log(filmes[1])

function adcionar(){
    filmes.push(...cartoons);
    return filmes;

}

console.log(adcionar());