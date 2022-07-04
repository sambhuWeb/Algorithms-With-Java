package com.company.algorithm.binaryTree;

public class BinaryTree {
    public static void main(String[] args) {
        Node tree = createTree();
        System.out.println("*** Pre order Traversal ***");
        preOrderTraversal(tree);

        System.out.println("*** In order Traversal ***");
        inOrderTraversal(tree);

        System.out.println("*** Post order Traversal ***");
        postOrderTraversal(tree);
    }

    /**
     * First Visit Root
     * Second Visit Left
     * Third Visit Right
     */
    public static void preOrderTraversal(Node n)
    {
        if (n == null) return;

        System.out.println(n.value + " ");
        preOrderTraversal(n.left);
        preOrderTraversal(n.right);
    }

    /**
     * First Visit Left
     * Second Visit Root
     * Third Visit Right
     */
    public static void inOrderTraversal(Node n)
    {
        if (n == null) return;
        inOrderTraversal(n.left);
        System.out.println(n.value + " ");
        inOrderTraversal(n.right);
    }

    /**
     * First Visit Left
     * Second Visit Right
     * Third Visit Root
     */
    public static void postOrderTraversal(Node n)
    {
        if (n == null) return;
        postOrderTraversal(n.left);
        postOrderTraversal(n.right);
        System.out.println(n.value + " ");
    }

    public static Node createTree()
    {
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        Node e = new Node("e");
        Node f = new Node("f");
        Node g = new Node("g");

        a.left = b;
        a.right = g;
        b.left = c;
        b.right = d;
        c.left = e;
        e.right = f;

        return a;
    }
}
