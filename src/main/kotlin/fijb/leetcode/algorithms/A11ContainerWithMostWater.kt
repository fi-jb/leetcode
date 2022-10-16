package fijb.leetcode.algorithms

// https://leetcode.com/problems/container-with-most-water/
object A11ContainerWithMostWater {
    fun maxArea(height: IntArray): Int {
        var result = 0
        var i = 0
        var j = height.size - 1

        while (i < j) {
            result = kotlin.math.max(result, (j - i) * kotlin.math.min(height[i], height[j]))
            when (height[i] < height[j]) {
                true  -> i ++
                false -> j --
            }
        }
        return result
    }
}