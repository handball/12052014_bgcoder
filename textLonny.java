package bgcoder;

import java.util.Scanner;


public class textLonny {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String sixSymbol = in.next();
		int countDigit = 0;
		int countLetter = 0;
		int countOther = 0;
		for (int i = 0; i < sixSymbol.length(); i++) {
			if (Character.isDigit(sixSymbol.charAt(i))) {
				countDigit++;
			} else if (Character.isLetter(sixSymbol.charAt(i))) {
				countLetter++;
			} else {
				countOther++;
			}

		}
		if (countDigit > countLetter) {
			if (countDigit > countOther) {
				System.out.println("C");
			} else {
				System.out.println("Z");
			}
		} else {
			if (countLetter > countOther) {
				System.out.println("B");
			} else {
				System.out.println("Z");
			}
		}

	}
}
