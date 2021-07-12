import java.util.Random;
import java.util.Scanner;

public class CouponNumber {
public static int GenerateCoupon (int num){

		int arr [] =new int[num];
                for (int i=0; i<num; i++)
                {
	        Random r=new Random();
                int element= r.nextInt(1000);
                arr[i]=element;

		System.out.println(element);
		}
		return 0;
		}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N distinct coupon Number:-");
		int num=sc.nextInt();
		int z = GenerateCoupon(num);


	}

}

