package fijb.leetcode.algorithms

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class A1TwoSumTest {
    @Test
    fun twoSum1() {
        val actual = A1TwoSum.twoSum(intArrayOf(2, 7, 11, 15), 9)
        val expected = intArrayOf(0, 1)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun twoSum2() {
        val actual = A1TwoSum.twoSum(intArrayOf(3, 2, 4), 6)
        val expected = intArrayOf(1, 2)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun twoSum3() {
        val actual = A1TwoSum.twoSum(intArrayOf(3, 3), 6)
        val expected = intArrayOf(0, 1)
        assertArrayEquals(expected, actual)
    }

    @Test
    fun twoSum4() {
        val actual = A1TwoSum.twoSum(intArrayOf(-3, 4, 3, 90), 0)
        val expected = intArrayOf(0,2)
        assertArrayEquals(expected, actual)
    }
}
