package fijb.leetcode.algorithms

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled

@Disabled
internal class A12IntegerToRomanTest {

    @Test
    fun intToRoman1() {
        assertEquals("III", A12IntegerToRoman.intToRoman(3))
    }

    @Test
    fun intToRoman2() {
        assertEquals("LVIII", A12IntegerToRoman.intToRoman(58))
    }

    @Test
    fun intToRoman3() {
        assertEquals("MCMXCIV", A12IntegerToRoman.intToRoman(1994))
    }
}