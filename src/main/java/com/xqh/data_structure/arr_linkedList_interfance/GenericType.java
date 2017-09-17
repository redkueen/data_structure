package com.xqh.data_structure.arr_linkedList_interfance;

public class GenericType {
    public static void main(String[]args){
        XqhArray<Integer> xl=  new XqhArray<Integer>();
        xl.add(new Integer(5));
        xl.add(7);
        xl.add(71);
        xl.add(73);
        xl.add(75);
        xl.add(9);
        xl.display();
        Integer m = xl.get(1);
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


        XqhArray<String> xa2 = new XqhArray<String>();
        xa2.add("aaaa");

        XqhArray<User> xa3 = new XqhArray<User>();
        xa3.add(new User());
        User u = xa3.get(0);
    }

}

class User{

}
