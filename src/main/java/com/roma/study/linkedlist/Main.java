package com.roma.study.linkedlist;

import com.roma.study.linkedlist.bidirectional.BiDirectionalList;
import com.roma.study.linkedlist.unidirectional.Unidirectional;

public class Main {

    public static void main(String[] args) {
        CustomList list = new BiDirectionalList();
        list = new Unidirectional();
        Animal lionVasy = new Lion();
        Animal monkeygosha = new Monkey();
        Animal animal  = new Animal();
        animal.food();
    }

}
 class Animal  {
    public void food (
    ){
        System.out.println("Organik food");
    };

}
 class  Lion extends  Animal{
//    public void food(){
//        System.out.println("Meat");
//    }
 }
 class Monkey extends  Animal{
     public void food(){
         System.out.println("bananas");
     }
 }


