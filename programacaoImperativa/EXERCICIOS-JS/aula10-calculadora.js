//juntando tudo 
const tabuada= require('./aula10-tabuada');
const operacao= require('./aula10-operacoes');

function calcula(a,b,acao)
{
    switch (acao)
    {
        case '+': console.log(operacao.soma(a,b));
        break;
        case '-': console.log(operacao.subtracao(a,b));
        break;
        case '/': console.log(operacao.divisao(a,b));
        break;
        case '*': console.log(operacao.divisao(a,b));
        break;
        case 't': tabuada(a);
        break;
    }
}

calcula(1,4,'+');