package assignment;

public class Assignment12_PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 5;

		boolean prime = true;

		if (input < 1)
			
		{
			System.out.println(input + " is Not a prime no");
			prime = false;
		}
		for (int i = 2; i < input; i++)

		{
			if (input % i == 0)

				prime = false;
		}
// Final decision after checking all possible divisors
		if (prime)
			System.out.println(input + " is a prime number");
		else
			System.out.println(input + " is not a prime number");
	}
}