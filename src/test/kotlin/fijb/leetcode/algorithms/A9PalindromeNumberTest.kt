package fijb.leetcode.algorithms

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class A9PalindromeNumberTest {

    @Test
    fun isPalindrome1() {
        assertEquals(true, A9PalindromeNumber.isPalindrome(121))
    }

    @Test
    fun isPalindrome2() {
        assertEquals(false, A9PalindromeNumber.isPalindrome(-121))
    }

    @Test
    fun isPalindrome3() {
        assertEquals(false, A9PalindromeNumber.isPalindrome(10))
    }

    @Test
    fun isPalindrome4() {
        assertEquals(true, A9PalindromeNumber.isPalindrome(12321))
    }

    @Test
    fun isPalindrome5() {
        assertEquals(true, A9PalindromeNumber.isPalindrome(123321))
    }

    @Test
    fun isPalindrome6() {
        assertEquals(false, A9PalindromeNumber.isPalindrome(121211))
    }
}