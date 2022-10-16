package fijb.leetcode.algorithms

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import fijb.leetcode.algorithms.A3LongestSubstringWithoutRepeatingCharacters as LSWRC

internal class A3LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    fun lengthOfLongestSubstring1() {
        assertEquals(3, LSWRC.lengthOfLongestSubstring("abcabcbb"))
    }

    @Test
    fun lengthOfLongestSubstring2() {
        assertEquals(1, LSWRC.lengthOfLongestSubstring("bbbbb"))
    }

    @Test
    fun lengthOfLongestSubstring3() {
        assertEquals(3, LSWRC.lengthOfLongestSubstring("pwwkew"))
    }

    @Test
    fun lengthOfLongestSubstring4() {
        assertEquals(6, LSWRC.lengthOfLongestSubstring("ohvhjdml"))
    }

    @Test
    fun lengthOfLongestSubstring5() {
        assertEquals(6, LSWRC.lengthOfLongestSubstring("ggububgvfk"))
    }

    @Test
    fun lengthOfLongestSubstring6() {
        assertEquals(0, LSWRC.lengthOfLongestSubstring(""))
    }

    @Test
    fun lengthOfLongestSubstring7() {
        assertEquals(1, LSWRC.lengthOfLongestSubstring(" "))
    }
}
