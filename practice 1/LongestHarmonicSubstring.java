public class LongestHarmonicSubstring {
    public static int LHS(String str) {
        int i = 0;
        int maxLength = 0;
        while (i < str.length() - 1) {
            if (str.charAt(i) == 'a' && str.charAt(i + 1) == 'b') {
                String currStr = "ab";
                char expected = 'c';
                int length = 2;
                int j = i + 2;
                while (j+currStr.length() < str.length() && currStr.equals(str.substring(j,j+currStr.length())) && str.charAt(j+currStr.length()) == expected) {
                    currStr += expected;
                    length+=currStr.length();
                    j=j+currStr.length();
                    expected++;
                }
                maxLength = Math.max(maxLength, length);
                i = j;
            } else {
                i++;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(LHS("xxababcabcdjjababcabcfkggh"));
    }
}
