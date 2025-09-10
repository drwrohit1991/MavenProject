package assignment;

import java.util.ArrayList;
import java.util.List;

public class Assignment3_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int [] transaction = new int[8];		
		List<Integer> transactionList = new ArrayList<Integer>();
		transactionList.add(50000);
		transactionList.add(-2000);
		transactionList.add(3000);
		transactionList.add(-15000);
		transactionList.add(-200);
		transactionList.add(-300);
		transactionList.add(4000);
		transactionList.add(-3000);
		System.out.println(transactionList);
		System.out.println(transactionList.size());

		int totalCredit = 0;
		int totalDebit = 0;
		int total = 0;
		int suspiciousCount = 0;
		for (int amount : transactionList) {
			if (amount < 0) {
				totalCredit += amount; // add only positive values
			} else {
				totalDebit += amount;
			}
			total += amount;
			if (Math.abs(amount) > 10000) {
				System.out.println("Suspicious credit/debit transaction with Amount: " + amount);
				suspiciousCount++;

			}
			System.out.println("Total Credited Amount: " + totalCredit);
			System.out.println("Total Debited Amount: " + Math.abs(totalDebit));
			System.out.println("Final Balance: " + total);
			System.out.println("Total Suspicious Transactions: " + suspiciousCount);

		}
	}
}
