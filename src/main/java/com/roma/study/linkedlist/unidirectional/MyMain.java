package com.roma.study.linkedlist.unidirectional;

public class MyMain {

    public static void main(String[] args) {
        Unidirectional list = new Unidirectional();
        list.add("Roma");
        list.add("R");
        list.add("O");
        list.add("M");
        list.add("A");
        list.remove(0);
        list.set(0,"D");
        for (int i = 0; i < list.size; i++) {
            System.out.println(list.get(i));
        }

    }
}
