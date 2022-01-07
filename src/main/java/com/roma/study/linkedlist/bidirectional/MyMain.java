package com.roma.study.linkedlist.bidirectional;

public class MyMain {

    public static void main(String[] args) {
        BiDirectionalList list = new BiDirectionalList();
        list.add("R");
        list.add("O");
        list.add("M");
        list.add("A");
        list.add(0, "r");
        list.add(0, "r");
        list.add(1, "o");
        list.add(1, "o");
        list.add(2, "m");
        list.add(7, "a");
        for (int i = 0; i < list.size; i++) {
            System.out.println(list.get(i));
        }
    }

}


