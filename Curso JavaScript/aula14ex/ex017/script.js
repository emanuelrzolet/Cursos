function gerarTabuada() {
	let num = document.querySelector("input#numero");
	let tab = document.getElementById("tabuada");
	if (num.value.length == 0) {
		window.alert("Digite um número válido!");
	} else {
		tab.innerHTML = "";
		let n = Number(num.value);
		for (let c = 1; c <= 10; c++) {
			let item = document.createElement("option");
			item.text = `${n} x ${c} = ${n * c}`;
			item.value = `tab${c}`;
			tab.appendChild(item);
		}
	}
}
