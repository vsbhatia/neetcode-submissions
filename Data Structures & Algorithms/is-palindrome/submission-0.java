class Solution {
    public boolean isPalindrome(String s) {
        String lower = s.toLowerCase();
        char[] replaced = new char[s.length()];
        int j = s.length() - 1;
        int i = 0;
        for (char c : lower.toCharArray()) {
            if (isValid(c)) {
                replaced[i] = c;
                i++;
            }
        }
        String replacedStr = new String(replaced).trim();
        return replacedStr.equals(reversed(replacedStr));
    }

    boolean isValid(char c) {
        return (c >= 48 && c <= 57) || (c >= 'a' && c <= 'z');
    }

    String reversed(String s) {
        char[] c = new char[s.length()];
        char[] og = s.toCharArray();
        int j = 0;
        for (int i = s.length() - 1; i >=0; i--) {
            
            c[j] = og[i];
            j++;
        }
        return new String(c);
    }
}
