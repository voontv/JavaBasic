import java.util.Scanner;
public class Exercise5{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        wordAppearMoreTwice(wordList(str));
    }

    public static String[] wordList(String str){
        String word[]=new String[countWord(str)];
        int positions=0;
        for(String str1: str.split(" ")){
            if(!str1.isEmpty()){
                str1=removeSpecialCharacter(str1);
                word[positions]=str1;
                positions++;
            }
        }
        return word;
    }
    public static void wordAppearMoreTwice(String [] str){
        String[] tempStr = new String[str.length];
        tempStr=str;
        int count=0;
        for(int i=0;i<tempStr.length-1;i++){
            for(int j=i+1;j<tempStr.length;j++){
                if(isEmpty(tempStr[i])){
                    break;
                }
                if(!isEmpty(tempStr[j])){
                    if(tempStr[i].equalsIgnoreCase(tempStr[j])){
                        count++;
                        tempStr[j]="";
                    }
                }
                if(count>2){
                    System.out.println(tempStr[i]);
                    count=0;
                }
            }
        }
    }
    public static int countWord(String str){
        int positions=0;
        for(String str1: str.split(" ")){
            if(!str1.isEmpty()){
                positions++;
            }
        }
        return positions;
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
