

c = total = 0
while True:
    try:
        nota = float(input("Digite a nota do aluno, digite qualquer outra coisa para sair: "))
        total += nota
        c += 1
    except ValueError:
        break
print(f"A média dos alunos informados é {total/c:.2f}")