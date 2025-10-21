package imc;

import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o seu peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Insira a sua altura: ");
        double altura = scanner.nextDouble();

        int imc = (int) Math.round(peso / (altura * altura));
        int caseVar = 
        (imc < 18)
        ? 1
        : (imc < 25)
        ? 2
        : (imc < 30)
        ? 3
        : (imc < 35)
        ? 4
        : (imc < 40)
        ? 5
        : (imc >= 40)
        ? 6
        : 0;

        String classificacao = switch (caseVar) {
            case 1 -> "Baixo peso";
            case 2 -> "Peso Normal";
            case 3 -> "Sobrepeso";
            case 4 -> "Obesidade grau I";
            case 5 -> "Obesidade grau II";
            case 6 -> "Obesidade grau III";
            default -> "Fizesse merda ae";
        };

        System.out.printf("%.3f, %s \n", (peso / (altura * altura)), classificacao);

        scanner.close();
    }
}
