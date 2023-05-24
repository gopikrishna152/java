import java.util.List;
import java.util.Stack;

// This problem was asked by Google.
// Given the root to a binary tree,implement serialize(root),which serializes the tree into a string,and deserialize(s),which deserializes the string back into the tree.
// For example,given the following Node class
// class Node:
// def __init__(self, val, left=None, right=None):
//         self.val = val
//         self.left = left
//         self.right = right
// The following test should pass:
// node = Node('root', Node('left', Node('left.left')), Node('right'))
// assert deserialize(serialize(node)).left.left.val == 'left.left'

class TreeNode {
    TreeNode(int x) {
        int va = x;
    }

    // int val;
    TreeNode left;
    TreeNode right;

}

public class day3 {
    TreeNode root;

    public static String serialize(TreeNode root) {
        if (root == null) {
            return null;

        } else {
            Stack<TreeNode> s = new Stack<>();
            s.push(root);
            List<String> l = new ArrayList<>();

            {

            }
            ;

        }
    }

    public static void main(String args[]) {
        // Construct a tree shown in the above figure
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(20);
        tree.root.left = new TreeNode(8);
        tree.root.right = new TreeNode(22);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(12);
        tree.root.left.right.left = new TreeNode(10);
        tree.root.left.right.right = new TreeNode(14);

        String serialized = serialize(tree.root);
        System.out.println("Serialized view of the tree:");
        System.out.println(serialized);
        System.out.println();
    }

}
