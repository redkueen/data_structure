package com.xqh.data_structure.dynamic_array;

import com.xqh.data_structure.dynamic_array.XqhArray;

public class Main3 {
    public static void main (String[]args){
      XqhArray xa = new XqhArray();
      xa.add(5);
      xa.add(7);
      xa.add(9);
      xa.add(14);
      xa.add(3);
      xa.delete(2);
    }
}
