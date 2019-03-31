import java.util.Scanner;

public class Exercise5{

        public static void main(String args[]){
                Scanner scanner = new Scanner(System.in);
                String string = scanner.nextLine();
                wordList(string);
        }

        public static void wordList(String str){
                String[] words = str.split("[\\s\\.?,!]");

                for(int i=0; i<words.length-1; i++){
                        int count=1;
                        if(words[i].isEmpty())
                        {
                                continue;
                        }
                        for(int j=i+1; j<words.length; j++){
                                if(words[i].equalsIgnoreCase(words[j])){
                                        count++;
                                }
                        }

                        //neu in nhu the nay thi nhung tu xuat hien hon 3 lan va xuat hien cang o cuoi chuoi thi in se trung
                        if(count>2){
                                System.out.println(words[i]);
                        }
                }
        }
}