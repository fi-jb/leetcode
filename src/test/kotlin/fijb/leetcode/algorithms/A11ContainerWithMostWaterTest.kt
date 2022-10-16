package fijb.leetcode.algorithms

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class A11ContainerWithMostWaterTest {

    @Test
    fun maxArea1() {
        assertEquals(49, A11ContainerWithMostWater.maxArea(intArrayOf(1,8,6,2,5,4,8,3,7)))
    }

    @Test
    fun maxArea2() {
        assertEquals(1, A11ContainerWithMostWater.maxArea(intArrayOf(1,1)))
    }
}