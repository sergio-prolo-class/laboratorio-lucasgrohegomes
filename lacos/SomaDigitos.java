
import java.util.Scanner;

public class SomaDigitos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numero;
        

        System.out.print("Insira o número luquistico: ");
        numero = scanner.nextInt();
        
        int acumulador = numero;
        int acumulador2 = 0;
        int iterador = 0;

        boolean pronto = true;

        while(pronto) {
            while(acumulador % 10 >= 1) {
                acumulador /= 10;
                iterador
            }
            acumulador2 += acumulador;
            acumulador = numero - acumulador / 10;
            acumulador /= 10;
            if ()
        }

        System.out.println(acumulador2);

        scanner.close();
    }
}
