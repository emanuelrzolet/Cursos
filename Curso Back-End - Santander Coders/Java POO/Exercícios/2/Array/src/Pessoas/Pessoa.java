package Pessoas;

public class Pessoa {
    private int idade;
    private String nome;



    //Construtor
    /**
     * @param idade
     * @param nome
     */
    public Pessoa(int idade, String nome){
        this.idade = idade;
        this.nome = nome;
    }

    

    //Getters and Setters

    @Override
    public String toString() {
        return "Pessoa [idade=" + idade + ", nome=" + nome + "]";
    }



    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
