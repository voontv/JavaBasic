import java.util.Scanner;

public class Exercise5{

        public static void main(String args[]){
                Scanner scanner = new Scanner(System.in);
                String string = scanner.nextLine();
                wordList(string);
        }

        public static void wordList(String str){
                String[] word = new String[countWordList(str)];
                int position=0;

                //created array String is word
                for(String string: str.split(" ")){
                        if(!string.isEmpty()){
                                string = removeSpecialCharacter(string);
                                word[position++]=string;
                        }
                }

                for(int i=0; i<word.length-1; i++){
                        int count=1;

                        for(int j=i+1; j<word.length; j++){
                                if(word[i].compareToIgnoreCase(word[j])==0){
                                        count++;
                                }
                        }

                        //neu in nhu the nay thi nhung tu xuat hien hon 3 lan va xuat hien cang o cuoi chuoi thi in se trung
                        if(count>2){
                                System.out.println(word[i]);
                        }
                }
        }

        public static int countWordList(String str){
                int position=0;

                for(String string: str.split(" ")){
                        if(!string.isEmpty()){
                                position++;
                        }
                }
                return position;
        }
        public static String removeSpecialCharacter(String str){
                char lastIndex = str.charAt(str.length()-1);
                if(lastIndex == '?' || lastIndex == '.' || lastIndex == '!' || lastIndex == ','){
                        return str.substring(0,str.length()-1);
                }   
                return str;
        }

        public static boolean isEmpty(String str){
                return str.length()==0;
        } 
}