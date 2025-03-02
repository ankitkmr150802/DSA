package Lec2;

class Solution {
    public int beautySum(String s) {
        int result = 0;
        for (int length = 0; length < s.length(); length++)
        {
            int[] freq = new int[26];
            int maxFreq = 0;

            for (int j = length; j < s.length(); j++)
            {
                int charIndex = s.charAt(j) - 'a';
                freq[charIndex]++;

                maxFreq = Math.max(maxFreq, freq[charIndex]);
                int minFreq = Integer.MAX_VALUE;
                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        minFreq = Math.min(minFreq, freq[k]);
                    }
                }

                result += (maxFreq - minFreq);
            }
        }

        return result;
    }
}
