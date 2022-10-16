package fijb.leetcode.algorithms

// https://leetcode.com/problems/longest-palindromic-substring/
object A5LongestPalindromicSubstring {
    fun longestPalindrome(s: String): String {
        var max = Pair(0, 0)
        for (i in s.indices) max = maxPairOf(max, maxPairOf(getOddPair(s, i), getEvenPair(s, i)))
        return s.substring(max.first, max.second)
    }

    // "aba" for example
    private fun getOddPair(s: String, point: Int): Pair<Int, Int> {
        var i = 0
        while (point - i - 1 >= 0 && point + i + 1 <= s.length - 1 && s[point - i - 1] == s[point + i + 1]) i ++
        return Pair(maxOf(0, point - i), minOf(s.length, point + i) + 1)
    }

    // "abba" for example
    private fun getEvenPair(s: String, point: Int): Pair<Int, Int> {
        var i = 0
        if (point + 1 > s.length - 1 || s[point] != s[point + 1]) return Pair(0, 0)
        while (point - i - 1 >= 0 && point + i + 2 <= s.length - 1 && s[point - i - 1] == s[point + i + 2]) i ++
        return Pair(maxOf(0, point - i), minOf(s.length, point + i + 1) + 1)
    }

    private fun maxPairOf(p1: Pair<Int, Int>, p2: Pair<Int, Int>) =
        if (p1.second - p1.first >= p2.second - p2.first) p1 else p2
}
