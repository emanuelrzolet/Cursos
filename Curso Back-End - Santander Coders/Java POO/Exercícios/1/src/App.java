import ProjetoLivro.Pessoa;
import ProjetoLivro.Livro;
public class App {
    public static void main(String[] args) throws Exception {
        Pessoa emanuel = new Pessoa("Emanuel",25,"Masculino");
        System.out.println(emanuel.getIdade());
        emanuel.fazerAniversário();
        System.out.println(emanuel.getIdade());
        Livro narnia = new Livro("Cronicas de Nárnia", "Desconhecido", 200, 30, false, emanuel);
        System.out.println(narnia.toString());
        narnia.abrir();


    }
}
