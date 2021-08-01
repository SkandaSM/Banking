package bankApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class BankAccountMain {

	public static void main(String[] args) throws SQLException {
		
		LinkedList<Account> account = new LinkedList<Account>();
		
		/*
		 * Checking checking=new Checking("Tom Cruze","124598734",1500); Savings
		 * savings=new Savings("Tom jerry","495867093",1500); savings.compound();
		 */
		 

		String file = "G:\\Tour\\Java\\Check.txt";
		LinkedList<String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolders) {
			String name = accountHolder[0];
			String aadhar = accountHolder[1];
			String accountType = accountHolder[2];
			double initialBalance = Double.parseDouble(accountHolder[3]);
		
			if (accountType.equalsIgnoreCase("savings")) {
				account.add(new Savings(name, aadhar, initialBalance));	 
			}
			else
			if (accountType.equalsIgnoreCase("checking")) {
				account.add(new Checking(name, aadhar, initialBalance));
				
			} else {
				System.out.println("Error creating the account");
			}
				}
		for (Account acc : account) {
			acc.showInfo();
		}
		
	
}
}
