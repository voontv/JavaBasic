import java.util.*;

public class Exercise10{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        convertString(str);
    }

    public static void convertString(String str){
        char[] array;
        StringBuffer tempStr = new StringBuffer();
        array = str.toCharArray();

        for(int i=0; i<array.length; i++){
            if(Character.isDigit(array[i])){
                String number="";
                char c = array[i-1];

                for(int j=i; j<array.length; j++){
                    if(Character.isDigit(array[j])){
                        number+=array[j];
                    }
                    else{
                        i=j;
                        break;
                    }
                }

                for(int j=1; j<Integer.parseInt(number); j++){
                    tempStr = tempStr.append(c);
                }
            }
            else{
                tempStr = tempStr.append(array[i]);
            }
        }
        System.out.println("String  after shortcut is "+tempStr);
    }
}