package com.xqh.data_structure;
public class Main2 {
    public static void main (String[]args){
      XqhArray xa = new XqhArray();
      xa.add(5);
      xa.add(7);
      xa.add(9);
      xa.add(14);
      xa.add(3);
      xa.add(11);

        int k = xa.get(1);
//	    xa.removeLast();
        xa.display();

        int m = xa.indexOf(9);
        System.out.println(m);

        xa.createReverseIndex();
        int p1 = xa.indexOfUsingReverseIndex(7);
        int p2 = xa.indexOfUsingReverseIndex(9);
        System.out.println("7:" + p1 + ", 9:" + p2);
        int debug = 0;
    }
}
