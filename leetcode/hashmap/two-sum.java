/*
1. 两数之和
题目地址：https://leetcode.cn/problems/two-sum/
*/

class Solution {
    public int[] twoSum(int[] nums, int t) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i], b = t - a;
            if (map.containsKey(b)) return new int[]{map.get(b), i};
            map.put(a, i);
        }
        return new int[]{};
    }
}