import java.util.*;

public class Exercise10{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        convertString(str);
    }

    public static void convertString(String str){
        StringBuffer buffer = new StringBuffer();
        char[] array = str.toCharArray();

        for(int i=0; i<array.length; i++){
            int count = 0;
            int j=i+1;
        
            // Tìm count 
            while(j<array.length && Character.isDigit(array[j])){
                 count = 10*count + array[j] - '0';
                 j ++;
            }
            count = count == 0? 1: count;
        
            //Thêm vào count ký tự
            for(int k=0; k<count; k++){
                buffer = buffer.append(array[i]);
            }
            i = j-1;
        }
        System.out.println("String  after shortcut is "+buffer);
    }
}