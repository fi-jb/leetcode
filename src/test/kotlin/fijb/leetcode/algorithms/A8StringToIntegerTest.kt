package fijb.leetcode.algorithms

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class A8StringToIntegerTest {

    @Test
    fun myAtoi1() {
        assertEquals(42, A8StringToInteger.myAtoi("42"))
    }

    @Test
    fun myAtoi2() {
        assertEquals(-42, A8StringToInteger.myAtoi("   -42"))
    }

    @Test
    fun myAtoi3() {
        assertEquals(4193, A8StringToInteger.myAtoi("4193 with words"))
    }

    @Test
    fun myAtoi4() {
        assertEquals(0, A8StringToInteger.myAtoi("words and 987"))
    }

    @Test
    fun myAtoi5() {
        assertEquals(-2147483648, A8StringToInteger.myAtoi("-91283472332"))
    }

    @Test
    fun myAtoi6() {
        assertEquals(-2147483648, A8StringToInteger.myAtoi("-2147483649"))
    }

    @Test
    fun myAtoi7() {
        assertEquals(0, A8StringToInteger.myAtoi(".1"))
    }

    @Test
    fun myAtoi8() {
        assertEquals(0, A8StringToInteger.myAtoi("+-12"))
    }

    @Test
    fun myAtoi9() {
        assertEquals(0, A8StringToInteger.myAtoi("  +  413"))
    }
}
