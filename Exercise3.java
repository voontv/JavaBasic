import java.util.*;

class Exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		printWord(s);
	}

	public static void printWord(String s) {
		for (String i : s.split(" ")) {
            if(!i.isEmpty())
            {
                i=removeSpecialCharacter(i);
                if (checkSymmetry(i)) {
                    System.out.println("Co chuoi ky tu doi xung");
                    break;
                }
            }
		}
	}

	public static boolean checkSymmetry(String s) {
        if(s.length()<2){
            return false; 
        } 
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i))
				return false;
		}
		return true;
    }

    public static String removeSpecialCharacter(String s){
        char lastIndex = s.charAt(s.length()-1);
        if(lastIndex == '?' || lastIndex == '.' || lastIndex == '!' || lastIndex == ',')
        {
            return s.substring(0,s.length()-1);
        }
        return s;

    }

    public boolean isEmpty(String str)
	{
		return str.length()==0;
	}
}
