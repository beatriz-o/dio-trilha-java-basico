import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Por favor, informe a Agência");
        agencia = sc.next();

        System.out.println("Informe o número da sua conta");
        numero = sc.nextInt();
        
        System.out.println("Informe o seu nome");
        nomeCliente = sc.next();

        System.out.println("Por favor, informe o saldo");
        saldo = sc.nextDouble();
        

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + 
        " já está disponível em nosso banco!");
    }
}
