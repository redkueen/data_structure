package com.xqh.data_structure;
public class Main2 {
    public static void main (String[]args){
      XqhArray xa = new XqhArray();
      xa.add(5);
      xa.add(7);
      xa.add(9);

      int k = xa.get(1);
      xa.removeLast();
      xa.display();
      int debug = 0;
    }
}
