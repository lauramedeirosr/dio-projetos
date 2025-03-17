// Laura Medeiros


import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Criar um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        //Incorporar variáveis para armazenar os valores
        int contaCliente;
        String agencia;
        String nomeCliente;
        double saldo;

        //Solicitar ao usuário que informe os valores
        System.out.println("Seja bem-vindo(a) ao Banco!");
        System.out.println("Informe o nome do cliente: ");
        nomeCliente = scanner.next();

        System.out.println("Informe o número da conta: ");
        contaCliente = scanner.nextInt();

        System.out.println("Informe a agência: ");
        agencia = scanner.next();

        System.out.println("Informe o saldo: ");
        saldo = scanner.nextDouble();

        //Exibir os valores informados
        System.out.println("Olá "+ nomeCliente +", agradecemos por criar uma conta em nosso banco, sua agência é " + agencia +", conta "+ contaCliente +" e seu saldo R$ "+ saldo +"já está disponível para saque");
    }
}
