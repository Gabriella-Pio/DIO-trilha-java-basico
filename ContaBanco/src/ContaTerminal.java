import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String nomeCliente, agencia;
        int conta;
        double saldo;

        System.out.println("Olá! Seja bem vindo(a) ao ContaBanco!");
        System.out.println("Para inciarmos o registro, digite seu nome: ");
        nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta: ");
        conta = scanner.nextInt();

        System.out.println("Por favor, digite o valor que você deseja sacar: ");
        saldo = scanner.nextDouble();
        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
