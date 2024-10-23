import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Todo - Criar um código que registra o nome, número, agência e saldo e retorna para o usuário.

        //Cria o objeto Scanner.
        Scanner scanner = new Scanner(System.in);

        //Pede para digitar o nome e registra.
        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.nextLine();

        //Pede para digitaro a agencia e registra.
        System.out.println("Digite sua agência:");
        int agencia = scanner.nextInt();

        //Pede para digitar o numero e registra.
        System.out.println("Digite o número da conta:");
        int numero = scanner.nextInt();

        //Pede para digitar o saldo e registra.
        System.out.println("Digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        //Output dos pedidos.
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
