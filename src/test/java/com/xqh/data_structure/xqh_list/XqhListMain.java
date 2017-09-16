package com.xqh.data_structure.xqh_list;

import com.xqh.data_structure.arr_linkedList_interfance.XqhList;
import com.xqh.data_structure.arr_linkedList_interfance.XqhArray;

public class XqhListMain {
    public static void main(String[]args){
        XqhList xl= (XqhList) new XqhArray();
        xl.add(5);
        xl.add(7);
        xl.add(71);
        xl.add(73);
        xl.add(75);
        xl.add(9);
        xl.display();
        int m = xl.get(1);
        System.out.println(m);
        xl.insert(2,10);
        xl.display();
        xl.delete(1);
        xl.display();
        xl.set(2,8);
        xl.display();
        xl.insert(3,12);
        xl.display();
        xl.removeLast();
        xl.display();
    }
}
