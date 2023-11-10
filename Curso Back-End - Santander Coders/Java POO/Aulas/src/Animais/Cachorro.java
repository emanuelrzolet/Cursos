package Animais;

public class Cachorro {
    public String nome;
    public String acao;
    public String cor;
    public int altura;
    public double peso;
    public int tamanhoDoRabo;
    public String estadoDoEspirito;
    public void comer(){}
    public void latir(){
        System.out.println("Au AU");
    }
    public String interagir(String acao){
        if (acao == "chutar") {
            this.estadoDoEspirito = "Piche reage mal, baixa seu rabinho e deita embaixo da mesa.";
            
        }else if (acao == "acariciar") {
            this.estadoDoEspirito = "Piche adorou seu carinho, ficou muito feliz, rabinho abanando.";
            
        }else if(acao == "brincar"){
            this.estadoDoEspirito = "Piche endoideceu, tentou te morder, e está correndo sem rumo!";
        }
        
        return this.estadoDoEspirito;
    }
}
