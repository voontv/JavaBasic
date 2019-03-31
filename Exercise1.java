import java.util.Scanner;

public class Exercise1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
		listSentenceInString(str);
	}

	public static void listSentenceInString(String str) {
		String tempStr="";
		for(String str1: str.split(" ")){
			if(!str1.isEmpty()){
				tempStr=tempStr.concat(" "+str1);
				if(isEndSentences(str1)){
					System.out.println(tempStr);
					tempStr="";
				}
			}
		}
	}

	public static boolean isEndSentences(String str){
		int i= str.length()-1;
		boolean isCheck = (str.charAt(i) == '.' || str.charAt(i) == '?' || str.charAt(i) == '!'
		|| (i>1 && str.charAt(i - 1) == '\\' && str.charAt(i) == 'n'));
		return isCheck;
	}
	
	public static boolean isEmpty(String str){
		return str.length()==0;
	}
}