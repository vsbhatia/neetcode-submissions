class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0; int j = i + 1;
        int sum = numbers[i] + numbers[j];
        int[] pos = new int[]{i + 1, j + 1};
        if (sum != target) {
            while (numbers[i] == numbers[j]) {
                i = j + 1; 
                j = i + 1;
            }
            while (sum != target) {
                sum = numbers[i] + numbers[j];
                pos = new int[]{i + 1, j + 1};
                j++;
                if (j == numbers.length || sum > target) {
                    i++; 
                    j = i + 1;
                }
            }
        }
        return pos;
        
    }
}
