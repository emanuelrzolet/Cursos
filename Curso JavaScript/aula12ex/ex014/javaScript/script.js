function carregar() {
	var agora = new Date();
	var horas = agora.getHours();
	var campoHorario = window.document.querySelector("div#hora");
	var imagem = window.document.querySelector("img#imagem");
	campoHorario.innerHTML = `<p>Agora são ${horas} horas</p>`;

	if (horas >= 7 && horas <= 12) {
		imagem.src = "assets/Manha.png";
		document.body.style.background = "lightyellow";
		// Bloco Manha
	} else if (horas > 12 && horas <= 19) {
		imagem.src = "assets/Tarde.png";
		document.body.style.background = "lightblue";
		// Bloco Tarde
	} else {
		imagem.src = "assets/Noite.png";
		document.body.style.background = "lightgrey";
		// Bloco Noite
	}
}
