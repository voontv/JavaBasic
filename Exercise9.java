import java.util.*;
public class Exercise9{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        shoortcutString(str);

    }
    public static void shoortcutString(String str){
        char[] array = new char[str.length()];
        String tempStr="";
        int count=1;
        array = str.toCharArray();
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    count++;
                    if(j==array.length-1){
                        tempStr = tempStr.concat(array[i]+"");
                        tempStr = tempStr.concat(count+"");
                        i=j-1;
                        break;
                    }
                }
                else{
                    tempStr = tempStr.concat(array[i]+"");
                    if(count>1){
                        tempStr = tempStr.concat(count+"");
                        count=1;
                        i=j-1;
                    }
                    break;
                }
            }
        }
        System.out.println("String after shortcut is "+tempStr);
    }
}