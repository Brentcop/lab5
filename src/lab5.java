// Brent Coppinger Factorial Calculator Version 0.0.1
import java.util.Scanner;

public class lab5 {

	public static void main(String[] args) {
		char ans;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the factorial Calculator!");
		do {
			System.out.println("Please enter a number from 1-10 :");
			long userNum = scan.nextLong();
			long f = 1;

			if (userNum > 0 && userNum < 10) {

				for (long i = 1; i <= userNum; i++) {
					f = f * i;
				}
				System.out.println("The factorial of " + userNum + " is " + f);
			} else
				System.out.println("Enter a number between 1-9");
			System.out.println("Continue?(y/n)");
			ans = scan.next().charAt(0);
		} while ((ans != 'n') && (ans != 'N'));

		scan.close();
	}
}
