var date = new Date();
var hora = date.getHours();

console.log(`Agora sao exatamente ${hora} horas.`);

if (hora < 12) {
	console.log("Bom dia!");
} else if (hora <= 18) {
	console.log("Boa tarde!");
} else {
	console.log("Boa noite!");
}
