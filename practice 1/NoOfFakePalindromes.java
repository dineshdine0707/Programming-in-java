import java.util.*;

class FakePalindromeSubstrings {
    static int countFakePalindromes(String s) {
        int count = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            HashMap<Character, Integer> freqMap = new HashMap<>();

            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
                if (isFakePalindrome(freqMap)) {
                    count++;
                }
            }
        }

        return count;
    }
    private static boolean isFakePalindrome(HashMap<Character, Integer> freqMap) {
        int oddCount = 0;

        for (int freq : freqMap.values()) {
            if (freq % 2 != 0) {
                oddCount++;
            }
            if (oddCount > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aab";
        System.out.println("Count of fake palindrome substrings: " + countFakePalindromes(s));
    }
}
