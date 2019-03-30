import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
        standardizedWord(str);
	}

    public static void standardizedWord(String str){
        String[] wordList = new String[countWordList(str)];
        int position=0;
        boolean needUpper=false;
        String strStandardized="";
        for (String tempStr : str.split(" ")) {
			if(!tempStr.isEmpty()){
                wordList[position++]=tempStr;
			}
        }
        for(int i=0;i<wordList.length;i++){
           if(i==0 || needUpper){
               wordList[i] = wordUpper(wordList[i]);
               needUpper=false;
           }
           else{
               wordList[i]=wordList[i].toLowerCase();
           }
           if(checkSpecialCharacter(wordList[i]))
           {
               needUpper=true;
           }
           strStandardized=strStandardized.concat(" "+wordList[i]);
        }
        System.out.println("String is standardized "+strStandardized);
    }
    public static String wordUpper(String str){
        if(str.length()>1){
            return (Character.toUpperCase(str.charAt(0))+str.substring(1, str.length()).toLowerCase());
        }
        else
        {
            return str.toUpperCase();
        }
    }
    public static int countWordList(String str){
        int count=0;
        for (String tempStr : str.split(" ")) {
			if(!tempStr.isEmpty()){
				count++;
			}
        }
        return count;
    }
	public static boolean checkSpecialCharacter(String str){
        char lastIndex = str.charAt(str.length()-1);
        return (lastIndex == '?' || lastIndex == '.' || lastIndex == '!');

    }
	public static boolean isEmpty(String str){
		return str.length()==0;
	}
}