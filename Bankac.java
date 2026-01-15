package encaps;

public class Bankac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bankAccount ba = new bankAccount("8977157720",10000.00);
		System.out.println("accountnumber: " + ba.getAccountNum());
		System.out.println("Accountbalance: " + ba.getaccountbalance() );
		System.out.println("deposting money: " + ba.deposit(50000.00));
		System.out.println("showing balance after deposting:" + ba.getaccountbalance());
	    System.out.println("withdrawing money from bank: " + ba.withdraw(20000.00));
	    System.out.println("showing balance after withdrawing :" + ba.getaccountbalance());
	}

}

class bankAccount {
	private String accountnumber;
	private double accountbalance;
	
	bankAccount(String accountnum, double acbal){
		this.accountnumber=accountnum;
		this.accountbalance=acbal;
	}
	public String getAccountNum() {
		return accountnumber;
	}
	public double getaccountbalance() {
		return accountbalance;
	}
	
	double deposit(double adding) {
		accountbalance+=adding;
		return accountbalance;
	}
	 double withdraw(double amt) {
		if(amt <=accountbalance) {
			accountbalance-=amt;
		} else {
			System.out.println("insufficient funds , you can't withdraw , deposit more");
		}
		return accountbalance;
	}
	
}