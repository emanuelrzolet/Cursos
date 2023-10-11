let txtnum = window.document.querySelector("input#txtnum");
let lista = [];
let select = window.document.querySelector("select#listnum");
let resultado = window.document.querySelector("div#res");

function adicionar(n) {
	n = Number(txtnum.value);
	if (txtnum.value.length == 0 || n > 100 || n < 1) {
		window.alert("Digite um valor válido.");
	} else {
		if (lista.indexOf(n) != -1) {
			window.alert("Valor já está presente na lista!");
		} else {
			lista.push(n);
			let item = document.createElement("option");
			item.text = `Valor ${n} foi adicionado.`;
			select.appendChild(item);
		}
	}
}

function analisar(list) {
	list = lista;
	let soma = 0;
	for (let pos in list) {
		if (pos == 0) {
			var maior = list[pos];
			var menor = list[pos];
		}
		soma += list[pos];
		if (maior < list[pos]) {
			maior = list[pos];
		}
		if (menor > list[pos]) {
			menor = list[pos];
		}
	}
	let media = soma / list.length;
	resultado.innerHTML += `<p>Ao todo temos ${list.length} números cadastrados</p>`;
	resultado.innerHTML += `<p>O maior valor informado foi ${maior}</p>`;
	resultado.innerHTML += `<p>O menor valor informado foi ${menor}</p>`;
	resultado.innerHTML += `<p>Somando todos os valores, temos ${soma}</p>`;
	resultado.innerHTML += `<p>A média dos valores é: ${media}</p>`;
}
