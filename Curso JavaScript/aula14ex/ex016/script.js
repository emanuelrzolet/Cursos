function calcular() {
	var txtinicio = window.document.querySelector("input#inicio").value;
	var txtfim = window.document.querySelector("input#fim").value;
	var txtpasso = window.document.querySelector("input#passo").value;
	inicio = Number(txtinicio);
	fim = Number(txtfim);
	passo = Number(txtpasso);
	var res = window.document.querySelector("article#resultado");
	res.innerHTML = `Contando: <br>`;
	res.innerHTML += `${inicio}`;
	// Bloco nao funcionando
	if (inicio != null || fim != null || passo != null) {
		while (inicio + passo < fim) {
			res.innerHTML += `${inicio}`;
		}
	} else {
		res.innerHTML = "Impossível contar, verifique os campos digitados.";
	}
}
