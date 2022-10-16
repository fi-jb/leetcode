package fijb.leetcode.algorithms

// https://leetcode.com/problems/string-to-integer-atoi/
object A8StringToInteger {
    fun myAtoi(s: String): Int {
        var result = 0

        var sign: Int? = null
        var pointer = 0
        s.trim()
        for (i in s.indices) {
            if      (s[i] == ' ' && sign == null) continue
            else if (s[i] == '-' && sign == null) sign = -1
            else if (s[i] == '+' && sign == null) sign = +1
            else if (s[i].isDigit()) {
                pointer = i
                break
            } else {
                break
            }
        }

        val maxIntDiv10 = Int.MAX_VALUE / 10
        val minIntDiv10 = Int.MIN_VALUE / 10
        sign = sign?:1
        while (pointer < s.length && s[pointer].isDigit()) {
            val next = s[pointer++].toString().toInt()
            if (result > maxIntDiv10 || (result == maxIntDiv10 && next > 7)) return Int.MAX_VALUE
            if (result < minIntDiv10 || (result == minIntDiv10 && next > 8)) return Int.MIN_VALUE
            result = 10 * result + sign * next
        }

        return result
    }
}
