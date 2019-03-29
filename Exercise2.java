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
            i=removeSpecialCharacter(i);
			if (charOfWord(i)) {
				System.out.println(i);
			}
		}
	}
    public static String removeSpecialCharacter(String s){
        char lastIndex = s.charAt(s.length()-1);
        if(lastIndex == '?' || lastIndex == '.' || lastIndex == '!' || lastIndex == ',')
            return s.substring(0,s.length()-1);
        return s;

    }
	public static boolean charOfWord(String b) {
		int convertToInt;
		boolean checkCorrect = true;
		for (int i = 0; i < b.length(); i++) {
			convertToInt = (int) b.charAt(i);
			checkCorrect = (convertToInt >= 'A' && convertToInt <= 'Z') || (convertToInt >= 'a' && convertToInt <= 'z')
					|| (convertToInt >= '0' && convertToInt <= '9');
			if (!checkCorrect) {
				return checkCorrect;
			}
		}

		return checkCorrect;
	}
}
