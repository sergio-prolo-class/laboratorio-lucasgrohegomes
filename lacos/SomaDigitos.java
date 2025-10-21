
import java.util.Scanner;

public class SomaDigitos {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Insira o número luquistico: ");
        numero = scanner.nextInt();

        int i = 0;
        String numeroTexto = String.valueOf(numero);
        char digit;
        int valorFinal = 0;

        while(i < numeroTexto.length()) {
            digit = numeroTexto.charAt(i);
            valorFinal += digit;
            i++;
        }

        System.out.println(valorFinal);

        scanner.close();
    }
}
