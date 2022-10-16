package fijb.leetcode.algorithms

// https://leetcode.com/problems/binary-tree-level-order-traversal/
object A102BinaryTreeLevelOrderTraversal {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val result = mutableListOf<MutableList<Int>>()

        if (root == null) return result

        traversal(root, 0, result)
        return result
    }

    fun traversal(node: TreeNode, level: Int, list: MutableList<MutableList<Int>>) {
        val nextLevel = level + 1
        if (list.size < nextLevel) list.add(mutableListOf())
        list[level].add(node.`val`)

        if (node.left != null) traversal(node.left as TreeNode, nextLevel, list)
        if (node.right != null) traversal(node.right as TreeNode, nextLevel, list)
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
