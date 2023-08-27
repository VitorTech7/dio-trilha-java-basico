import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo = 1527.30;

        System.out.println("Por favor, informe o seu nome: ");
        nomeCliente = sc.next();
        System.out.println("Por favor, digite o número da sua Agência: ");
        agencia = sc.next();
        System.out.println("Por favor, digite o número da sua Conta Bancária: ");
        numeroConta = sc.nextInt();

        System.out.println("Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é: "
                + agencia + ", conta: " + numeroConta
                + " e o seu saldo de "
                + saldo + " já está disponível para saque.");

    }
}