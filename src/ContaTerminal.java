import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int numeroConta = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0;

        System.out.println("Preencha os dados para criar uma conta");
        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o número da Conta: ");
        numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite o número da Agência");
        agencia = scanner.next();
        System.out.println("Por favor, dgite o seu saldo: ");
        saldo = scanner.nextDouble();

        System.out.printf("%nOlá %s, obrigado por criar uma conta em nosso banco. %nSua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque", nomeCliente, agencia, numeroConta, saldo);
        scanner.close();
    }
}
