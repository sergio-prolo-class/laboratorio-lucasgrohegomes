import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o ano: ");
        int ano = scanner.nextInt();

        System.out.print((ano % 400 == 0 || 
            (ano % 100 != 0 && ano % 4 == 0))
                ? "É bissexto."
                : "Não é bissexto."
        );
    }
}
