package com.roma.study;

import java.util.ArrayList;
import java.util.LinkedList;

public class UserTest {
    public static void main(String[] args) {
        User roma = new User();
        roma.age = 29;
        roma.name = "Roma";
        System.out.println(roma.age );

        User ivan = new User();
        ivan.age = 22;
        ivan.name = "Ivan";

        LinkedList list = new LinkedList();
        list.add("one");
        list.add("two");
        list.add("three");

        list.remove(1);
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
