
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
    Scanner s = new Scanner(System.in);
    System.out.println("Digite o numero da conta:");    
    int numero = s.nextInt();
    System.out.println("Digite o numero da agencia:");  
    String agencia = s.next();
    System.out.println("Digite o nome do Cliente:");
    String nomeCliente = s.next();
    System.out.println("Digite o saldo:");
    double saldo = s.nextDouble();
    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
