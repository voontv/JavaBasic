import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		printSumInteger(string);
	}

	public static void printSumInteger(String str) {
		int result = 0;
		for (String tempStr : str.split("[\\s\\.?,!]")) {
			if(!tempStr.isEmpty()){
				if (IsInteger(tempStr)) {
					result += Integer.parseInt(tempStr);
				}
			}
		}
		System.out.println("Ket qua tong cac so trong chuoi la " + result);
	}

	public static boolean IsInteger(String str) {
		
		for (int i = 0; i < str.length(); i++) {
			if(!Character.isDigit(str.charAt(i))){
				return false;
			}
		}
		return true;
	}
}