package contabanco;

import java.util.*;

public class ContaTerminal {

	public static void main(String[] args) throws Exception
	{
	     Locale.setDefault(Locale.US);
	     Scanner scan = new Scanner(System.in);
	     
	     int numero;
	     String agencia;
	     String nome;
	     double saldo = 2000.00;
	     
	     System.out.print("Por favor, digite o número da agência! ");
	     agencia = scan.next();
	     System.out.print("Por favor, digite o número da conta! ");
	     numero = scan.nextInt();
	     System.out.print("Por favor digite o nome do cliente! ");
	     scan.nextLine();
	     nome = scan.nextLine();
	     System.out.println();
	     System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
	           + agencia + ", conta " + numero + "\n e seu saldo " + saldo + " já está dísponivel para saque");
     
	     scan.close();
	}

}
