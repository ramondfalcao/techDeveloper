 function restaurante(nome, cardapio) {
     this.nome = nome;
     this.cardapio = cardapio;
     entrada = function(){
         return console.log('Bem vindo ao '+ this.nome + 'Cardapio de hoje: ' + this.cardapio)
     }
    this.entrada();
 };

restaurante('Macarronada do Jão ',['Macarrão','Ovo','suco de laranja']);

