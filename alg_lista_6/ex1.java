import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int remMensal = 2000;
        int comissao;
        int vendas;
        int desempenho;
        int bonus;

        System.out.print("Entre com o total de vendas (R$) : ");
        vendas = scanner.nextInt();
        System.out.print("Entre com a avaliação de desempenho (1-10): ");
        desempenho = scanner.nextInt();

        comissao = (vendas >= 10000) ? 7 : 5;
        bonus = (desempenho >= 8) ? 500 : 0; 

        System.out.printf("Remuneração: R$ %d", remMensal + bonus + (vendas * comissao / 100));
        scanner.close();
    }
}
