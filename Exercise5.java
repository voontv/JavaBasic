import java.util.*;

public class Exercise5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printWordList(s);
    }
    public static void printWordList(String s){
        int length = countWordList(s);
        String wordList[] = new String[length];
        wordList = wordList(s,length);
        for(int i=0;i<length-1;i++){
            boolean checkRepeatWord=false;
            int count=0;
            for(int j=i+1;j<length;j++){
                if(wordList[i].compareToIgnoreCase(wordList[j])==0){
                    count++;
                }
            }
            if(count>1){
                for(int j=0;j<i;j++)
                {
                    if(wordList[i].compareToIgnoreCase(wordList[j])==0){
                        checkRepeatWord=true;
                        break;
                    }
                }
                if(!checkRepeatWord)
                {
                    System.out.println("word appear more twice in String is "+wordList[i]);
                }
            }
            
        }
    }

    public static String[] wordList(String s,int length){
        String[] word=new String[length];
        int count=0;
        for(String i: s.split(" "))
        {
            if(!i.isEmpty()){
                i = removeSpecialCharacter(i);
                word[count]=i;
                count++;
            }
        }
        return word;
    }
    public static int countWordList(String s){
        int count=0;
        for(String i: s.split(" "))
        {
            if(!i.isEmpty()){
                count++;
            }
        }
        return count;
    }
    public static String removeSpecialCharacter(String s){
        char lastIndex = 'c';
        if(s.trim().length()>1)
        {
            lastIndex = s.charAt(s.length()-1);
        }
        if(lastIndex == '?' || lastIndex == '.' || lastIndex == '!' || lastIndex == ',')
        {
            return s.substring(0,s.length()-1);
        }
        return s;

    }
    public static boolean isEmpty(String s){
        return s.length()==0;
    }
}