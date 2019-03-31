import java.util.*;

class Exercise3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		printWord(str);
	}

	public static void printWord(String str) {
		for (String tempStr : str.split(" ")) {
            if(!tempStr.isEmpty())
            {
                tempStr=removeSpecialCharacter(tempStr);
                if (checkSymmetry(tempStr)) {
                    System.out.println("Co chuoi ky tu doi xung");
                    break;
                }
            }   
		}
	}

	public static boolean checkSymmetry(String str) {
        if(str.length()<2){
            return false;
        }
         
		for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
				return false;
            }
		}
		return true;
    }

    public static String removeSpecialCharacter(String str){
        char lastIndex = str.charAt(str.length()-1);
        if(lastIndex == '?' || lastIndex == '.' || lastIndex == '!' || lastIndex == ','){
            return str.substring(0,str.length()-1);
        }
        return str;

    }

    public boolean isEmpty(String str)
	{
		return str.length()==0;
	}
}
