package fijb.leetcode.algorithms

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class A10RegularExpressionMatchingTest {

    @Test
    fun isMatch1() {
        assertEquals(false, A10RegularExpressionMatching.isMatch("aa", "a"))
    }

    @Test
    fun isMatch2() {
        assertEquals(true, A10RegularExpressionMatching.isMatch("aa", "a*"))
    }

    @Test
    fun isMatch3() {
        assertEquals(true, A10RegularExpressionMatching.isMatch("ab", ".*"))
    }
}