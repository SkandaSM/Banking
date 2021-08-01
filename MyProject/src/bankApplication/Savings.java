package bankApplication;

public class Savings extends Account {
	
	// List the properties common to savings account
	 private int safetyDepositeNumber;
	 private int safetyKey;
	
		//Constructor to initialize the savings account properties
		public Savings(String name,String aadhar,double balance) {
			super(name,aadhar,balance);
			accountNumber="1"+accountNumber;
			setSafetyDepositeBoxId();
			showInfo();
		}
		
		//List the methods specific to savings account
		@Override
		public void setRate() {
			rate=getBaseRate()-.25;
		}
	
	private void setSafetyDepositeBoxId() {
		safetyDepositeNumber=(int)(Math.random()*Math.pow(10, 3));
		safetyKey=(int)(Math.random()*Math.pow(10, 4));
	}
	public void showInfo() {
		super.showInfo();
		System.err.println("Your savings account features: "
				+"\n    Safety deposite number: "+safetyDepositeNumber+
				"\n    Safety deposite key: "+safetyKey	);
		System.out.println("____________________________");

	}

	
		
}
