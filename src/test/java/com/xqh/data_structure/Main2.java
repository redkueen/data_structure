package com.xqh.data_structure;

import com.xqh.data_structure.dynamic_array.XqhArray;

public class Main2 {
    public static void main (String[]args){
      XqhArray xa = new XqhArray();
      xa.add(5);
      xa.add(7);
      xa.add(9);
      xa.add(14);
      int q1=xa.indexOfUsingReverseIndex(14);
      int q2=xa.indexOfUsingReverseIndex(7);
      xa.add(3);
      int q3=xa.indexOfUsingReverseIndex(3);
      System.out.println("14:" + q1 + ", 7:" + q2 + ", 3:" + q3);
      xa.add(11);

        int k = xa.get(1);
//	    xa.removeLast();
        xa.display();

        int m = xa.indexOf(9);
        System.out.println(m);

//        xa.createReverseIndex();
        int p1 = xa.indexOfUsingReverseIndex(7);
        xa.set(2,18);
        int p2 = xa.indexOfUsingReverseIndex(9);
        xa.removeLast();
      int p3 = xa.indexOfUsingReverseIndex(18);
        System.out.println("7:" + p1 + ", 9:" + p2 + ", 25:" + p3);
       int length = xa.length();
       int size = xa.size();
       int capacity = xa.capacity();
       xa.delete(2);
      int p4 = xa.indexOfUsingReverseIndex(25);
        int debug = 0;
    }
}
