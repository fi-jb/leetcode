package fijb.leetcode.algorithms

import fijb.leetcode.algorithms.A102BinaryTreeLevelOrderTraversal.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class A102BinaryTreeLevelOrderTraversalTest {

    @Test
    fun levelOrder1() {
        val root =
            TreeNode(3)
                .addLeftNode(TreeNode(9))
                .addRightNode(
                    TreeNode(20)
                        .addLeftNode(TreeNode(15))
                        .addRightNode(TreeNode(7))
                )
        assertEquals(
            listOf(listOf(3), listOf(9, 20), listOf(15, 7)),
            A102BinaryTreeLevelOrderTraversal.levelOrder(root)
            )
    }

    @Test
    fun levelOrder2() {
        val root = TreeNode(1)
        assertEquals(
            listOf(listOf(1)),
            A102BinaryTreeLevelOrderTraversal.levelOrder(root)
        )
    }

    @Test
    fun levelOrder3() {
        val root = null
        assertEquals(
            listOf<List<Int>>(),
            A102BinaryTreeLevelOrderTraversal.levelOrder(root)
        )
    }
}
