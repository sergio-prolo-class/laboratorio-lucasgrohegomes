import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite as notas do aluno: ");
        double nota = scanner.nextDouble();
        nota += scanner.nextDouble();
        nota += scanner.nextDouble();
        nota += scanner.nextDouble();
        System.out.print("Digite a presenca do aluno: ");
        int presenca = scanner.nextInt();

        System.out.printf("Média: %.1f - %s", nota / 4,
        (nota / 4 >= 6 && presenca >= 75) ? 
                                "Aprovado" :
                                "Reprovado");
        scanner.close();
    }
}
