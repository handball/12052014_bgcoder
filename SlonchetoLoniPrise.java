import java.util.Scanner;

public class SlonchetoLoniPrise {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			int assessment = input.nextInt();
			num[i] = assessment;
		}
		int secondNum = 0;
		int maxValue = 0;
		int number = 0;
		for (int i = 0; i < num.length; i++) {
			int curretNum = num[i];
			if (curretNum > maxValue) {
				secondNum = maxValue;
				maxValue = curretNum;
				
			} else if (curretNum > secondNum) {
				secondNum = curretNum;
			}
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i]==secondNum) {
				number = i+1;
			}
		}
		System.out.println(number);
	}
}
