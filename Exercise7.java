import java.util.*;

public class Exercise7{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String superStr = scanner.nextLine();
        String childStr = scanner.nextLine();
        positionStringChildren(superStr, childStr);
    }

    public static void positionStringChildren(String superStr,String childStr){

        for(int i=0; i<superStr.length()-childStr.length(); i++){
            if(superStr.substring(i, i+childStr.length()).equalsIgnoreCase(childStr)){
                System.out.println("Position of String Children is "+i);
            }
        }
    }
}