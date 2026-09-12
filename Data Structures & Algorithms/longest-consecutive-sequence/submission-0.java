class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int max = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int j = 0;
                while (set.contains(num + j)) {
                    j++;
                }
                max = Math.max(max, j);
            }
        }

        return max;
    }
}
