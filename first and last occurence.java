class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        
        int fidx = -1;
        int lasidx = -1;
        
        // Find the first occurrence
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                fidx = mid;
                r = mid - 1;  // continue searching to the left for the first occurrence
            }
        }
        
        // Find the last occurrence if the first occurrence was found
        if (fidx != -1) {
            l = fidx;  // Start search for last occurrence from fidx to end of array
            r = nums.length - 1;
            while (l <= r) {
                int mid = (l + r) / 2;
                if (nums[mid] < target) {
                    l = mid + 1;
                } else if (nums[mid] > target) {
                    r = mid - 1;
                } else {
                    lasidx = mid;
                    l = mid + 1;  // continue searching to the right for the last occurrence
                }
            }
        }
        
        return new int[]{fidx, lasidx};
    }
}
