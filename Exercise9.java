import java.util.*;

public class Exercise9{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        shortcutString(str);
    }

    public static void shortcutString(String str){
        StringBuffer tempStr=new StringBuffer();
        char[] array = str.toCharArray();

        for(int i=0; i<array.length-1; i++){
            int count=1;
            for(int j=i+1; j<=array.length; j++){
                if(j==array.length || array[i]!=array[j]){
                    tempStr = tempStr.append(array[i]);
                    i=j-1;
                    break;
                }
                else{
                    count++;
                }
            }
            if(count>1){
                tempStr = tempStr.append(count);
            }
        }
        System.out.println("String after shortcut is "+tempStr);
    } 
}