package com.roma.study.linkedlist.unidirectional;

import com.roma.study.linkedlist.CustomList;

import java.util.ArrayList;

public class Unidirectional implements CustomList {
    Node root;
    int size;

    public void add(Object data) {
        if (root == null) {
            root = new Node(0, data, null);
        } else {
            Node currentNode = root;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node(currentNode.index + 1, data, null);

        }
        size++;
    }


    public Object get(int index) {
        Node currentNode = root;
        if(index == 0){
            return root.data;
        }
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            if (currentNode.index == index) {
                return currentNode.data;
            }
        }
        return null;//todo refactor
    }

    public void remove(int index) {
        if(index == 0){
            Node currentNode = new Node (index,root.next.data,root.next);
            root = currentNode;
            while(currentNode.next!=null){
                currentNode = currentNode.next;
                currentNode.index--;
            }
        }
        else {
            Node currentNode = root;
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
        public void set(int index, Object data){
           Node currentNode = root;
            while (currentNode.index != index){
                currentNode = currentNode.next;
            }
            currentNode.data = data;
        }
    }
