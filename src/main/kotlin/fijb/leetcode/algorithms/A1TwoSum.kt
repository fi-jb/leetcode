package fijb.leetcode.algorithms

//https://leetcode.com/problems/two-sum/
object A1TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        nums.forEachIndexed { index, i -> map[i] = index }

        for (i in nums.indices) {
            val m = map[target - nums[i]]
            if (m != null && m != i) return intArrayOf(i, m)
        }
        return intArrayOf()
    }
}
