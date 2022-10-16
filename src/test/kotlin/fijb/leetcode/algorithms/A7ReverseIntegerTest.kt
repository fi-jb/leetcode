package fijb.leetcode.algorithms

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class A7ReverseIntegerTest {

    @Test
    fun reverse1() {
        assertEquals(321, A7ReverseInteger.reverse(123))
    }

    @Test
    fun reverse2() {
        assertEquals(-321, A7ReverseInteger.reverse(-123))
    }

    @Test
    fun reverse3() {
        assertEquals(21, A7ReverseInteger.reverse(120))
    }
}
