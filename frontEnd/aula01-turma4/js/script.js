let maoUsuario = prompt("Digite (1) pedra, (2) papel e (3) tesoura:")

let maoMaquina = parseInt(Math.random() * 3 + 1)

var rodada = 0
// verificador de rodadas
if (rodada < 3) {

}
for(let i= 0;i<2;i++){
    //reiniciar as rodadas
    switch (maoUsuario == 1) {
        case maoUsuario == 1:
            console.log("empate")
            break;
        case maoUsuario == 2:
            console.log("perdeu")
            break;

        case maoUsuario == 3:
            console.log("ganhou")
            break;
    }
    // opcoes do jokenpo
    switch (maoUsuario == 2) {
        case maoUsuario == 2:
            console.log("empate")
            break;
        case maoUsuario == 1:
            console.log("perdeu")
            break;

        case maoUsuario == 3:
            console.log("ganhou")
            break;
    }

    switch (maoUsuario == 3) {
        case maoUsuario == 3:
            console.log("empate")
            break;
        case maoUsuario == 2:
            console.log("perdeu")
            break;

        case maoUsuario == 3:
            console.log("ganhou")
            break;
    }
    rodada = rodada++
}