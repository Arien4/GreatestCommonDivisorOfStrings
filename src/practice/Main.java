package practice;

public class Main {

    public static void main(String[] args) {
	/*For two strings s and t, we say "t divides s" if and only if s = t + ... + t  (t concatenated with itself 1 or more times)

    Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.



    Example 1:

    Input: str1 = "ABCABC", str2 = "ABC"
    Output: "ABC"
    Example 2:

    Input: str1 = "ABABAB", str2 = "ABAB"
    Output: "AB"
    Example 3:

    Input: str1 = "LEET", str2 = "CODE"
    Output: ""
    Example 4:

    Input: str1 = "ABCDEF", str2 = "ABC"
    Output: ""


    Constraints:

    1 <= str1.length <= 1000
    1 <= str2.length <= 1000
    str1 and str2 consist of English uppercase letters.*/
        //String str1 = "NLZGMNLZGMNLZGMNLZGMNLZGMNLZGMNLZGMNLZGM";
        //String str2 = "NLZGMNLZGMNLZGMNLZGMNLZGMNLZGMNLZGMNLZGMNLZGM";
        //String str1 = "000000";
        //String str2 = "000";
        String str1 = "leet";
        String str2 = "code";
        //System.out.println(repeatedSubstringPattern(str1));
        //System.out.println(repeatedSubstringPattern(str2));

        System.out.println("The answer is " + gcdOfStrings(str1, str2));
    }

    public static String gcdOfStrings(String str1, String str2) {
        String pattern = "";
        int len = Math.min(str1.length(), str2.length());
        for (int i = 1; i <= len; i++) {

            if ((str1.replaceAll(str1.substring(0, i), "").length() == 0) && (str2.replaceAll(str1.substring(0, i), "").length() == 0)) {
                pattern = str1.substring(0, i);
            }
        }
        return pattern;
    }
}
