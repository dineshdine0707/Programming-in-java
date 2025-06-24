import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        String[] numbers = new String[n];
        
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextLine();
        }
        
        for (String str : numbers) {
            boolean value = isValid(str);
            System.out.println(value);
        }
    }

    public static boolean isValid(String str) {
        int start = 0;
        if (str.length() < 10) {
            return false;
        }
        if (str.startsWith("+91")) {
            if (str.indexOf("+91") != 0) {
                return false;
            } else {
                start = 3;
            }
        }
        if(str.charAt(0)!='0' && start!=3)
        {
            return false;
        }
        if (str.charAt(start) != '0' && str.charAt(start) != '7' && str.charAt(start) != '8' && str.charAt(start) != '9') {
            return false;
        }
        if(str.charAt(0)=='0')
        start=1;
        int count = 0;
        for (int i = start; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                if(count==0 || count==5)
                   continue; 
                else
                return false;
            } else if (!Character.isDigit(ch)) {
                return false;
            }
            count++;
        }
        return count == 10;
    }
}
