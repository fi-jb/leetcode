package fijb.leetcode.algorithms

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class A6ZigzagConversionTest {

    @Test
    fun convert1() {
        assertEquals("PAHNAPLSIIGYIR", A6ZigzagConversion.convert("PAYPALISHIRING", 3))
    }

    @Test
    fun convert2() {
        assertEquals("PINALSIGYAHRPI", A6ZigzagConversion.convert("PAYPALISHIRING", 4))
    }

    @Test
    fun convert3() {
        assertEquals("A", A6ZigzagConversion.convert("A", 1))
    }
}
