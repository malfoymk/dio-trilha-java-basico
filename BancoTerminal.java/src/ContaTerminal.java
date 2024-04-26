import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o número da conta: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha pendente

        System.out.print("Digite o número da agência: ");
        String agency = scanner.nextLine();

        System.out.print("Digite o nome do titular: ");
        String accountHolder = scanner.nextLine().toUpperCase();

        System.out.print("Digite o saldo da conta: ");
        double balance = Double.parseDouble(scanner.nextLine());

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                accountHolder, agency, accountNumber, balance);

        scanner.close();
    }
}
