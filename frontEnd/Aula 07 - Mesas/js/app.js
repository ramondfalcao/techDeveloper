//Criação do formulário:

var formulario = document.createElement("form");
formulario.setAttribute('class', 'formulario');
document.body.appendChild(formulario);

//Seleção do formulário:

var form = document.querySelector(".formulario");

//Inserção do Título:

var titulo = document.createElement("h1");
var tituloText = document.createTextNode("Login");
titulo.appendChild(tituloText);
form.appendChild(titulo);

//Inserção dos inputs:

var email = document.createElement("input");
email.setAttribute("placeholder", "Email");
email.setAttribute("type", "text");
form.appendChild(email);

var senha = document.createElement("input");
senha.setAttribute("placeholder", "Senha");
senha.setAttribute("type", "password");
form.appendChild(senha);

//Inserção dos botões:

var botaoEnviar = document.createElement("button");
var botaoTextoEnviar = document.createTextNode("Enviar");
botaoEnviar.setAttribute("type", "submit");
botaoEnviar.appendChild(botaoTextoEnviar);
form.appendChild(botaoEnviar);

var botaoCancelar = document.createElement("button");
var botaoTextoCancelar = document.createTextNode("Cancelar");
botaoCancelar.setAttribute("type", "reset");
botaoCancelar.appendChild(botaoTextoCancelar);
form.appendChild(botaoCancelar);

var confirmarSenha = document.createElement("input");
confirmarSenha.setAttribute("placeholder", "Confirme sua senha");
confirmarSenha.setAttribute("type", "password");
confirmarSenha.setAttribute("class", "text");
form.appendChild(confirmarSenha);



document.querySelectorAll(".formulario").addEventListener("mouseover", function(event) {
    if (event) {
      input.disabled = false;
    } else {
      input.disabled = true;
    }
  }, false);
  

document.querySelectorAll("input")[0].disabled = true;
document.querySelectorAll("input")[1].disabled = true;
document.querySelectorAll("input")[2].disabled = true;


//Manipulação de atributos:

email.setAttribute("disabled", true);

//Remoção do atributo:

email.removeAttribute("placeholder");

//Sugestão de estilização:

formulario.style.display = "flex";
formulario.style.maxWidth = "300px";
formulario.style.margin = "10% auto";
formulario.style.textAlign = "center";
formulario.style.flexDirection = "column";