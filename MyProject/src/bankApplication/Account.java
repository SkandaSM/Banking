package bankApplication;

public abstract class Account implements baseRate{
	//list the properties specific to both savings and checking account
	 private	String name;
	 private	String aadhar;
	 private	double balance;
	 private static int index=10000;
	 protected String accountNumber;
	 private int random;
	protected double rate;
	public Account(String name,String aadhar,double balance) {
		this.name=name.toUpperCase();
		this.aadhar=aadhar;
		this.balance=balance;
		this.accountNumber=setAcountNumber();
		index++;	
		setRate();
		compound();
	} 
	public void  deposit(double amount) {
		balance=balance+amount;
		System.out.println("Ammount depposited: "+amount);
		printBalance(balance);
	}
	//Printing withdraw details
	public void withdraw(double amount) {
	 balance=balance-amount;
	 System.out.println("Ammount withdrawn: "+amount);
	 printBalance(balance);
	}
	//Printing transfer details
	public void transfer(String toWhere, double amount) {
		balance=balance+amount;
		System.out.println("Amount transfered to :"+toWhere+" amount:"+amount);
		printBalance(balance);
	}
	//Printing balance
	public void printBalance(double balance) {
		System.out.println("Balance now $: "+balance);
	}
	
	public abstract void setRate();
	
	//List the transactions common to both checking and savings account
	
	public void compound() {
		double interestAmount=balance*(rate/100);
		balance=balance+interestAmount;
	}
	
	private String setAcountNumber(){
		String lastTwoSsn=aadhar.substring(aadhar.length()-2,aadhar.length());
		int uniqueId=index;
		random=(int)(Math.random()*Math.pow(10, 3));
		return lastTwoSsn+uniqueId+random;
	}
	public void showInfo() {
		
		System.out.println("Name: "+name+
				"\nAccount Number: "+accountNumber+
				"\nBalance: "+balance
				+"\nRate: "+rate+"%"
				);
	}
}