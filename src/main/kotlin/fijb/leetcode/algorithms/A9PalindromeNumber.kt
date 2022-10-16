package fijb.leetcode.algorithms

// https://leetcode.com/problems/palindrome-number/
object A9PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        if (x < 10) return true

        var next = x
        val a = mutableListOf<Int>()
        do {
            a.add(next % 10)
            next /= 10
        } while (next != 0)
        for (i in 0..a.size/2) {
            if (a[i] != a[a.size - 1 - i]) return false
        }
        return true
    }
}