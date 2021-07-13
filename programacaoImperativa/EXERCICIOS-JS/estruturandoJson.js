

var pessoa = {
    nome: ['João'],
    idade: 59,
    sexo: 'masculino',
    hobbys: ['futebol', 'guitarrista'],
    trabalha: true
}

var converter =JSON.stringify(pessoa);

console.log(converter)