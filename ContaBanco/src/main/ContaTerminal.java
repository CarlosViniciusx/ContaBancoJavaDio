package main;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number;
		String agency;
		String name_client;
		double balance;
		
		System.out.print("Por favor, insira o número da conta: ");
		number = sc.nextInt();
		
		System.out.print("Por favor, digite o número da Agência!: ");
		sc.nextLine();
		agency = sc.nextLine();
		
		System.out.print("Por favor, insira o nome do cliente: ");
		name_client = sc.nextLine();
		
		System.out.print("Por favor, insira o saldo: ");
		balance = sc.nextDouble();
		
		System.out.println();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", name_client, agency, number, balance);
		
		sc.close();

	}

}
