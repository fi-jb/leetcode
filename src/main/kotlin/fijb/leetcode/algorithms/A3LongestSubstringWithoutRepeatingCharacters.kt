package fijb.leetcode.algorithms

//https://leetcode.com/problems/longest-substring-without-repeating-characters/
object A3LongestSubstringWithoutRepeatingCharacters {
    fun lengthOfLongestSubstring(s: String): Int {
        var list = if (s.isEmpty()) mutableListOf() else mutableListOf(s.first())
        var result = list.size
        for (c in s.drop(1).toCharArray()) {
            val index = list.indexOf(c)
            if (index >= 0) list = list.drop(index + 1).toMutableList()
            list.add(c)
            result = maxOf(result, list.size)
        }
        return result
    }
}
