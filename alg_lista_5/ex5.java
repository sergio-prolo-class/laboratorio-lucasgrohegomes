import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a primeira parte (1 dígito): ");
        int n1 = scanner.nextInt();
        scanner.nextLine();

        String segundaParte = scanner.nextLine();
        int n2 = Integer.parseInt(String.valueOf(segundaParte.charAt(0)));
        int n3 = Integer.parseInt(String.valueOf(segundaParte.charAt(1)));
        int n4 = Integer.parseInt(String.valueOf(segundaParte.charAt(2)));
        int n5 = Integer.parseInt(String.valueOf(segundaParte.charAt(3)));
        int n6 = Integer.parseInt(String.valueOf(segundaParte.charAt(4)));
        int n7 = Integer.parseInt(String.valueOf(segundaParte.charAt(5)));

        String terceiraParte = scanner.nextLine();
        int n8 = Integer.parseInt(String.valueOf(terceiraParte.charAt(0)));
        int n9 = Integer.parseInt(String.valueOf(terceiraParte.charAt(1)));
        int n10 = Integer.parseInt(String.valueOf(terceiraParte.charAt(2)));
        int n11 = Integer.parseInt(String.valueOf(terceiraParte.charAt(3)));
        int n12 = Integer.parseInt(String.valueOf(terceiraParte.charAt(4)));
        // A matemática tá com certeza errada kkkkk
        System.out.printf("Digito verificador: %d", ((((n1 + n3 + n5 + n7 + n9 + n11) + (3*(n2 + n4 + n6 + n8 + n10 + n12)-1))%10)-9));

        System.out.println(n6);
        
    }
}
