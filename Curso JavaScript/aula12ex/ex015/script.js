function verificar() {
	var data = new Date();
	var ano = data.getFullYear();
	var idade = ano - window.document.querySelector("input#ano").value;
	var msg = window.document.querySelector("p#mensagem");
	var sexo = window.document.querySelector("input#Feminino").value;
	var sexo1 = window.document.querySelector("input#Masculino").value;
	var imagem = window.document.querySelector("img#imagem");
	msg.innerHTML = `Detectamos ${sexo} de ${idade} de idade!`;

	if (sexo == "Masculino") {
		if (idade < 16) {
			imagem.src = "assets/menino.png";
		} else if (idade >= 16 && idade < 48) {
			imagem.src = "assets/homem.png";
		} else {
			imagem.src = "assets/velho.png";
		}
	} else if (sexo == "Feminino") {
		if (idade < 16) {
			imagem.src = "assets/menina.png";
		} else if (idade >= 16 && idade < 48) {
			imagem.src = "assets/mulher.png";
		} else {
			imagem.src = "assets/velha.png";
		}
	}
}
