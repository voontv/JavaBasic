import java.util.Scanner;

public class Exercise8{

        public static void main(String args[]){
                Scanner scanner = new Scanner(System.in);
                String string = scanner.nextLine();
                string = addSpacesIfMissing(string);
                string = removeAllRedundantSpaces(string);
                string = upperCaseAllCaptions(string);
                System.out.println("String ok is "+string);
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
                StringBuffer buffer = new StringBuffer();

                for(String string: str.split("[\\s]"))
                {
                        if(!string.isEmpty()){
                                if(haveSpecialCharacter(string)){
                                        if(string.contains("?")) {
                                                string = string.replace("?", "? ");               
                                        }
                                        if(string.contains("!")) {
                                                string = string.replace("!", "! ");                
                                        }
                                        if(string.contains(".")) {
                                                string = string.replace(".", ". ");                
                                        }
                                        if(string.contains(",")) {
                                                string = string.replace(",", ", ");             
                                        }   
                                }
                                buffer=buffer.append(" "+string);
                        }
                }        
                return buffer.toString().trim();
        }

        public static String upperCaseAllCaptions(String str){
                StringBuffer buffer = new StringBuffer(str);
                boolean needtoUpper=false;

                for(int i=0; i<str.length(); i++){
                        if((haveSpecialCharacter(str.charAt(i)) && (str.charAt(i) != ','))) {
                                needtoUpper = true;
                        }

                        if((needtoUpper && !haveSpecialCharacter(str.charAt(i)) && (str.charAt(i) != ' '))
                                || i==0) {
                                buffer.deleteCharAt(i);
                                buffer.insert(i, Character.toUpperCase(str.charAt(i)));
                                needtoUpper = false;
                        }
                }
                return buffer.toString().trim();
        }

        public static boolean haveSpecialCharacter(char c) {
                return haveSpecialCharacter(c+"");
        }

        public static boolean haveSpecialCharacter(String str) {
                return str.contains("?") || str.contains("!") || str.contains(".") || str.contains(",");
        }
}