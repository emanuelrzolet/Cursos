function verificar() {
	var mensa = window.document.querySelector("p#info");
	var data = new Date();
	var ano = data.getFullYear();
	var idade = ano - window.document.querySelector("input#ano").value;
	var msg = window.document.querySelector("p#mensagem");
	var sex = document.getElementsByName("sexo");
	var sexo = "";
	var imagem = window.document.querySelector("img#imagem");
	if (sex[0].checked) {
		sexo = "Masculino";
	} else if (sex[1].checked) {
		sexo = "Feminino";
	}
	msg.innerHTML = `Detectamos ${sexo} de ${idade} de idade!`;
	msg.style.textAlign = "Center";

	if (
		window.document.querySelector("input#ano").value > ano ||
		ano.length == 0
	) {
		window.alert("Digite um ano válido");
	} else {
		imagem.style.textAlign = "center";
		mensa.style.display = "none";
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
}
