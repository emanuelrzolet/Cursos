import java.util.Scanner;

import Animais.Cachorro;
public class aula3 {
    public static void main(String[] args) {
        Cachorro piche = new Cachorro();
        piche.nome = "Piche";
        piche.altura = 30;
        piche.peso = 9.1;
        piche.tamanhoDoRabo = 6;
        piche.cor = "preta";
        System.out.println(piche.altura);
        System.out.println("Voce está andando por uma floresta e encontra um animal.");
        System.out.printf("Chegando mais perto voce identifica que o animal é um %s", piche.getClass());
        System.out.printf("Ela é linda, pelo preto, na coleira há o nome %s, e parece ser muito amigavel.", piche.nome);
        while (piche.acao !="") {
        System.out.printf("Digite:%n[acariciar]%n[brincar]%n[chutar]");
        Scanner acaoScanner = new Scanner(System.in);
        System.out.println("Decida o que fazer: ");
        piche.acao = acaoScanner.nextLine();
        System.out.println(piche.acao);

        System.out.println(piche.interagir(piche.acao));
        }
    }
    
}
