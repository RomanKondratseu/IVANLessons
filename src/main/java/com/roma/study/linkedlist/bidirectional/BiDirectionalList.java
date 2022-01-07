package com.roma.study.linkedlist.bidirectional;

import com.roma.study.linkedlist.CustomList;

public class BiDirectionalList implements CustomList {
    Node head;
    Node tail;
    public int size;//todo Refactor

    public void add(Object data) {
        if (size == 0) {
            head = tail = new Node(0, data, null, null);
        } else {
            Node prevTail = tail;
            Node temp = new Node(prevTail.index + 1, data, null, prevTail);
            prevTail.next = temp;
            tail = temp;
        }
        size++;
    }

    public void add(int index, Object data) {
        if (size == 0) {
            head = tail = new Node(index, data, null, null);
            size++;
            return;
        } else if (index == 0) {
            Node newNode = new Node(index, data, head, null);
            head.prev = newNode;
            head = newNode;
            Node currentNode2 = head;
            while (currentNode2.next != null) {
                currentNode2 = currentNode2.next;
                currentNode2.index++;
            }
            size++;
            return;
        }
        if (index == size) {
            Node prevTail = tail;
            Node newNode = new Node(index, data, null, prevTail);
            tail.next = newNode;
            tail = newNode;
            size++;
            return;
        }
        if (index >= size / 2) {
            Node currentNode1 = tail;
            while (currentNode1.index != index) {
                currentNode1 = currentNode1.prev;
            }
            Node newNode = new Node(index, data, currentNode1, currentNode1.prev);
            currentNode1.prev.next = newNode;
            currentNode1.prev = newNode;
            Node currentNode2 = newNode;
            while (currentNode2.next != null) {
                currentNode2 = currentNode2.next;
                currentNode2.index++;
            }
        } else {
            Node currentNode1 = head;
            while (currentNode1.index != index) {
                currentNode1 = currentNode1.next;
            }
            Node newNode = new Node(index, data, currentNode1, currentNode1.prev);
            currentNode1.prev.next = newNode;
            currentNode1.prev = newNode;
            Node currentNode2 = newNode;
            while (currentNode2.next != null) {
                currentNode2 = currentNode2.next;
                currentNode2.index++;
            }
        }
        size++;
    }

    public void remove(int index) {
        if (index == 0) {
            head = head.next;
            head.index--;
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
                currentNode.index--;
            }
            size--;
            return;
        }
        if (index >= size / 2) {
            Node currentNode = tail;
            Node afterNode = currentNode;
            while (currentNode.index != index) {
                afterNode = currentNode;
                currentNode = currentNode.prev;
            }
            currentNode = afterNode;
            currentNode.index = index;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
                currentNode.index--;
            }
        } else {
            Node currentNode = head;
            Node preNode = currentNode;
            while (currentNode.index != index) {
                preNode = currentNode;
                currentNode = currentNode.next;
            }
            preNode.next = currentNode.next;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
                currentNode.index--;
            }
        }
        size--;
    }

    public Object get(int index) {
        Node currentNode = tail;
        if (index >= size / 2) {
            while (currentNode.prev != null) {
                currentNode = currentNode.prev;
                if (currentNode.index == index) {
                    return currentNode.data;
                }
            }
            if (index == tail.index) {
                return tail.data;
            }
        } else {
            currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
                if (currentNode.index == index) {
                    return currentNode.data;
                }
            }
        }
        if (index == 0) {
            return head.data;
        }
        return null;
    }

    public void set(int index, Object data) {
        if (index == 0) {
            head.data = data;
        }
        if (index > size / 2) {
            Node currentNode = tail;
            while (currentNode.index != index) {
                currentNode = currentNode.prev;
            }
            currentNode.data = data;
        } else {
            Node currentNode = head;
            while (currentNode.index != index) {
                currentNode = currentNode.next;
            }
            currentNode.data = data;
        }
    }
}


