import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da temperatura em Fahrenheit: ");
        double fahr = scanner.nextDouble();
        System.out.printf("Temperatura em Celcius: %.2f",(fahr - 32) * 5/9);
        scanner.close();
    }
}
