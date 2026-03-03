package OrientacaoAoObjeto;

public class BankAccount {
    int id;
	String clientName;
	double balance;
	
	public void withDraw(double value) {
		if(value <= balance) { 
			balance -= value;
		}
	}
	
	public void deposit(double value) {
		if (value > 0) {
			balance += value;
		}
	}
	
	public void displayDetails() {
		System.out.println("Dados da conta: ");
		System.out.println("Codigo .: " + id);
		System.out.println("Nome ...: " + clientName);
		System.out.println("Saldo ..: R$ " + balance);
	}
	
	
}
