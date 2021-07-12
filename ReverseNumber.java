import java.util.Scanner;

public class ReverseNumber
{
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number to reverse it :-");
		int Num = scan.nextInt();
		int reverse = 0;
		while(Num != 0)
		{
			int remainder = Num % 10;
			reverse = reverse * 10 + remainder;
			Num = Num/10;
		}
			System.out.println("The reverse of the given number is: " + reverse);
	}
}
