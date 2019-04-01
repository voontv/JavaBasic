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
                                if(string.length()==1 && "?.,!".contains(string)){
                                        buffer=buffer.append(string);
                                } else {
                                        buffer=buffer.append(" "+string);
                                }
                                
                        }
                }
                return buffer.toString().trim();
        }

        public static String addSpacesIfMissing(String str){
                StringBuffer buffer = new StringBuffer(str);
                for(int i=0; i< buffer.length(); i++){
                        char c = buffer.charAt(i);
                        if(c == '.' || c == '!' || c == '?' || c == ','){
                               buffer.insert(i+1, " ");
                        }
                }          
                return buffer.toString().trim();
        }

        public static String upperCaseAllCaptions(String str){
                String words[]=str.split(" ");
                StringBuffer buffer = new StringBuffer();

                for(int i=words.length-1; i>=0; i--){
                        if(i==0){
                                words[i]=upperOneWord(words[i]);
                                break;
                        }
                        if(words[i-1].contains("!") || words[i-1].contains(".")
                                || words[i-1].contains("?")){
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
                if(str.length()>1){
                        return Character.toUpperCase(str.charAt(0))+str.substring(1).toLowerCase();
                } else {
                        return Character.toUpperCase(str.charAt(0))+"";
                }
        }
}