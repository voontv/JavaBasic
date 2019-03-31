import java.util.Scanner;

public class Exercise2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		printWord(str);
	}

	public static void printWord(String str) {
		for (String tempStr : str.split(" ")) {
			if(!tempStr.isEmpty()){
				tempStr=removeSpecialCharacter(tempStr);
				if(charOfWord(tempStr)){
					System.out.println(tempStr);
				}
			}
            
		}
	}

    public static String removeSpecialCharacter(String str){
        char lastIndex = 'c';
        if(str.trim().length()>1){
            lastIndex = str.charAt(str.length()-1);
        }
        if(lastIndex == '?' || lastIndex == '.' || lastIndex == '!' || lastIndex == ','){
            return str.substring(0, str.length()-1);
        }
        return str;

	}
	
	public static boolean charOfWord(String str) {
		for(int i = 0; i < str.length(); i++){
			if(!Character.isLetterOrDigit(str.charAt(i))){
				return false;
			}
			
		}
		return true;
	}

	public boolean isEmpty(String str)
	{
		return str.length()==0;
	}
}
