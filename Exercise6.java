import java.util.Scanner;

public class Exercise6{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str= scan.nextLine();
        swapStringLowerUpper(str);
    }
    public static void swapStringLowerUpper(String str){
        String temp="";
        for(int i=0;i<str.length();i++)
        {
            
            temp+=swapCharLowerUpper(str.charAt(i));
        }
        System.out.println(temp);
    }
    public static char swapCharLowerUpper(char c){
        if(((int)c>= 'A' && (int)c<='Z') || ((int)c>= 'a' && (int)c<='z'))
        {
           
            if(Character.isLowerCase(c)){
                c=Character.toUpperCase(c);
            }
            else{
                c = Character.toLowerCase(c);
            }
        }
        return c;
    }
}