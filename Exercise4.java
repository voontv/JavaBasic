import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		printSumInteger(s);

	}

	public static void printSumInteger(String s) {
		int result = 0;
		for (String i : s.split(" ")) {
			if (checkStringIsInteger(i)) {
				result += Integer.parseInt(i);
			}
		}
		System.out.println("Ket qua tong cac so trong chuoi la " + result);
	}

	public static boolean checkStringIsInteger(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < 48 || s.charAt(i) > 57)
				return false;
		}
		return true;
	}
}