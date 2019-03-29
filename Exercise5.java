import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
        //wordAppearTwice(s);
        wordAppearMoreTwice(wordList(s));
	}

	public static void wordAppearMoreTwice(String []word) {
        int count=0;
        int position=0;
        String wordTemp[]=new String[word.length/2];

        for(int i=0;i<word.length-1;i++)
        {
            for(int j=i+1;j<word.length;j++)
            {
                if(word[i].compareToIgnoreCase(word[j])==0)
                {
                    count++;
                }
            }
            if(count>2)
            {
                wordTemp[position]=word[i];
                position++;
            }
        }
        for(int i=0;i<wordTemp.length-1;i++){
            boolean wordSameAs=false;
            for(int j=i+1;j<wordTemp.length;j++){
                if(wordTemp[i].compareToIgnoreCase(wordTemp[j])==0)
                {
                    wordSameAs=true;
                    break;
                }
                
            }
            if(!wordSameAs)
            {
                System.out.println("word appear more twice is "+wordTemp[i]);
            }
        }
    }
    public static String[] wordList(String s) {
        int size = sizeWordList(s);
        String[] word=new String[size];
        for(String i: s.split(" ")){
            if(i.trim().length()>0)
            {
                word[position]=i;
            }
            
        }
        return word;
    }

    public static int sizeWordList(String s) {
        int position=0;
        for(String i: s.split(" ")){
            if(i.trim().length()>0){
                position++;
            } 
        }
        return position;
    }
}