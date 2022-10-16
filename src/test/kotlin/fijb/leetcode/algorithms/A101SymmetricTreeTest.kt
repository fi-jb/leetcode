package fijb.leetcode.algorithms

import fijb.leetcode.algorithms.A101SymmetricTree.TreeNode
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class A101SymmetricTreeTest {

    @Test
    fun isSymmetric1() {
        val root =
            TreeNode(1)
                .addLeftNode(TreeNode(2)
                    .addLeftNode(TreeNode(3))
                    .addRightNode(TreeNode(4))
                )
                .addRightNode(TreeNode(2)
                    .addLeftNode(TreeNode(4))
                    .addRightNode(TreeNode(3))
                )
        assertEquals(true, A101SymmetricTree.isSymmetric(root))
    }

    @Test
    fun isSymmetric2() {
        val root =
            TreeNode(1)
                .addLeftNode(TreeNode(2)
                    .addRightNode(TreeNode(3))
                )
                .addRightNode(TreeNode(2)
                    .addRightNode(TreeNode(3))
                )
        assertEquals(false, A101SymmetricTree.isSymmetric(root))
    }
}
