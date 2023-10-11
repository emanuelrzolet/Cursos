function parImpar(n) {
	if (n % 2 == 0) {
		return "Par";
	} else {
		return "Impar";
	}
}

function soma(n1 = 0, n2) {
	return n1 + n2;
}
console.log(parImpar(10));
console.log(soma(1, 2));
