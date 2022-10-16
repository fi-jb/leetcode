package fijb.leetcode.algorithms

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class A4MedianOfTwoSortedArraysTest {

    @Test
    fun findMedianSortedArrays1() {
        val median = A4MedianOfTwoSortedArrays.findMedianSortedArrays(intArrayOf(1, 3), intArrayOf(2))
        assertEquals(2.0, median)
    }

    @Test
    fun findMedianSortedArrays2() {
        val median = A4MedianOfTwoSortedArrays.findMedianSortedArrays(intArrayOf(1, 2), intArrayOf(3, 4))
        assertEquals(2.5, median)
    }

    @Test
    fun findMedianSortedArrays3() {
        val median = A4MedianOfTwoSortedArrays.findMedianSortedArrays(intArrayOf(), intArrayOf(1, 2, 3, 4))
        assertEquals(2.5, median)
    }
}
