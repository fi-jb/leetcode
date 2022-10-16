package fijb.leetcode.algorithms

// https://leetcode.com/problems/reverse-integer/
object A7ReverseInteger {
    fun reverse(x: Int): Int {
        var result = 0

        val maxIntDiv10 = Int.MAX_VALUE / 10
        val minIntDiv10 = Int.MIN_VALUE / 10
        var input = x
        while (input != 0) {
            val next = input % 10
            if (result > maxIntDiv10 || (result == maxIntDiv10 && next >  7)) return 0
            if (result < minIntDiv10 || (result == minIntDiv10 && next < -8)) return 0
            result = result * 10 + next
            input /= 10
        }
        return result
    }
}
