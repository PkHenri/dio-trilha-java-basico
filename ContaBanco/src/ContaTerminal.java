import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);
        // Enunciado
        System.out.println("Bem-vindo ao banco!");
        // Variáveis para armazenar os dados da conta
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;
        // Solicitar os dados do cliente
        System.out.print("Digite o número da conta: ");
        numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Agência: ");
        agencia = scanner.nextLine();

        System.out.print("Nome do cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Saldo: ");
        saldo = scanner.nextDouble();

        // Verificar se o saldo é negativo
        if (saldo < 0) {
            System.out.println("Saldo não pode ser negativo. Definindo saldo como 0.");
            saldo = 0;
        }

        // Exibir os dados da conta
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é: " + agencia);
        System.out.println("Sua conta é: " + numeroConta);
        System.out.println("Seu saldo é: R$ " + saldo);
        System.out.println("Aproveite nossos serviços!");
    }
}
