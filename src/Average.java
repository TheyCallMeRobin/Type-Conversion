import java.util.Scanner;
public class Average {
	public static void main(final String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first number and hit enter: ");
		int firstNum = input.nextInt();
		System.out.println("Enter the second number and hit enter: ");
		int secondNum = input.nextInt();
		System.out.println("Enter the third number and hit enter: ");
		int thirdNum = input.nextInt();

		int numSum = firstNum + secondNum + thirdNum;
		double numAverage = numSum / 3;

		// Edit the following lines to include the result numbers
		System.out.println("The numbers entered are: " + firstNum + ", " + secondNum + ", and " + thirdNum);
		System.out.println("The sum of the numbers is: " + numSum);
		System.out.println("The average of the numbers is: " + numAverage);

		input.close();
	}
}
