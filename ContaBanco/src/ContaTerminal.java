import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Por favor, digite o número da conta:");
            int numeroConta = scanner.nextInt();

            System.out.println("Por favor, digite o número da agência:");
            String numeroAgencia = scanner.next();

            System.out.println("Por favor, digite o nome do cliente:");
            String nomeCliente = scanner.next();

            System.out.println("Por favor, digite o saldo da conta:");
            double saldoConta = scanner.nextDouble();

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
            System.out.println("Sua conta é " + numeroConta + " e sua agência é " + numeroAgencia + ".");
            System.out.printf("Seu saldo é R$ %.2f%n", saldoConta);
            System.out.println("Aproveite nossos serviços!");
        
        }
    }

}