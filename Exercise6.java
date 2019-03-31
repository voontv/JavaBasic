import java.util.Scanner;

public class Exercise6{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String string= scanner.nextLine();
        swapStringLowerUpper(string);
    }

    public static void swapStringLowerUpper(String str){
        String temp="";

        for(int i=0; i<str.length(); i++){
            temp+=swapCharLowerUpper(str.charAt(i));
        }
        System.out.println(temp);
    }

    public static char swapCharLowerUpper(char c){
        return Character.isLowerCase(c) ?Character.toUpperCase(c):Character.toLowerCase(c);
    }   
}
