class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int min = 0;

        while (l < r) {
            // (left + right) / 2 may cause overflow for an int when both are huge
            int mid = l + (r - l) / 2;
            if (nums[mid] > nums[r]) {
                l = mid + 1;
            }
            else {
                r = mid;
            }
            min = mid;
        }

        return nums[l];
    }
}
