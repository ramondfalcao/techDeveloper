 module.exports = function aluno(nome,quantiF, notas){
      this.nome= nome
      this.faltas= quantiF
      this.notas= notas 
      this.media= function() {
         let mediaTotal = this.notas.reduce(function(acumulador,el){
              return acumulador + el  
          })   
          return mediaTotal/this.notas.length        
      }
     this.falta = function() {
         quantiF = quantiF++;
     }
}
let pedro = new aluno ("Pedro", 5,[10,7,8,7])

let gabriel = new aluno ("Gabriel", 4,[10,10,10,10])

console.log(pedro.media())
console.log(pedro.falta())