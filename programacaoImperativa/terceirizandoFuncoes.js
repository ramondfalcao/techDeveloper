//  Callback é uma função que passa como parâmetro outra função


let andar = () => console.log("O carro esta andando");
let parar = () => console.log("O carro parou")

let acaoCarro = (algumafuncao) => algumafuncao();

acaoCarro(andar);
acaoCarro(parar);