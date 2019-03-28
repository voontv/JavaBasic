import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		printWord(s);
		// System.out.println(charOfWord(s));
	}

	public static void printWord(String s) {
		for (String i : s.split(" ")) {
			if (charOfWord(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean charOfWord(String b) {
		int convertToInt;
		boolean checkCorrect = true;
		for (int i = 0; i < b.length(); i++) {
			convertToInt = (int) b.charAt(i);
			checkCorrect = (convertToInt >= 65 && convertToInt <= 90) || (convertToInt >= 97 && convertToInt <= 122)
					|| (convertToInt >= 48 && convertToInt <= 57);
			if (!checkCorrect) {
				return checkCorrect;
			}
		}

		return checkCorrect;
	}
}
