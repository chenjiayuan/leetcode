/*
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0

==idea==
binary search
*/

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length, mid = 0;
        //binary search
        while(low < high) {
            mid = low + (high - low)/2;
            if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}