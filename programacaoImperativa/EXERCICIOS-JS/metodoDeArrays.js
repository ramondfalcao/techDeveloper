let numerosPares = [2, 4, 6]; 

let impares = numerosPares.map(function(num){
    //Subtraimos 1 a cada número
    return (num - 1);
});

console.log(impares);


let nomes = ["Maria", "Eduarda", "João", "Pedro","Breno","Maria"]
        //Filtra os elementos do array
let filtro = nomes.filter(function(maria){
        return maria == "Maria";
});

console.log(filtro);


const numeros = [1, 2, 4, 6, 2, 4]

console.log(numeros.reduce((acumulador,atual)=>acumulador+'-'+atual));



let animais = ["cobra", "leão","golfinho", "onça", "macaco"]

animais.forEach(
    function(animal){
        console.log(animal)
    }
);