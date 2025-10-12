import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com a quantidade de centavos: ");
        int centavos = scanner.nextInt();

        int quant = centavos / 50;
        System.out.printf("Moedas de 50 centavos: %d %n",quant);
        centavos -= quant * 50;

        quant = centavos / 25;
        System.out.printf("Moedas de 25 centavos: %d %n",quant);
        centavos -= quant * 25;

        quant = centavos / 10;
        System.out.printf("Moedas de 10 centavos: %d %n",quant);
        centavos -= quant * 10;

        quant = centavos / 5;
        System.out.printf("Moedas de 5 centavos: %d %n",quant);
        centavos -= quant * 5;

        System.out.printf("Moedas de 1 centavo: %d %n", centavos);
        
        scanner.close();
    }  
}
