import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		printSumInteger(str);

	}

	public static void printSumInteger(String str) {
		int result = 0;
		for (String tempStr : str.split(" ")) {
			if(!tempStr.isEmpty()){
				tempStr=removeSpecialCharacter(tempStr);
				if (checkStringIsInteger(tempStr)) {
					result += Integer.parseInt(tempStr);
				}
			}
		}
		System.out.println("Ket qua tong cac so trong chuoi la " + result);
	}

	public static boolean checkStringIsInteger(String str) {
		for (int i = 0; i < str.length(); i++) {
			if(!Character.isDigit(str.charAt(i))){
				return false;
			}
		}
		return true;
	}
	public static String removeSpecialCharacter(String str){
        char lastIndex = str.charAt(str.length()-1);
		if(lastIndex == '?' || lastIndex == '.' || lastIndex == '!' || lastIndex == ',')
		{
			return str.substring(0,str.length()-1);
		}
            
        return str;

    }
	public static boolean isEmpty(String str){
		return str.length()==0;
	}
}