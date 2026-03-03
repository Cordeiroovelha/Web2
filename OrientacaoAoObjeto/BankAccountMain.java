package OrientacaoAoObjeto;

public class BankAccountMain {
    public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		System.out.println(account1);
		account1.displayDetails();
        System.out.println("--------------------------");
        account1.deposit(1000);
        System.out.println("Saldo atualizado: R$ " + account1.balance);
        System.out.println("--------------------------");
        account1.withDraw(500);
        System.out.println("Saldo atualizado: R$ " + account1.balance);
        account1.clientName = "Arthur Morgan";


        BankAccount account2 = new BankAccount();
        account2.clientName = "Dutch Van Der Linde";
        account2.displayDetails();
        account2.deposit(100);
        System.out.println("Saldo atualizado: R$ " + account1.balance);
        System.out.println("--------------------------");
        account1.withDraw(500);
        System.out.println("Saldo atualizado: R$ " + account1.balance);
        System.out.println("--------------------------");
        account2.displayDetails();
	}
}
