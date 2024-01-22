import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a senha de quatro duigitos: ");
        int senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("SENHA INCORRETA");
            senha = sc.nextInt();
        }

        System.out.println("SENHA CORRETA");

        sc.close();
    }
}
