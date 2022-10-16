package fijb.leetcode.algorithms

// https://leetcode.com/problems/symmetric-tree/
object A101SymmetricTree {
    fun isSymmetric(root: TreeNode?) = isSymmetric(root?.left, root?.right)

    private fun isSymmetric(x: TreeNode?, y: TreeNode?): Boolean = when {
            x == null && y == null -> true
            x?.`val`  != y?.`val`  -> false
            else -> isSymmetric(x?.left, y?.right) && isSymmetric(x?.right, y?.left)
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null

        fun addLeftNode(n: TreeNode): TreeNode {
            this.left = n
            return this
        }

        fun addRightNode(n: TreeNode): TreeNode {
            this.right = n
            return this
        }
    }
}
