import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 750.50f;

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();
        
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Informe o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco," + 
        " sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.", nomeCliente, agencia, numeroConta, saldo);
        //aqui usei um print formatado "printf"

    }
}
