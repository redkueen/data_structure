package com.xqh.data_structure.linked_list;

import com.xqh.data_structure.linked_list.XqhLinkedList;

public class XqhLinkedListMain {
    public static void main(String[]args){
       XqhLinkedList lit = new XqhLinkedList();
       lit.addFirst(2);
       lit.addFirst(5);
       lit.add(7);
       lit.add(15);
       lit.add(9);
       lit.display();
       lit.insert(3,18);
       lit.display();
       lit.insert(4,37);
       lit.set(5,30);
       lit.display();
       int element1 = lit.get(4);
       lit.removeLast();
       lit.removeLast();
       lit.display();
       lit.delete(2);
       lit.display();
    }
}
