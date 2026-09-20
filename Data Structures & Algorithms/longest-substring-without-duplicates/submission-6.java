class Solution {
    public int lengthOfLongestSubstring(String s) {
        // String[] str = new String[s.length()];
        String maxStr = "";
        int cnt = 0;

        int max = 0;
        // int i = 0;
        for (char ch: s.toCharArray()) {
            String c = "" + ch;
            // if (str[i] == null)
            //     str[i] = "";
            // if (!str[i].contains(c)) {
            //     // System.out.println("appending " + c);
            //     // str[i] += c;
            //     maxStr += c;
            // } else {
            //     // System.out.println("duplicate found: " + str[i]);
            //     // max = str[i].length() > max ? str[i].length() : max;
            //     cnt = maxStr.length() > cnt ? maxStr.length() : cnt;
            //     maxStr = ""; 
            //     // i++;
            //     // str[i] = "";
            //     // str[i] += c;
            // }
            if (maxStr.contains(c)) {
                max = maxStr.length() > max ? maxStr.length() : max;
                maxStr = maxStr.substring(maxStr.indexOf(c) + 1);
                // System.out.println("duplicate found: " + c +", maxStr: " + maxStr);
                cnt = maxStr.length();
            }
            cnt++;
            max = cnt > max ? cnt : max;
            maxStr += c; 
            // System.out.println("appending '" + c + "'... cnt " + cnt + ", maxStr: '" + maxStr + "' ..., max: " + max);

        }
        return max;
    }
}
