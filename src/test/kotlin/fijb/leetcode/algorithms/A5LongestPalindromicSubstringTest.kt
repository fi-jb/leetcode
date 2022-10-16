package fijb.leetcode.algorithms

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class A5LongestPalindromicSubstringTest {

    @Test
    fun longestPalindrome1() {
        assertEquals("bab", A5LongestPalindromicSubstring.longestPalindrome("babad"))
    }

    @Test
    fun longestPalindrome2() {
        assertEquals("bb", A5LongestPalindromicSubstring.longestPalindrome("cbbd"))
    }
}
