package assignment;

public class Assignment8_ConditionalStatementsLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] transations = { 5000, -2000, 3000, -15000, -200, -300, 4000, -3000 };

		int totaldebits = 0;
		int totalcredits = 0;
		int totaldebitammount = 0;
		int totalcreditammount = 0;
		int suspicioustransaction = 0;

		for (int ammount : transations) {
			if (totaldebits > 0) {
				totalcredits++;
				totalcreditammount += ammount;

				if (ammount > 10000) {
					System.out.println("Suspicious transation with ammount " + ammount);
					suspicioustransaction++;
				}
			} else {
				totaldebitammount++;
				totaldebitammount -= ammount;
				if (ammount > -10000) {
					System.out.println("Suspicious transation with ammount " + ammount);
					suspicioustransaction++;
				}
			}
		}
		int finalbalance = totalcreditammount - totaldebitammount;
//Print a summary of the account activity
		System.out.println("----- Transaction Summary -----");
		System.out.println("Total number of credit transactions: " + totalcredits);
		System.out.println("Total number of debit transactions: " + totaldebits);
		System.out.println("Total amount credited: " + totalcreditammount);
		System.out.println("Total amount debited: " + totaldebitammount);
		System.out.println("Final remaining amount in the account: " + finalbalance);
		System.out.println("Total number of suspicious transactions: " + suspicioustransaction);

	}
}
