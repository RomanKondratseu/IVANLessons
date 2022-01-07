package com.roma.study.tree;

public class Node {
    Node under;
    Node over;
    Object value;
    Comparable key;

    public Node(Comparable key, Object value, Node under, Node over) {
        this.key = key;
        this.value = value;
        this.under = under;
        this.over = over;
    }
}
