package fijb.leetcode.algorithms

//https://leetcode.com/problems/add-two-numbers/
object A2AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var result : ListNode? = null
        var it: ListNode? = null
        var it1 = l1
        var it2 = l2

        var dev = 0
        while (it1 != null) {
            var sum =
                if (it2 == null) it1.`val` + dev
                else it1.`val` + it2.`val` + dev
            dev = sum / 10
            sum %= 10
            if (result == null) {
                result = ListNode(sum)
                it = result
            }
            else {
                it?.next = ListNode(sum)
                it = it?.next
            }
            it1 = it1.next
            it2 = it2?.next
        }
        while (it2 != null) {
            var sum = it2.`val` + dev
            dev = sum / 10
            sum %= 10
            it?.next = ListNode(sum)
            it = it?.next
            it2 = it2.next
        }
        if (dev != 0) it?.next = ListNode(dev)

        return result
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null

        override fun toString(): String {
            val result = StringBuilder()
            var it : ListNode? = this

            while (it != null) {
                result.append("${it.`val`} ")
                it = it.next
            }
            return "[" + result.toString().trim().replace(" ", ",") + "]"
        }

        override fun equals(other: Any?): Boolean {
            var it1: ListNode? = this
            var it2: ListNode? = other as ListNode

            while (it1 != null) {
                if (it1.`val` != it2?.`val`) return false
                it1 = it1.next
                it2 = it2.next
            }
            if (it2 != null) return false
            return true
        }

        override fun hashCode(): Int {
            var result = `val`
            result = 31 * result + (next?.hashCode() ?: 0)
            return result
        }
    }
}
