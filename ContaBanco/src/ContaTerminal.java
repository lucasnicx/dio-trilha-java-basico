import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("por favor, informe seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, insira o valor a ser depositado: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco," +
                " sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +
                " já está disponível para saque.");

    }
}
