import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double l1, l2, l3;

        System.out.print("Entre com os lados do triângulo: ");
        l1 = scanner.nextDouble();
        l2 = scanner.nextDouble();
        l3 = scanner.nextDouble();
        
        System.out.println(
        (!(((l1 + l2) > l3) &&
           ((l1 + l3) > l2) &&
           ((l2 + l3) > l1))) ?
           "Não é um triângulo" 
         : ((l1 == l2) && (l1 == l3)) ?
            "É um triângulo equilátero"
         : ((l1 != l2) && (l1 != l3) && (l2 != l3)) ?
            "É um triângulo escaleno"
         : "É um triângulo isósceles");
    }
}
