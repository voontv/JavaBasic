import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		listSentenceInString(s);
	}

	public static void listSentenceInString(String s) {
		int position = 0;
		for (int i = position; i < s.length(); i++) {
			if (s.charAt(i) == '.' || s.charAt(i) == '?' || s.charAt(i) == '!'
					|| (i != 0 && s.charAt(i - 1) == '\\' && s.charAt(i) == 'n')) {
				System.out.println(s.substring(position, i + 1));
				position = i + 1;
			}

		}
	}

}