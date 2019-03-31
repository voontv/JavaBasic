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
				result += totalIntegerInWord(tempStr);
			}
		}
		System.out.println("Ket qua tong cac so trong chuoi la " + result);
	}

	public static int totalIntegerInWord(String word) {
		char array[]= word.toCharArray();
		int result=0;
		int count=0;

		for (int i = 0; i < array.length; i++) {
			if(!Character.isDigit(array[i])){
				count=0;					
			} else {
				count=count*10+array[i] - '0';
			}
			if(!Character.isDigit(array[i]) || i==array.length-1){
				result+=count;					
			}
		}
		return result;
	}
}