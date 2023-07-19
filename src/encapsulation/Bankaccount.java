package encapsulation;

public class Bankaccount {
	private double accountNo;
	private double balance;
	public Bankaccount(double accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance=balance;
	}

	public double getaccountNo() {
		return accountNo;
	}
	public void   setaccountNo(double accountno) {
		this.accountNo =accountNo;
	}
	public double getbalance() {
		return balance;
	}
	public void setbalance(double balance) {
		this.balance=balance;
	}
	public static void main(String[] args) {
		Bankaccount bankaccount =new Bankaccount(0356546, 50000);
		System.out.println(bankaccount.getaccountNo());
		System.out.println(bankaccount.getbalance());
		bankaccount.setaccountNo(021202);
		bankaccount.setbalance(23000);
		
		System.out.println(bankaccount.getbalance());

	}

}
