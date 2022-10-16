package fijb.leetcode.algorithms

// https://leetcode.com/problems/zigzag-conversion/
object A6ZigzagConversion {
    fun convert(s: String, numRows: Int): String {
        if (numRows <= 0) throw IllegalArgumentException("numRows <= 0")
        if (numRows == 1) return s

        val list = mutableListOf<StringBuilder>()
        (0 until numRows).forEach { _ -> list.add(StringBuilder()) }

        var i = 0
        var j = 0
        var k = 0
        while (k < s.length) {
            if (j == 0) {
                list[i].append(s[k ++])
            } else if (j % (numRows - 1) == 0) {
                list[i].append(s[k ++])
            } else if ((i + j) % (numRows - 1) == 0) {
                list[i].append(s[k ++])
            }

            i ++
            if (i % numRows == 0) {
                i = 0
                j ++
            }
        }

        var result = ""
        list.forEach { result += it.toString() }
        return result
    }
}
