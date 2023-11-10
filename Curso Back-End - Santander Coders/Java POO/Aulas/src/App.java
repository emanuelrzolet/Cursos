import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner espaçoScanner = new Scanner(System.in);
        Float espaço;
        Scanner tempoScanner = new Scanner(System.in);
        Float tempo;

        System.out.println("Digite o espaço: ");
        espaço= espaçoScanner.nextFloat();
        System.out.println("Digite o tempo: ");
        tempo = espaçoScanner.nextFloat();
        System.out.println(calcularVM(espaço, tempo));


    }

    //Metodo para medir a velocidade media V = s/t
    public static float calcularVM(float espaço, float tempo){
        return espaço/tempo;
    }
}
