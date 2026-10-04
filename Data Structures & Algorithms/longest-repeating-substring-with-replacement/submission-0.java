class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int l = 0;
        int max = 0;

        for (int r = 0; r < s.length(); r++) {
            count[s.charAt(r) - 'A']++;

            while ((r - l + 1) - maxCount(count) > k) {
                count[s.charAt(l) - 'A']--;
                l++;
            }

            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}

private int maxCount(int[] count) {
    int best = 0;
    for (int c : count) {
        best = Math.max(best, c);
    }
    return best;
}
