package bankApplication;

public class Checking extends Account {
// List the properties common to checking account
	 private long debitCardNumber;
	 private int debitCardPin;
	 
	//Constructor to initialize the checking account properties
	public Checking(String name,String aadhar,double balance) {
		super(name,aadhar,balance);
		accountNumber="2"+accountNumber;
		setDebitCard();
		showInfo();
	}
	//List the methods specific to checking account
	@Override
	public void setRate() {
		rate=getBaseRate()*.15;	
	}
	public void showInfo() {
		//System.out.println("_________________________");
		super.showInfo();
		System.err.println("Your Checking features:"
				+ "\n    Debit card number: "+debitCardNumber
				+"\n    Debit card pin:"+debitCardPin);
		System.out.println("__________________________________");
	}
	private void setDebitCard() {
		debitCardNumber=(long)(Math.random()*Math.pow(10, 12));//12 digit debitcard number
		debitCardPin=(int)(Math.random()*Math.pow(10, 4));// 4 digit debit card pin
	}
	
}

