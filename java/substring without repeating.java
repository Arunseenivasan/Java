public class Main {
    public static void main(String[] args) {
        String S = "abcabcbb"; // Example input
        int result = lengthOfLongestSubstring(S);
        System.out.println("The length of the longest substring without repeating characters is: " + result);
    }

    public static int lengthOfLongestSubstring(String s) {
        String S2 = "";
        int maxLength = 0; 
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

           
            if (S2.contains(String.valueOf(currentChar))) {
                S2 = S2.substring(S2.indexOf(currentChar) + 1);
            }

            
            S2 = S2 + currentChar;

            
            maxLength = Math.max(maxLength, S2.length());
        }

        return maxLength;
    }
}