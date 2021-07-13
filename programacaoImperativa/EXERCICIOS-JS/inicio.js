 let curso = function curso (nomeCurso, notaApr, fMax, estudantes){
     this.nomeCurso = nomeCurso;
     this.notaApr = notaApr;
     this.fMax = fMax;
     this.estudantes = estudantes
     this.adiciona = function (aluno){
            estudantes.unshift(aluno)
            return estudantes;   
     }
 }

 let frances = new curso ("Frances", 7, 10, ["Gabriel", "Arthur", "Juan", "Ramond"])

 console.log(frances)

 console.log(frances.adiciona("Chris"))