import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a to check Prime or not :-");
		int A = scan.nextInt();
		if (A==0)
		{
			System.out.println("Invalid input, Please enter greater than 0");
		}
		else if (A%2==0)
		{
			System.out.println(A+" "+ "is a Prime Number");
		}
		else
		{
			System.out.println(A+" "+ "is not a Prime Number");
		}
	}

}
