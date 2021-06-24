let numerosPrimos = [2,3,5,7,11,13,17];
let numeros = [1,4,6,8,9,10,12,14,15,16];

let unidos = [...numerosPrimos,...numeros];

console.log(unidos);

let menorNumero = (...n) => console.log (Math.min(...n));

menorNumero(1,4,8);