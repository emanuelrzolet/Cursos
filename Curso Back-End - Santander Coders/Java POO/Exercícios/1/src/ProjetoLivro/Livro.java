package ProjetoLivro;

public class Livro implements Publicacao{
    private String título;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa pessoa;

    //Construtor
    /**
     * @param título
     * @param autor
     * @param totPaginas
     * @param pagAtual
     * @param aberto
     * @param pessoa
     */
    public Livro(String título, String autor, int totPaginas, int pagAtual, boolean aberto, Pessoa pessoa) {
        this.título = título;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = pagAtual;
        this.aberto = aberto;
        this.pessoa = pessoa;
    }
    
    //Métodos
    
    public void detalhes(){
        System.out.println();

    }

    @Override
    public String toString() {
        return "Livro [título=" + título + ", autor=" + autor + ", totPaginas=" + totPaginas + ", pagAtual=" + pagAtual
                + ", aberto=" + aberto + ", pessoa=" + pessoa + "]";
    }
    //Getters And Setters

    /**
     * @return the título
     */
    public String getTítulo() {
        return título;
    }

    /**
     * @param título the título to set
     */
    public void setTítulo(String título) {
        this.título = título;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the totPaginas
     */
    public int getTotPaginas() {
        return totPaginas;
    }

    /**
     * @param totPaginas the totPaginas to set
     */
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    /**
     * @return the pagAtual
     */
    public int getPagAtual() {
        return pagAtual;
    }

    /**
     * @param pagAtual the pagAtual to set
     */
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    /**
     * @return the aberto
     */
    public boolean isAberto() {
        return aberto;
    }

    /**
     * @param aberto the aberto to set
     */
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    /**
     * @return the pessoa
     */
    public Pessoa getPessoa() {
        return pessoa;
    }

    /**
     * @param pessoa the pessoa to set
     */
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    //Métodos Abstratos

    @Override
    public void abrir() { setAberto(true);
    }

    @Override
    public void fechar() {
        setAberto(false);

    }

    @Override
    public void folhear(int p) {
        this.pagAtual = p;
    }

    @Override
    public void avançarPag() {
        this.pagAtual ++;
    }

    @Override
    public void voltarPag() {
    this.pagAtual--;
    }
    


    
}
