package fijb.leetcode.algorithms

import fijb.leetcode.algorithms.A2AddTwoNumbers.ListNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class A2AddTwoNumbersTest {
    @Test
    fun addTwoNumbers1() {
        val l1 = intArrayOf(2, 4, 3).toListNode()
        val l2 = intArrayOf(5, 6, 4).toListNode()
        assertEquals(intArrayOf(7, 0, 8).toListNode(), A2AddTwoNumbers.addTwoNumbers(l1, l2))
    }

    @Test
    fun addTwoNumbers2() {
        val l1 = intArrayOf(0).toListNode()
        val l2 = intArrayOf(0).toListNode()
        assertEquals(intArrayOf(0).toListNode(), A2AddTwoNumbers.addTwoNumbers(l1, l2))
    }

    @Test
    fun addTwoNumbers3() {
        val l1 = intArrayOf(9,9,9,9,9,9,9).toListNode()
        val l2 = intArrayOf(9,9,9,9).toListNode()
        assertEquals(intArrayOf(8,9,9,9,0,0,0,1).toListNode(), A2AddTwoNumbers.addTwoNumbers(l1, l2))
    }

    private fun IntArray.toListNode(): ListNode {
        val it = this.iterator()
        val result = ListNode(it.next())
        var n = result
        while (it.hasNext()) {
            n.next = ListNode(it.next())
            n = n.next!!
        }
        return result
    }
}
