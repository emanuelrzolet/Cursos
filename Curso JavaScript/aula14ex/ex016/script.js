function calcular() {
	let inicio = window.document.querySelector("input#inicio").value;
	let fim = window.document.querySelector("input#fim").value;
	let passo = window.document.querySelector("input#passo").value;
	let res = window.document.querySelector("article#resultado");
	if (inicio.length == 0 || fim.length == 0 || passo.length == 0) {
		res.innerHTML = "impossivel contar";
		window.alert("[Erro] Impossível contar, verifique os campos digitados.");
	} else {
		res.innerHTML = `Contando: `;
		let i = Number(inicio);
		let f = Number(fim);
		let p = Number(passo);
		if (i < f) {
			for (let c = i; c <= f; c += p) {
				res.innerHTML += `${c} \u{1F449}`;
			}
			res.innerHTML += `\u{1F3C1}`;
		} else {
			for (let c = i; c >= f; c -= p) {
				res.innerHTML += `${c} \u{1F449}`;
			}
		}
		res.innerHTML += `${c} \u{1F449}`;
	}
}
