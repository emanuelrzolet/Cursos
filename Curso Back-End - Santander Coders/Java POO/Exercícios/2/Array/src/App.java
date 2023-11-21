import Pessoas.Pessoa;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner pesquiScanner = new Scanner(System.in);
        System.out.println("Para pesquisar digite o nome desejado: ");
        String pesquisa = pesquiScanner.nextLine();
        String resposta = "";

        Pessoa p1 = new Pessoa(10, "Analice");
        Pessoa p2 = new Pessoa(20,"Beatriz");
        Pessoa p3 = new Pessoa(15,"Fernanda");
        Pessoa p4 = new Pessoa(30,"Hellen");
        Pessoa p5 = new Pessoa(50,"Alice");
        Pessoa[] listPessoas = {p1,p2,p3,p4,p5};
        System.out.println(Arrays.toString(listPessoas));
        for(int c=0; c<listPessoas.length;){
            System.out.printf("Nome: %s, idade %s%n",listPessoas[c].getNome(),listPessoas[c].getIdade());
            
            if (listPessoas[c].getNome() == pesquisa) {
                resposta = "Nome Encontrado, o nome é: " + listPessoas[c].getNome() + " e sua idade é: " + listPessoas[c].getIdade();
                System.out.println(resposta);
        }else{
            resposta = "Nome nao encontrado";
        }
        c++;
            }
        System.out.println(resposta);
            
    }
}
