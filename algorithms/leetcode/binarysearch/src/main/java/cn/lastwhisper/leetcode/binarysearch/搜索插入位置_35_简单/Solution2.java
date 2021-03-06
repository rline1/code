package cn.lastwhisper.leetcode.binarysearch.搜索插入位置_35_简单;

class Solution2 {
    /**
     * 题目地址：https://leetcode-cn.com/problems/search-insert-position/
     * -------------------------------------------------------------------
     * 思考：
     * -------------------------------------------------------------------
     * 思路：二分查找
     * -------------------------------------------------------------------
     * 时间复杂度：
     * 空间复杂度：
     */
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                // 中间
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        //起始和最后
        return left;
    }

    public static void main(String[] args) {

    }
}