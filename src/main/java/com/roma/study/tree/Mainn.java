package com.roma.study.tree;

public class Mainn {

    public static void main(String[] args) {
        CustomTree tree = new BinaryTree();
        tree.put(15, "fifteen");
        tree.put(16, "sixteen");
        tree.put(10, "ten");
        tree.put(11, "eleven");
        tree.put(5, "five");
        tree.put(3, "three");
        tree.put(1, "one");
        tree.put(4, "four");
        tree.put(8, "eight");
        tree.put(9, "nine");
        tree.put(7, "seven");
        tree.delete(16);
        System.out.println(tree.get(10));
    }
}
