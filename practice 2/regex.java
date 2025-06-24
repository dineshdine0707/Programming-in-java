import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        String[] arr = {"File_1", "File_2", "File_3"};
        int result = matches(arr);
        System.out.println(result);
    }

    public static int matches(String[] arr) {
        Pattern pattern = Pattern.compile("^File_(\\d+)$");
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            Matcher matcher = pattern.matcher(arr[i]);
            if (matcher.matches()) {
                int num = Integer.parseInt(matcher.group(1));
                if (num > result)
                    result = num;
            }
        }
        return result;
    }
}
