package com.roma.study.linkedlist.bidirectional;

public class Node {
    int index ;
    Object data;
    Node next;
    Node prev;

    public Node (int index,Object data,Node next, Node prev){
        this.index = index;
        this.data = data;
        this.next = next;
        this.prev = prev;;
    }
}
