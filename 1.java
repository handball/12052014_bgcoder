import java.util.Scanner;

public class text_Problem01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int countLet = 0;
		int countSym = 0;
		int countInt = 0;
		for (int i = 0; i < str.length(); i++) {
			char strCh = str.charAt(i);
			if (Character.isDigit(strCh)) {
				countInt++;
			} else if (Character.isLetter(strCh)) {
				countLet++;
			} else {
				countSym++;
			}
		}
		if (countInt > countSym) {
			if (countInt > countLet) {
				System.out.println("C");
			} else {
				System.out.println("B");
			}
		} else if (countSym > countInt) {
			if (countSym > countLet) {
				System.out.println("Z");
			} else {
				System.out.println("B");
			}
		}
	}
}
