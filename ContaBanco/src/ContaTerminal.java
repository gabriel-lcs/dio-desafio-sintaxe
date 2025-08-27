import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome.");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua agência.");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua conta.");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o seu saldo.");
        float saldo = scanner.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de %.2f reais já está disponível para saque!", nome, agencia, conta, saldo);
    }
}