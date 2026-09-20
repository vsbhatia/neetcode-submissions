class Solution {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        int cnt = 0;
        int j = 0;
        char[] exp = new char[Math.max(chars.length, 1)];
        boolean opened = false;
        int opn = 0;
        int cls = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            System.out.println("testing -> " + c);
            if (c == '(') {
                exp[j] = ')';
                opened = true;
                opn++;
            }
            else if (c == '[') {
                exp[j] = ']';
                opened = true;
                opn++;
            }
            else if (c == '{') {
                exp[j] = '}';
                opened = true;
                opn++;
            }
            
            else if (j - 1 < 0) {
                // System.out.println("j - 1 < 0");
                return false;
            }
            else {
                // System.out.println("j - 1 : " + (j - 1) + ", exp[j-1]: " + exp[j - 1] + ", c: " + c);
                if (exp[j-1] != c) {
                    return false;
                } else {
                    j--;
                    opened = false;
                    cls++;
                }
            }
            if (opened)
                j++;
        }
        if (j == chars.length)
            return false;
        if (opn != cls)
            return false;
        return true;
    }
}
