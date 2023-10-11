let valores = [8, 5, 7, 9, 0, 2, 10, 5, 0];

for (p = 0; p < valores.length; p++) {
	console.log(valores[p]);
}
for (let pos in valores) {
	console.log(pos);
}
console.log("teste");
console.log(valores.indexOf(0));
