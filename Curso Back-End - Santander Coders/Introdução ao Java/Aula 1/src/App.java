import java.time.LocalDate;
import java.util.Arrays;
public class App {
    public static void main(String[] args) throws Exception {
        String nome = "Emanuel";
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje.getDayOfWeek());
        System.out.println("Hello, " + nome.toUpperCase());
        for (int i=1; i<=10;i++){
            System.out.println(i);
        }
        String[] letras = {"A","B","C","D"};
        System.out.println(Arrays.toString(letras));

    }
}
