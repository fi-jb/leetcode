package fijb.leetcode.algorithms

//https://leetcode.com/problems/median-of-two-sorted-arrays/
object A4MedianOfTwoSortedArrays {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val nums = arrayListOf<Int>()
        var i1 = 0
        var i2 = 0

        val s = (nums1.size + nums2.size)
        while (i1 < nums1.size && i2 < nums2.size) {
            if (i1 + i2 > s) break
            if (nums1[i1] < nums2[i2]) nums.add( nums1[i1 ++] )
            else nums.add( nums2[i2 ++] )
        }

        val h = s / 2
        val h1 = minOf(nums1.size, h + 1)
        val h2 = minOf(nums2.size, h + 1)

        while (i1 < h1) nums.add( nums1[i1 ++] )
        while (i2 < h2) nums.add( nums2[i2 ++] )

        return if (s % 2 == 0) 0.5 * (nums[h - 1] + nums[h]) else nums[h].toDouble()
    }
}
