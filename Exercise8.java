import java.util.Scanner;

public class Exercise8{

        public static void main(String args[]){
                Scanner scanner = new Scanner(System.in);
                String string = scanner.nextLine();
                string = addSpacesIfMissing(string);
                string = removeAllRedundantSpaces(string);
                string = upperCaseAllCaptions(string);
                System.out.println(string);
        }

        public static String removeAllRedundantSpaces(String str){
                StringBuffer buffer = new StringBuffer();

                for(String string: str.split("[\\s]"))
                {
                        if(!string.isEmpty()){
                                if(string.equalsIgnoreCase("?") || string.equalsIgnoreCase("!")
                                        || string.equalsIgnoreCase(",") || string.equalsIgnoreCase(".")){
                                        buffer=buffer.append(string);
                                } else {
                                        buffer=buffer.append(" "+string);
                                }
                                
                        }
                }
                return buffer.toString().trim();
        }

        public static String addSpacesIfMissing(String str){
                String string = str;
                for(int i=0; i<string.length()-1; i++){
                        char c = string.charAt(i);
                        if((c == '!' || c =='?' || c == '.' || c == ',') &&  c != ' '){
                                string = string.substring(0, i+1).concat(" "+string.substring(i+1, string.length()));
                        }
                }
                return string.trim();
        }

        public static String upperCaseAllCaptions(String str){
                String words[]=str.split("[\\s]");
                StringBuffer buffer = new StringBuffer();
                for(int i=words.length-1;i>=0;i--){
                        if(i==0){
                                words[i]=upperOneWord(words[i]);
                                continue;
                        }
                        char endCharword=words[i-1].charAt(words[i-1].length()-1);
                        if(endCharword == '?' || endCharword == '!' || endCharword == '.'){
                                words[i]=upperOneWord(words[i]);
                        } else {
                                words[i] = words[i].toLowerCase();
                        }
                }
                for(int i=0;i<words.length;i++){
                        buffer=buffer.append(" "+words[i]);
                }
                return buffer.toString().trim();
        }

        public static String upperOneWord(String str){
                char []array = str.toCharArray();
                StringBuffer buffer = new StringBuffer();

                for(int i=0; i<array.length; i++){
                        if(i==0){
                                buffer=buffer.append(Character.toUpperCase(array[i]));
                        } else {
                                buffer = buffer.append(array[i]);
                        }
                }
                return buffer.toString().trim();
        }
}